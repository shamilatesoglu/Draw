// Copyright (c) 2021 M. Samil Atesoglu
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package msa.lang.draw.runtime;

import msa.lang.draw.ast.node.*;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.runtime.exception.DependencyNotFoundException;

import java.util.Map;

public class ExpressionEvaluatingASTVisitor extends DrawBaseASTVisitor<Double> {

    private final Map<String, Double> inputs;

    public ExpressionEvaluatingASTVisitor(Map<String, Double> inputs) {
        this.inputs = inputs;
    }

    @Override
    public Double visit(InfixExpressionASTNode node) {

        switch (node.getOperator()) {
            case DrawLexer.OPERATOR_ADD:
                return visit(node.getLeft()) + visit(node.getRight());
            case DrawLexer.OPERATOR_SUB:
                return visit(node.getLeft()) - visit(node.getRight());
            case DrawLexer.OPERATOR_MUL:
                return visit(node.getLeft()) * visit(node.getRight());
            case DrawLexer.OPERATOR_DIV:
                return visit(node.getLeft()) / visit(node.getRight());
            case DrawLexer.OPERATOR_EXP:
                return Math.pow(visit(node.getLeft()), visit(node.getRight()));
            case DrawLexer.OPERATOR_AND:
                return (visit(node.getLeft()) == 1.0) && (visit(node.getRight()) == 1.0) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_BITWISE_AND:
                return (double) (((visit(node.getLeft()).intValue())) & ((visit(node.getRight())).intValue()));
            case DrawLexer.OPERATOR_OR:
                return (visit(node.getLeft()) == 1.0) || (visit(node.getRight()) == 1.0) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_XOR:
                return (double) (((visit(node.getLeft()).intValue())) ^ ((visit(node.getRight())).intValue()));
            case DrawLexer.OPERATOR_GT:
                return (visit(node.getLeft()) > visit(node.getRight())) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_LT:
                return (visit(node.getLeft()) < visit(node.getRight())) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_GTEQ:
                return (visit(node.getLeft()) >= visit(node.getRight())) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_LTEQ:
                return (visit(node.getLeft()) <= visit(node.getRight())) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_EQ:
                return (visit(node.getLeft()).equals(visit(node.getRight()))) ? 1.0 : 0.0;
            case DrawLexer.OPERATOR_NEQ:
                return (!visit(node.getLeft()).equals(visit(node.getRight()))) ? 1.0 : 0.0;
        }
        return 0.0;
    }

    @Override
    public Double visit(NegationASTNode node) {
        return -visit(node.getInnerNode());
    }

    @Override
    public Double visit(IntegerASTNode node) {
        return node.getValue().doubleValue();
    }

    @Override
    public Double visit(RealNumberASTNode node) {
        return node.getValue();
    }

    @Override
    public Double visit(ReferenceASTNode node) {
        String reference = node.getId();
        if (!inputs.containsKey(reference))
            throw new DependencyNotFoundException(reference);
        return inputs.get(reference);
    }
}

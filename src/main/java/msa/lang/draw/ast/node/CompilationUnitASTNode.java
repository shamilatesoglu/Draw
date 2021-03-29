package msa.lang.draw.ast.node;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeNode;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnitASTNode  extends DrawAbstractSyntaxTreeNode {
    private final List<StatementASTNode> statements;

    public CompilationUnitASTNode() {
        this.statements = new ArrayList<>();
    }

    public List<StatementASTNode> getStatements() {
        return statements;
    }
}

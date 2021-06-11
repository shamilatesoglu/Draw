package msa.lang.draw.ast.node;

import java.util.ArrayList;
import java.util.List;

public class WhileASTNode extends StatementASTNode {
    private final ExpressionASTNode check;
    private final List<StatementASTNode> statements;

    public WhileASTNode(ExpressionASTNode check) {
        this.check = check;
        this.statements = new ArrayList<>();
    }

    public ExpressionASTNode getCheck() {
        return check;
    }

    public List<StatementASTNode> getStatements() {
        return statements;
    }
}

package msa.lang.draw.ast.node;

import java.util.ArrayList;
import java.util.List;

public class RepeatASTNode extends StatementASTNode {
    private final ExpressionASTNode nExpression;

    private final List<StatementASTNode> statements;

    public RepeatASTNode(ExpressionASTNode nExpression) {
        this.nExpression = nExpression;
        this.statements = new ArrayList<>();
    }


    public ExpressionASTNode getNExpression() {
        return nExpression;
    }

    public List<StatementASTNode> getStatements() {
        return statements;
    }
}


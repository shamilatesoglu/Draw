package msa.lang.draw.ast.node;

import java.util.List;

public class IfASTNode extends StatementASTNode {
   private ExpressionASTNode check;
   private StatementASTNode  primary;
   private StatementASTNode  secondary;

    public IfASTNode(ExpressionASTNode check, StatementASTNode primary, StatementASTNode secondary) {
        this.check = check;
        this.primary = primary;
        this.secondary = secondary;
    }

    public ExpressionASTNode getCheck() {
        return check;
    }

    public StatementASTNode getPrimary() {
        return primary;
    }

    public StatementASTNode getSecondary() {
        return secondary;
    }
}

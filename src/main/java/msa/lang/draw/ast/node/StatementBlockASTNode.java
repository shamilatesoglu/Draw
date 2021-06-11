package msa.lang.draw.ast.node;

import java.util.ArrayList;
import java.util.List;

public class StatementBlockASTNode extends StatementASTNode{
    private final List<StatementASTNode> statements;

    public StatementBlockASTNode() {
        this.statements = new ArrayList<>();
    }

    public List<StatementASTNode> getStatements() {
        return statements;
    }
}

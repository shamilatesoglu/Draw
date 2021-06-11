package msa.lang.draw.ast.node;

import java.util.ArrayList;
import java.util.List;

public class DepictDeclarationASTNode extends StatementASTNode {
    private final String identifier;
    private final List<String> parameterList;
    private final List<StatementASTNode> statements;

    public DepictDeclarationASTNode(String identifier) {
        this.identifier = identifier;
        this.statements = new ArrayList<>();
        this.parameterList = new ArrayList<>();
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<StatementASTNode> getStatements() {
        return statements;
    }

    public List<String> getParameterList() {
        return parameterList;
    }
}

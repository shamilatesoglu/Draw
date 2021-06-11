package msa.lang.draw.ast.node;

import java.util.ArrayList;
import java.util.List;

public class DepictCallASTNode extends StatementASTNode {
    private final ReferenceASTNode reference;
    private final List<ExpressionASTNode> actualParameterList;

    public DepictCallASTNode(ReferenceASTNode reference) {
        this.reference = reference;
        this.actualParameterList = new ArrayList<>();
    }

    public ReferenceASTNode getReference() {
        return reference;
    }

    public List<ExpressionASTNode> getActualParameterList() {
        return actualParameterList;
    }
}

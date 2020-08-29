package behavioral.visitor;

public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Defender defender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);
}

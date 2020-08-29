package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class AtvShippingVisitor implements AtvPartVisitor {
    private double shippingAmount;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels added");
    }

    @Override
    public void visit(Defender defender) {
        shippingAmount += 30;
        System.out.println("Defender added");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 5;
        System.out.println("Oil added");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Shipping amount is " + shippingAmount);
    }
}

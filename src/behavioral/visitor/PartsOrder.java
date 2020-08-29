package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {
    List<AtvPart> atvPartList = new ArrayList<>();

    public void addPart(AtvPart atvPart){
        atvPartList.add(atvPart);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for(AtvPart atvPart :  atvPartList){
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}

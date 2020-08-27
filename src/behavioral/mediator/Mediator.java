package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<Light> lights = new ArrayList<>();

    public void registerLight(final Light light){
        lights.add(light);
    }

    public void turnOnAllLights() {
        for (Light curLight : allLights) {
            if(curLight.isOn()){
              curLight.toggle();
            }
       }
    }

}
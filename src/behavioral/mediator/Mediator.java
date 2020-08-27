package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light){
        lights.add(light);
    }

    public void turnOnAllLights() {
        for (Light curLight : lights) {
            if(!curLight.isOn()){
              curLight.on();
            }
       }
    }

}
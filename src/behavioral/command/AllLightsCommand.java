package behavioral.command;

import java.util.List;

public class AllLightsCommand implements Command {
    private final List<Light> allLights;

    public AllLightsCommand(final List<Light> allLights) {
        this.allLights = allLights;
    }

    @Override
    public void execute() {
        for (Light curLight : allLights) {
            curLight.toggle();
       }
    }
    
    
}
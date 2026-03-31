package lambdaExpressions;

@FunctionalInterface
interface LightAction{
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> System.out.println("Lights ON at full brightness");

        LightAction timeOfDay = () -> System.out.println("Light on at dim node");

        LightAction voiceCommands = () -> System.out.println("Lights set to warm ambiance");

        executeLightAction(motionTrigger);
        executeLightAction(voiceCommands);
        executeLightAction(timeOfDay);

    }
    public static void executeLightAction(LightAction action){
        action.activate();
    }
}

import java.util.LinkedHashMap;

public class RandomEvent {
    String prompt;
    LinkedHashMap<String, Integer> responses;
    public RandomEvent(String prompt, LinkedHashMap<String, Integer> options){
        this.prompt=prompt;
        this.responses=options;
    }
    public LinkedHashMap<String, Integer> getResponses() {
        return responses;
    }

    public String getPrompt() {
        return prompt;
    }
}

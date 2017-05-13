import java.util.*;

public class Main {
    static int difficulty=0;
    List<RandomEvent> events = new ArrayList<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("" +
                "############################################\n" +
                "#Welcome to the American Dream Simulation! #\n" +
                "############################################\n\n" +
                "Please enter one of the following difficulties:\n" +
                "Hopeful\n" +
                "Realistic\n" +
                "");
        while (true) {
            String diffInput = scan.next();
            if(diffInput.equalsIgnoreCase("Hopeful")){
                System.out.println("Hopeful difficulty selected!");
                difficulty = 0;
                break;
            } else if(diffInput.equalsIgnoreCase("Realistic")){
                System.out.println("Realistic difficulty selected!");
                difficulty=1;
                break;
            } else {
                System.out.println("You did not enter a valid difficulty! Pick Realistic or Hopeful.");
            }
        }
        startGame();
    }
    public static void startGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's get started! The game is simple. You will be presented with random situations as you p" +
                "progress through your life. At each event, you will be given a series of decisions to make, some will" +
                "increase your odds of success, some with decrease, and some will do nothing. As your play the game, you" +
                "will remain unaware of your progress; you will not be told how your actions impact your success. " +
                "The game focuses on year 5-30 of your life and at the end, you will find out if you succeed." +
                "Without further adieu, type \"begin\" to start playing. ");
        while(true){
            String diffInput = scan.next();
            if(diffInput.equalsIgnoreCase("begin"))
                break;
            else
                System.out.println("Type \"begin\" to start the game");
        }

    }

    public void initEvents(){
        events.add
        //event.add(events)

    }

    public RandomEvent getEvent(HashMap<String, List<String>> input /*TODO: add in weights*/ ) {
        RandomEvent event = null;


        if(event != null)
            return event;
        else
            return null;
    }
}

import java.util.EventListener;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
//        MonsterDefeat dave = new MonsterDefeat("Devil eye Dave",5,true);
//
//        TreasureFound bonneyGirl = new TreasureFound("Bonney Girl","legendary");
//
//        System.out.println(dave.getSummary());
//
//        System.out.println(bonneyGirl.getSummary());


//        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, false);
//        ScoreEvent event2 = new TreasureFound("Sapphire", "rare");
//
//        System.out.println(event1.getSummary());
//
//        System.out.println(event2.getSummary());

        Scanner scanner = new Scanner(System.in);


        QuestLog questLog = new QuestLog();

//        mainMenu();

// Monster defeats
//        questLog.addEvent(new MonsterDefeat("Angry Chicken", 2, false));
//        questLog.addEvent(new MonsterDefeat("Goblin Intern", 1, false));
//        questLog.addEvent(new MonsterDefeat("Karen the Dragon", 5, true));
//
// Treasure found
//        questLog.addEvent(new TreasureFound("Cursed Rubber Duck", "common"));
//        questLog.addEvent(new TreasureFound("Golden Sandwich", "rare"));
//        questLog.addEvent(new TreasureFound("Legendary Left Sock", "legendary"));
//
// Traps triggered
//        questLog.addEvent(new TrapTriggered("Banana Peel of Doom", 2));
//        questLog.addEvent(new TrapTriggered("Lego Floor Trap", 4));
//
// Rooms explored
//        questLog.addEvent(new RoomExplored("Grandma's Secret Basement", true));
//        questLog.addEvent(new RoomExplored("Abandoned Meme Archive", false));
//
// Print everything
//        questLog.printSummary();

//    }
//    public static void mainMenu(){

        String mainMenu = """
                =======================================================
                                       Quest Impossible
                =======================================================
                1) Add monster defeat
                2) Add treasure found
                3) Add trap triggered
                4) Add room explored
                5) View quest log
                0) Quit""";
        boolean running = true;

        do{
            System.out.println(mainMenu);
            int userInput = Integer.parseInt(scanner.nextLine());

            switch ((userInput)) {
                case 1:
                    questLog.addEvent(new MonsterDefeat("Angry Chicken", 2, false));
                    questLog.addEvent(new MonsterDefeat("Goblin Intern", 1, false));
                    questLog.addEvent(new MonsterDefeat("Karen the Dragon", 5, true));
                    break;
                case 2:
                    questLog.addEvent(new TreasureFound("Cursed Rubber Duck", "common"));
                    questLog.addEvent(new TreasureFound("Golden Sandwich", "rare"));
                    questLog.addEvent(new TreasureFound("Legendary Left Sock", "legendary"));
                    break;
                case 3:
                    questLog.addEvent(new TrapTriggered("Banana Peel of Doom", 2));
                    questLog.addEvent(new TrapTriggered("Lego Floor Trap", 4));
                    break;
                case 4:
                    questLog.addEvent(new RoomExplored("Grandma's Secret Basement", true));
                    questLog.addEvent(new RoomExplored("Abandoned Meme Archive", false));
                    break;
                case 5:
                    questLog.printSummary();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Are you trying to break the game?");
            }
        } while(running);

    }




}

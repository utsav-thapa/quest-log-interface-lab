public class Program {
    public static void main(String[] args) {
//        MonsterDefeat dave = new MonsterDefeat("Devil eye Dave",5,true);
//
//        TreasureFound bonneyGirl = new TreasureFound("Bonney Girl","legendary");
//
//        System.out.println(dave.getSummary());
//
//        System.out.println(bonneyGirl.getSummary());


        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, false);
        ScoreEvent event2 = new TreasureFound("Sapphire", "rare");

        System.out.println(event1.getSummary());

        System.out.println(event2.getSummary());
    }
}

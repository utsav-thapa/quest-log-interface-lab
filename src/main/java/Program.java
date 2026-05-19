public class Program {
    public static void main(String[] args) {
        MonsterDefeat dave = new MonsterDefeat("Devil eye Dave",5,true);

        TreasureFound bonneyGirl = new TreasureFound("Bonney Girl","legendary");

        System.out.println(dave.getSummary());

        System.out.println(bonneyGirl.getSummary());
    }
}

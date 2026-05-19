public class MonsterDefeat {
    private String monsterName;
    private int difficultyLevel;
    private boolean boss;

    public MonsterDefeat(String monsterName, int difficultyLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    public String getName(){
        return this.monsterName;
    }

    public int getPoints(){
        int points = difficultyLevel * 50;
        if (boss) {
            return points + 100;
        }
        return points;
    }

    public String getSummary(){
        return "Defeated " + this.monsterName + " for " + getPoints() + " points.";
    }
}

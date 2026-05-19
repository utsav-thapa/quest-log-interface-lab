public class TrapTriggered implements ScoreEvent {
private String trapName;
private int damage;

    public TrapTriggered(String trapName, int damage) {
        this.trapName = trapName;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.trapName;
    }

    @Override
    public int getPoints() {
        return damage * -10;
    }

    @Override
    public String getSummary() {
        return "Triggered " + this.trapName + " for " + getPoints() + " points.";
    }
}

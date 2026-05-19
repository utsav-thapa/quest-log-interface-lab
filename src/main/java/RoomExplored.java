public class RoomExplored implements ScoreEvent {
    private String roomName;
    private boolean secretFound;

    public RoomExplored(String roomName, boolean secretFound) {
        this.roomName = roomName;
        this.secretFound = secretFound;
    }

    @Override
    public String getName() {
        return this.roomName;
    }

    @Override
    public int getPoints() {
        int points = 20;
        if (secretFound){
            points += 40;
        }
        return points;
    }

    @Override
    public String getSummary() {
        return "Explored " + this.roomName + " for " + getPoints() + " points.";
    }
}

import java.util.ArrayList;
import java.util.List;

public class QuestLog {
    private List<ScoreEvent> events;

    public QuestLog() {
        this.events = new ArrayList<>();
    }

    public void addEvent(ScoreEvent event){
        events.add(event);

    }

    public int getTotalScore() {
        int totalScore = 0;
        for ( ScoreEvent a : events ){
            totalScore += a.getPoints();
        }
        return totalScore;
    }

    public ScoreEvent getHighestScoringEvent(){
        if (events.isEmpty()){
            return null;
        }
        ScoreEvent highest = events.get(0);

        for (ScoreEvent a : events){
            if (a.getPoints() > highest.getPoints()){
                highest = a ;
            }
        }
        return highest;

    }
    public ScoreEvent getLowestScoringEvent(){
        if (events.isEmpty()){
            return null;
        }
        ScoreEvent lowest = events.get(0);

        for (ScoreEvent a : events){
            if (a.getPoints() < lowest.getPoints()){
                lowest = a ;
            }
        }
        return lowest;

    }

    public void printSummary(){
        String outputHead = """
                QUEST LOG
                -------------------------------------""";
        System.out.println(outputHead);
        int number = 1;

        for (ScoreEvent a : events){
            System.out.println(number + ". " + a.getSummary());
            number += 1;
        }

        String outputFooter = """
                 -------------------------------------""";
        System.out.println(outputFooter);
        System.out.println("Total Score: " + getTotalScore());
        System.out.println("Best event: " + getHighestScoringEvent().getSummary());
        System.out.println("Worst event: " + getLowestScoringEvent().getSummary());

    }
}

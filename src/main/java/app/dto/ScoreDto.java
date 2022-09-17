package app.dto;

import app.impl.ScoreManager;
import app.interfaces.IScoreManager;

public class ScoreDto {

    private EventType eventType;
    private int player2Score;
    private int player1Score;




    public ScoreDto setIfLoveOrAll(ScoreDto theScore, GameState state) {
        if( state.getPlayer1Score() < 4
                && state.getPlayer2Score() < 4
                && !( state.getPlayer1Score() + state.getPlayer2Score() == 6)) {
            theScore.setEventType(EventType.LOVE_OR_ALL);
        } else {
            theScore.setEventType(EventType.OTHERS);
        }
        return theScore;

    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }


    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }


    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }


    public String getScore(ScoreDto theScore, GameState state) {
        // Polymorphism
        IScoreManager scoreManager = new ScoreManager(theScore, state);
        return scoreManager.getScore().scoreTextGetter();
    }


}

package app;

import app.dto.GameState;
import app.dto.ScoreDto;
import app.interfaces.ITennisGame;

public class TennisGame3 implements ITennisGame {

    private GameState gameState;

    public TennisGame3(String firstPlayerName, String secondPlayerName, GameState state) {
        gameState = state;
        gameState.setFirstPlayerName(firstPlayerName);
        gameState.setSecondPlayerName(secondPlayerName);
    }



    @Override
    public GameState getGameState() {
        return gameState;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            int theScore = gameState.getPlayer1Score();
            theScore += 1;
            gameState.setPlayer1Score(theScore);
        } else {
            int theScore = gameState.getPlayer2Score();
            theScore += 1;
            gameState.setPlayer2Score(theScore);
        }

    }

    @Override
    public String getScore(ScoreDto theScore) {

        ScoreDto checkscore = theScore.setIfLoveOrAll(theScore, gameState);
        return checkscore.getScore(theScore, gameState);

    }


}


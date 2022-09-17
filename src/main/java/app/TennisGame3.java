package app;

import app.dto.GameState;
import app.interfaces.ITennisGame;

public class TennisGame3 implements ITennisGame {

    private GameState gameState;

    public TennisGame3(String firstPlayerName, String secondPlayerName, GameState state) {
        gameState = state;
        gameState.setFirstPlayerName(firstPlayerName);
        gameState.setSecondPlayerName(secondPlayerName);
    }

    public String getScore() {

        if (isLoveOrAll(gameState.getPlayer1Score(), gameState.getPlayer2Score())) {
            return gameState.getIsLoveOrAllText();
        } else {
            this.deuceOrAdvantageOrWinText(gameState.getPlayer1Score(), gameState.getPlayer2Score());
           return gameState.getDeuceOrAdvantageOrWinText();
        }
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

    private boolean isLoveOrAll(int player1Score, int player2Score) {

        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            String s = p[player1Score];
            String result = (player1Score == player2Score) ? s + "-All" : s + "-" + p[player2Score];
            gameState.setIsLoveOrAllText(result);
            return true;
        }
        return false;
    }


    private void deuceOrAdvantageOrWinText(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            gameState.setDeuceOrAdvantageOrWinText("Deuce");
        } else  {
            String s = player1Score > player2Score ? gameState.getFirstPlayerName() : gameState.getSecondPlayerName();
            String result = ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + s : "Win for " + s;
            gameState.setDeuceOrAdvantageOrWinText(result);
        }

    }

}


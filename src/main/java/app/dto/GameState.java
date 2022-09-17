package app.dto;

public class GameState {


    private int player2Score;
    private int player1Score;
    private String firstPlayerName;
    private String secondPlayerName;
    private String isLoveOrAllText;
    private String deuceOrAdvantageOrWinText;


    public GameState() {

    }


    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public String getFirstPlayerName() {
        return firstPlayerName;
    }

    public void setFirstPlayerName(String firstPlayerName) {
        this.firstPlayerName = firstPlayerName;
    }

    public String getSecondPlayerName() {
        return secondPlayerName;
    }

    public void setSecondPlayerName(String secondPlayerName) {
        this.secondPlayerName = secondPlayerName;
    }

    public String getIsLoveOrAllText() {
        return isLoveOrAllText;
    }

    public void setIsLoveOrAllText(String isLoveOrAllText) {
        this.isLoveOrAllText = isLoveOrAllText;
    }

    public String getDeuceOrAdvantageOrWinText() {
        return deuceOrAdvantageOrWinText;
    }

    public void setDeuceOrAdvantageOrWinText(String deuceOrAdvantageOrWinText) {
        this.deuceOrAdvantageOrWinText = deuceOrAdvantageOrWinText;
    }


}

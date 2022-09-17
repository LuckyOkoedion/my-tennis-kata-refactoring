import interfaces.ITennisGame;

public class TennisGame3 implements ITennisGame {

    private int player2Score;
    private int player1Score;
    private String firstPlayerName;
    private String secondPlayerName;
    private String isLoveOrAllText;
    private String deuceOrAdvantageOrWinText;

    public TennisGame3(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {

        if (isLoveOrAll(player1Score, player2Score)) {
            return this.isLoveOrAllText;
        } else {
            this.deuceOrAdvantageOrWinText(player1Score, player2Score);
           return this.deuceOrAdvantageOrWinText;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

    private boolean isLoveOrAll(int player1Score, int player2Score) {

        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            String s = p[player1Score];
            this.isLoveOrAllText = (player1Score == player2Score) ? s + "-All" : s + "-" + p[player2Score];
            return true;
        }
        return false;
    }


    private void deuceOrAdvantageOrWinText(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            this.deuceOrAdvantageOrWinText = "Deuce";
        } else  {
            String s = player1Score > player2Score ? firstPlayerName : secondPlayerName;
            this.deuceOrAdvantageOrWinText = ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + s : "Win for " + s;
        }

    }

}

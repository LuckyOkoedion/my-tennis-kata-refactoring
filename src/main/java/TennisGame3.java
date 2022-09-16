import interfaces.ITennisGame;

public class TennisGame3 implements ITennisGame {

    private int player2Score;
    private int player1Score;
    private String firstPlayerName;
    private String secondPlayerName;

    public TennisGame3(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        String s;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[player1Score];
            return (player1Score == player2Score) ? s + "-All" : s + "-" + p[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            s = player1Score > player2Score ? firstPlayerName : secondPlayerName;
            return ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

}

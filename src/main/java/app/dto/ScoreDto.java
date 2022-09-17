package app.dto;

public class ScoreDto {

    private IsLoveOrAllDto isLoveOrAll;
    private int player2Score;
    private int player1Score;

    public IsLoveOrAllDto getIsLoveOrAll() {
        return isLoveOrAll;
    }

    public void setIsLoveOrAll(IsLoveOrAllDto isLoveOrAll) {
        this.isLoveOrAll = isLoveOrAll;
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
}

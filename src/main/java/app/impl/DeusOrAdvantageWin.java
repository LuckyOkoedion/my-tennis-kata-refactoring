package app.impl;

import app.dto.GameState;
import app.interfaces.Iscore;

// Sets game result text for deus or advantage or win.
public class DeusOrAdvantageWin implements Iscore {

   GameState state;

    public DeusOrAdvantageWin(GameState theState) {
        state = theState;
        scoreTextSetter();

    }

    @Override
    public String scoreTextGetter() {
        return state.getDeuceOrAdvantageOrWinText();
    }

    @Override
    public void scoreTextSetter() {
        if (state.getPlayer1Score() == state.getPlayer2Score()) {
            state.setDeuceOrAdvantageOrWinText("Deuce");
        } else  {
            String s = state.getPlayer1Score() > state.getPlayer2Score() ? state.getFirstPlayerName() : state.getSecondPlayerName();
            String result = (( state.getPlayer1Score() - state.getPlayer2Score())*( state.getPlayer1Score() - state.getPlayer2Score()) == 1) ? "Advantage " + s : "Win for " + s;
            state.setDeuceOrAdvantageOrWinText(result);
        }

    }

}

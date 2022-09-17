package app.impl;

import app.dto.GameState;
import app.interfaces.Iscore;

// Sets game result text for Love or All.
public class LoveOrAll implements Iscore {

    private GameState state;

    public LoveOrAll(GameState theState) {

        state = theState;
        scoreTextSetter();


    }

    @Override
    public String scoreTextGetter() {
        return state.getIsLoveOrAllText();
    }

    @Override
    public void scoreTextSetter() {
        if( state.getPlayer1Score() < 4
                && state.getPlayer2Score() < 4
                && !( state.getPlayer1Score() + state.getPlayer2Score() == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            String s = p[state.getPlayer1Score()];
            String result = (state.getPlayer1Score() == state.getPlayer2Score()) ? s + "-All" : s + "-" + p[state.getPlayer2Score()];
            state.setIsLoveOrAllText(result);

        }

    }
}

package app.impl;

import app.dto.EventType;
import app.dto.GameState;
import app.dto.ScoreDto;
import app.interfaces.IScoreManager;
import app.interfaces.Iscore;

import java.util.HashMap;
import java.util.Map;

// Routes game to either loveOrAll process path or DeusOrAdvantageWin process path
public class ScoreManager implements IScoreManager {
    private GameState state;

    private Iscore score;

    public ScoreManager(ScoreDto theInput, GameState theState) {

        this.state = theState;

        //Instead of if/else and switch statements
        Map<EventType, Iscore> objectFactory = new HashMap<>();
        objectFactory.put(EventType.LOVE_OR_ALL, new LoveOrAll(state));
        objectFactory.put(EventType.OTHERS, new DeusOrAdvantageWin(state));

        Iscore processPath = objectFactory.get(theInput.getEventType());
        score = processPath;


    }



    @Override
    public Iscore getScore() {
        return score;
    }

}

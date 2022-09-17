package app.impl;

import app.dto.ScoreDto;
import app.interfaces.IScoreManager;
import app.interfaces.Iscore;

import java.util.HashMap;
import java.util.Map;

public class ScoreManager implements IScoreManager {

   private Map<String, Iscore> scoreMap = new HashMap<>();

    public ScoreManager(ScoreDto theInput) {

        if(theInput.getIsLoveOrAll() != null) {
            LoveOrAll loveOrAll = new LoveOrAll();
        } else {

        }

    }



    @Override
    public Iscore getScore() {
        return null;
    }

}

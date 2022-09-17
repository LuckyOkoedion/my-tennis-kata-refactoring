package app.interfaces;

import app.dto.GameState;
import app.dto.ScoreDto;

public interface ITennisGame {
    void wonPoint(String playerName);
    String getScore(ScoreDto theScore);
    GameState getGameState();
}
package projects.TicTacToe.service.strategy;

import projects.TicTacToe.model.Game;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;

public interface BotPlayingStrategy {
    Move executeMove(Player player, Game game);
}

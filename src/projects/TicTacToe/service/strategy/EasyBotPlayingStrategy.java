package projects.TicTacToe.service.strategy;

import projects.TicTacToe.model.*;
import projects.TicTacToe.model.constants.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move executeMove(Player player, Game game) {
        Board board = game.getBoard();
        Move move = null;
        for(List<Cell> cells : board.getCells()){
            for (Cell cell : cells){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    cell.setCellState(CellState.FULL);
                    cell.setPlayer(player);
                    move = new Move(cell, player);
                    game.getMoves().add(move);
                    game.getBoardState().add(board.clone());
                    return move;
                }
            }
        }
        return move;
    }
}

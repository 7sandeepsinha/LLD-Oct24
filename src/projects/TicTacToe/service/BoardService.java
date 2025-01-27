package projects.TicTacToe.service;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Cell;
import projects.TicTacToe.model.constants.CellState;

public class BoardService {

    public void displayBoard(Board board){
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                System.out.print('|');
                Cell cell = board.getCells().get(i).get(j);
                if(cell.getCellState().equals(CellState.EMPTY)){
                    System.out.print(' ');
                } else if(cell.getCellState().equals(CellState.FULL)){
                    System.out.print(cell.getPlayer().getSymbol());
                } else {
                    System.out.print('-');
                }
                System.out.print('|');
            }
            System.out.println();
        }
    }
}

package projects.TicTacToe.service.strategy;

import projects.TicTacToe.exception.GameDrawnException;
import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class O1WinnerCheckStrategy implements WinnerCheckStrategy{
    private HashMap<Character, Integer> topLeftDiagonalMap;
    private HashMap<Character, Integer> topRightDiagonalMap;
    private HashMap<Character, Integer> cornerMap;
    private List<HashMap<Character, Integer>> rowMaps;
    private List<HashMap<Character, Integer>> columnMaps;

    public O1WinnerCheckStrategy(int size) {
        this.topLeftDiagonalMap = new HashMap<>();
        this.topRightDiagonalMap = new HashMap<>();
        this.cornerMap = new HashMap<>();
        rowMaps = new ArrayList<>();
        columnMaps = new ArrayList<>();
        initialiseMaps(size);
    }

    @Override
    public Player checkWinner(Board board, Move currentMove) {
        int size = board.getSize();
        //fetch details
        char symbol = currentMove.getPlayer().getSymbol();
        int row = currentMove.getCell().getRow();
        int col = currentMove.getCell().getCol();

        //update row and col hashmaps
        HashMap<Character,Integer> rowMap = rowMaps.get(row);
        HashMap<Character,Integer> colMap = columnMaps.get(col);
        rowMap.put(symbol, rowMap.getOrDefault(symbol,0) + 1);
        colMap.put(symbol, colMap.getOrDefault(symbol,0) + 1);

        if(rowMap.get(symbol) == size || colMap.get(symbol) == size)
            return currentMove.getPlayer();

        //update diagonal maps
        if(row == col) {
            topLeftDiagonalMap.put(symbol, topLeftDiagonalMap.getOrDefault(symbol, 0) + 1);
        }
        if( (row+col) == (size-1)){
            topRightDiagonalMap.put(symbol, topRightDiagonalMap.getOrDefault(symbol, 0) + 1);
        }
        if(topLeftDiagonalMap.getOrDefault(symbol, 0) == size || topRightDiagonalMap.getOrDefault(symbol, 0) == size){
            return currentMove.getPlayer();
        }

        //update corner maps
        if( (row==0||row==size-1) && (col==0||col==size-1) ){
            cornerMap.put(symbol, cornerMap.getOrDefault(symbol, 0) + 1);
        }
        if(cornerMap.getOrDefault(symbol, 0) == 4){
            return currentMove.getPlayer();
        }

        if(checkDraw()){ // eligibleHashmapCount == 0 -> means draw
            throw new GameDrawnException("Game is drawn, nobody can become winner now");
        }
        return null;
    }

    @Override
    public Board updateBoardDetails(Board board) {
        //read the new board and update the hashmap accordingly
        //try to optimise the code, and reduce duplications
        return null;
    }

    private void initialiseMaps(int size){
        for(int i=0;i<size;i++){
            rowMaps.add(new HashMap<>());
            columnMaps.add(new HashMap<>());
        }
    }

    private boolean checkDraw(){
        //TODO:  optimise the TC with a counter for hashmaps
        for(HashMap<Character, Integer> map : rowMaps){
            if(map.size() <= 1)
                return false;
        }
        for(HashMap<Character, Integer> map : columnMaps){
            if(map.size() <= 1)
                return false;
        }
        if(topRightDiagonalMap.size() <= 1 || topLeftDiagonalMap.size() <= 1 || cornerMap.size() <=1 ){
            return false;
        }

        return true;
    }
}


/*       0 1 2
       0 _ _ _ -> H1
       1 X X X -> H2 [ X,3  ]
       2 _ _ _ -> H3
        H H H

        1D 1D 1C

        N rows + N cols + 2 D + 1 C
        [2N + 3]
Hashmap ->      9

for any row,col
1. row hashmap -> update and check
2. col hashmap -> update and check
3. if(row == col) -> topLeftDiagonalMap -> update and check
4. if(row + col == size-1) -> topRightDiagonalMap -> update and check
5. if( (row==0||row==size-1) && (col==0||col==size-1) ) -> cornerMap -> update and check

 */
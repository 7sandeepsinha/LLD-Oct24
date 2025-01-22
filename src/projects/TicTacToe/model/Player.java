package projects.TicTacToe.model;

import projects.TicTacToe.model.constants.PlayerType;

public class Player {
    private int id;
    private String name;
    private char symbol;
    private PlayerType playerType;
    private boolean hasUsedUndo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public boolean isHasUsedUndo() {
        return hasUsedUndo;
    }

    public void setHasUsedUndo(boolean hasUsedUndo) {
        this.hasUsedUndo = hasUsedUndo;
    }
}

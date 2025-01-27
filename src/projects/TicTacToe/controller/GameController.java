package projects.TicTacToe.controller;

import projects.TicTacToe.model.*;
import projects.TicTacToe.model.constants.GameState;
import projects.TicTacToe.model.constants.PlayerType;
import projects.TicTacToe.service.BoardService;
import projects.TicTacToe.service.GameService;
import projects.TicTacToe.service.PlayerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameController {

    private Scanner sc;
    private PlayerService playerService;
    private GameService gameService;
    private BoardService boardService;

    public GameController(PlayerService playerService, GameService gameService, BoardService boardService) {
        this.sc = new Scanner(System.in);
        this.gameService = gameService;
        this.playerService = playerService;
        this.boardService = boardService;
    }

    public List<Player> generatePlayerList(int playerCount){
        System.out.println("Please enter 1 if you want a bot in the game, else 0");
        int botCheck = sc.nextInt();
        List<Player> players = new ArrayList<>();

        if(botCheck == 1){
            //TODO : take user input for bot difficulty level, and create bot accordingly
            //TODO : take user input for bot name, and bot symbol
            Bot bot = playerService.createBot("BOT", '$');
            players.add(bot);
            playerCount--;
        }

        for(int i=0;i<playerCount;i++){
            System.out.println("Enter the name for the player");
            String playerName = sc.next();
            System.out.println("Enter the symbol for player : " + playerName);
            char symbol = sc.next().charAt(0);
            Player player = playerService.createPlayer(playerName, symbol);
            players.add(player);
        }
        Collections.shuffle(players);
        return players;
    }

    public Move createMove(Player player, Game game){
        if(player.getPlayerType().equals(PlayerType.HUMAN)){
            System.out.println("Please enter the row");
            int row = sc.nextInt();
            System.out.println("Please enter the col");
            int col = sc.nextInt();
            //TODO: validate row and column before executing the move
            return gameService.executeMove(player, game, row, col);
        } else {
            return gameService.executeMove(player, game);
        }
    }

    public GameState checkWinner(Game game, Move move){
        return gameService.checkWinner(game, move);
    }

    public Game undo(int moves, Game game){
        //TODO: add validations for moves
        return gameService.undo(moves, game);
    }

    public Game startGame(Game game){
        return null;
    }

    public void replayGame(Game game){
        //actual business logic in gameService class
    }

    public void displayBoard(Game game){
        boardService.displayBoard(game.getBoard());
    }
}

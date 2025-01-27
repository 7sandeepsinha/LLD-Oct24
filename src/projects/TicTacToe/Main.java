package projects.TicTacToe;

import projects.TicTacToe.controller.GameController;
import projects.TicTacToe.exception.GameDrawnException;
import projects.TicTacToe.exception.InvalidCellException;
import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Game;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.GameState;
import projects.TicTacToe.model.constants.PlayerType;
import projects.TicTacToe.service.BoardService;
import projects.TicTacToe.service.GameService;
import projects.TicTacToe.service.PlayerService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TICTACTOE GAME");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dimension of the board for the game");
        int dimension = sc.nextInt();

        GameService gameService = new GameService(dimension);
        PlayerService playerService = new PlayerService();
        BoardService boardService = new BoardService();
        GameController gameController = new GameController(playerService, gameService, boardService);

        List<Player> players = gameController.generatePlayerList(dimension-1);
        Game game = gameService.createGame(players, dimension);
        game = gameService.startGame(game);
        int moveIndex = 0;
        gameController.displayBoard(game);

        while (true){
            try {
                Player currentPlayer = game.getPlayers().get(moveIndex);
                System.out.println("Player to make a move : " + currentPlayer.getName());
                Move currentMove = gameController.createMove(currentPlayer, game);
                gameController.displayBoard(game);
                if (currentPlayer.getPlayerType().equals(PlayerType.HUMAN) && !currentPlayer.isHasUsedUndo()) {
                    System.out.println("Please enter the number of steps you want to undo, if you dont want to undo now, please enter 0");
                    int undoCount = sc.nextInt();
                    if (undoCount > 0) {
                        gameController.undo(undoCount, game);
                        currentPlayer.setHasUsedUndo(true);
                        gameController.displayBoard(game);
                    } else {
                        System.out.println("Undo not done, moving forward");
                    }
                }
                GameState gameState = gameController.checkWinner(game, currentMove);
                if (gameState.equals(GameState.WINNER)) {
                    game.setWinner(currentPlayer);
                    System.out.println("Congratulations to the winner : " + currentPlayer.getName());
                    break;
                }
            } catch (GameDrawnException ex){
                System.out.println("Game has drawn, no more winners ");
                break;
            } catch (InvalidCellException ex){
                System.out.println("Player has chosen a wrong cell for input, please enter again");
                continue;
            }
            moveIndex = (moveIndex+1) % (dimension-1);
        }
    }
}

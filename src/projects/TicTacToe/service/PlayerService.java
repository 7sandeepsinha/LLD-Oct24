package projects.TicTacToe.service;

import projects.TicTacToe.exception.DuplicateSymbolException;
import projects.TicTacToe.model.Bot;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.BotDifficultyLevel;
import projects.TicTacToe.model.constants.PlayerType;

import java.util.HashSet;

public class PlayerService {
    private static int counter = 1;
    private HashSet<Character> symbolSet;

    public PlayerService() {
        this.symbolSet = new HashSet<>();
    }

    public Player createPlayer(String name, char symbol){
        if(symbolSet.contains(symbol)){
            throw new DuplicateSymbolException("The symbol used for the player, already exists : " + symbol);
        }
        symbolSet.add(symbol);
        return new Player(
                counter++,
                name,
                symbol,
                PlayerType.HUMAN
        );
    }

    public Bot createBot(String name, char symbol){
        if(symbolSet.contains(symbol)){
            throw new DuplicateSymbolException("The symbol used for the bot, already exists : " + symbol);
        }
        symbolSet.add(symbol);
        return new Bot(
                counter++,
                name,
                symbol,
                PlayerType.BOT,
                BotDifficultyLevel.MEDIUM // default for now
        );
    }
}
// 1. single method -> parameter -> bot|| player
// 2. two methods
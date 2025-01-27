package projects.TicTacToe.service.strategy;

import projects.TicTacToe.model.constants.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        //TODO: update this method with switch case
        return new EasyBotPlayingStrategy();
//        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
//            return new EasyBotPlayingStrategy();
//        } else {
//            return new MediumBotPlayingStrategy();
//        }
    }
}

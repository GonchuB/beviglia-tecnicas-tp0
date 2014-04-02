package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by GonchuB on 01/04/2014.
 */
public interface GameOption {

    /**
     * Method that returns the GameOption that won in the game of Rock-Paper-Scissors-*. Where Rock, Paper, Scissors and * are GameOptions.
     * The method is abstract, so every class that implements GameOption has to define its functionality.
     *
     * @param gameOption the GameOption to compete against.
     * @return the GameOption that won the encounter.
     */
    public abstract GameOption vs(GameOption gameOption);

}

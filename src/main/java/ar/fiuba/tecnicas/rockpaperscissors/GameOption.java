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

    /**
     * The GameOption competes agains Rock.
     *
     * @param rock the rock to compete against.
     * @return the winner of the game.
     */
    public abstract GameOption vs(Rock rock);

    /**
     * The GameOption competes against Paper.
     *
     * @param paper the paper to compete against.
     * @return the winner of the game.
     */
    public abstract GameOption vs(Paper paper);

    /**
     * The GameOption competes against Scissors.
     *
     * @param scissors the scissors to compete against.
     * @return the winner of the game.
     */
    public abstract GameOption vs(Scissors scissors);

    /**
     * The GameOption competes against Scissors.
     *
     * @param fire the fire to compete against.
     * @return the winner of the game.
     */
    public abstract GameOption vs(Fire fire);

}

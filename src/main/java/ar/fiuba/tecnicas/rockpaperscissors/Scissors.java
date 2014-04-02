package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Scissors implements GameOption {

    /**
     * Abstract method override. Double dispatch implementation.
     *
     * @param gameOption the GameOption to compete against.
     * @return the result of the gameOption to compete against this (Scissors).
     */
    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    /**
     * Scissors vs Rock.
     *
     * @param rock the rock to play against.
     * @return rock won, so it gets returned.
     */
    public GameOption vs(Rock rock) {
        return rock;
    }

    /**
     * Scissors vs Scissors.
     *
     * @param scissors the scissors to play against.
     * @return it is a tie, by convention this (Scissors) is returned.
     */
    public GameOption vs(Scissors scissors) {
        return this;
    }

    /**
     * Scissors vs Paper.
     *
     * @param paper the paper to play against.
     * @return scissors won, so this (Scissors) gets returned.
     */
    public GameOption vs(Paper paper) {
        return this;
    }

    /**
     * Scissors vs Fire.
     *
     * @param fire the fire to play against.
     * @return fire won, so it gets returned.
     */
    public GameOption vs(Fire fire) {
        return fire;
    }

}

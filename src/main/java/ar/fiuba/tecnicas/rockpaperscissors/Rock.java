package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Rock implements GameOption {

    /**
     * Abstract method override. Double dispatch implementation.
     *
     * @param gameOption the GameOption to compete against.
     * @return the result of the gameOption to compete against this (Rock).
     */
    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    /**
     * Rock vs Rock.
     *
     * @param rock the rock to play against.
     * @return it is a tie, by convention this (Rock) is returned.
     */
    public GameOption vs(Rock rock) {
        return this;
    }

    /**
     * Rock vs Scissors.
     *
     * @param scissors the scissors to play against.
     * @return rock won, so this (Rock) gets returned.
     */
    public GameOption vs(Scissors scissors) {
        return this;
    }

    /**
     * Rock vs Paper.
     *
     * @param paper the paper to play against.
     * @return paper won, so it gets returned.
     */
    public GameOption vs(Paper paper) {
        return paper;
    }

    /**
     * Rock vs Fire.
     *
     * @param fire the fire to play against.
     * @return rock won, so this (Rock) gets returned.
     */
    public GameOption vs(Fire fire) {
        return this;
    }

}

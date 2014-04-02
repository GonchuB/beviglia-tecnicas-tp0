package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by GonchuB on 01/04/2014.
 */
public class Fire implements GameOption {

    /**
     * Abstract method override. Double dispatch implementation.
     *
     * @param gameOption the GameOption to compete against.
     * @return the result of the gameOption to compete against this (Fire).
     */
    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    /**
     * Fire vs Rock.
     *
     * @param rock the rock to play against.
     * @return rock won, so it gets returned.
     */
    public GameOption vs(Rock rock) {
        return rock;
    }

    /**
     * Fire vs fire.
     *
     * @param fire the fire to play against.
     * @return it is a tie, by convention this (Fire) is returned.
     */
    public GameOption vs(Fire fire) {
        return this;
    }

    /**
     * Fire vs Scissors.
     *
     * @param scissors the scissors to play against.
     * @return fire won, so this (Fire) gets returned.
     */
    public GameOption vs(Scissors scissors) {
        return this;
    }

    /**
     * Fire vs Paper.
     *
     * @param paper the paper to play against.
     * @return fire won, so this (Fire) gets returned.
     */
    public GameOption vs(Paper paper) {
        return this;
    }

}

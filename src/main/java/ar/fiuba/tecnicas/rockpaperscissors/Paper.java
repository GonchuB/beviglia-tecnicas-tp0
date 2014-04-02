package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Paper implements GameOption {

    /**
     * Abstract method override. Double dispatch implementation.
     *
     * @param gameOption the GameOption to compete against.
     * @return the result of the gameOption to compete against this (Paper).
     */
    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    /**
     * Paper vs Rock.
     *
     * @param rock the rock to play against.
     * @return paper won, so this (Paper) gets returned.
     */
    public GameOption vs(Rock rock) {
        return this;
    }

    /**
     * Paper vs Scissors.
     *
     * @param scissors the scissors to play against.
     * @return scissors won, so it gets returned.
     */
    public GameOption vs(Scissors scissors) {
        return scissors;
    }

    /**
     * Paper vs Paper.
     *
     * @param paper the rock to play against.
     * @return it is a tie, by convention this (Paper) is returned.
     */
    public GameOption vs(Paper paper) {
        return this;
    }

    /**
     * Paper vs Fire.
     *
     * @param fire the fire to play against.
     * @return fire won, so it gets returned.
     */
    public GameOption vs(Fire fire) {
        return fire;
    }

}

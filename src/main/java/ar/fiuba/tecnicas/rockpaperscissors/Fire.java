package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by GonchuB on 01/04/2014.
 */
public class Fire implements GameOption {

    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    public GameOption vs(Rock rock) {
        return rock;
    }

    public GameOption vs(Fire fire) {
        return this;
    }

    public GameOption vs(Scissors scissors) {
        return this;
    }

    public GameOption vs(Paper paper) {
        return this;
    }

}

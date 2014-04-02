package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Scissors implements GameOption {

    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    public GameOption vs(Rock rock) {
        return rock;
    }

    public GameOption vs(Scissors scissors) {
        return this;
    }

    public GameOption vs(Paper paper) {
        return this;
    }

    public GameOption vs(Fire fire) {
        return fire;
    }

}

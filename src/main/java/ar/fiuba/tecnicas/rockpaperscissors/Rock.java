package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Rock implements GameOption {

    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    public GameOption vs(Rock rock) {
        return this;
    }

    public GameOption vs(Scissors scissors) {
        return this;
    }

    public GameOption vs(Paper paper) {
        return paper;
    }

    public GameOption vs(Fire fire) {
        return this;
    }

}

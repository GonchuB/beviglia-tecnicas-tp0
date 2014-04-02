package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Paper implements GameOption {

    public GameOption vs(GameOption gameOption) {
        return gameOption.vs(this);
    }

    public GameOption vs(Rock rock) {
        return this;
    }

    public GameOption vs(Scissors scissors) {
        return scissors;
    }

    public GameOption vs(Paper paper) {
        return this;
    }

    public GameOption vs(Fire fire) {
        return fire;
    }

}

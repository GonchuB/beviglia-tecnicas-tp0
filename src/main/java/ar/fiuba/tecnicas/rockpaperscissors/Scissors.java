package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Scissors {

    public Object vs(Rock rock) {
        return rock;
    }

    public Object vs(Scissors scissors) {
        return this;
    }

    public Object vs(Paper paper) {
        return this;
    }

}

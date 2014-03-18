package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by gonchub on 3/17/14.
 */
public class Paper {

    public Object vs(Rock rock) {
        return this;
    }

    public Object vs(Scissors scissors) {
        return scissors;
    }

    public Object vs(Paper paper) {
        return this;
    }

}

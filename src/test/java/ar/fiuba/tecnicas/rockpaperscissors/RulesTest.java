package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RulesTest {

    private GameOption rock = new Rock();
    private GameOption paper = new Paper();
    private GameOption scissors = new Scissors();
    private GameOption fire = new Fire();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
        assertThat(rock.vs(new Scissors()), instanceOf(Rock.class));
    }

    @Test
    public void rockBeatsFire() {
        assertEquals(rock, rock.vs(fire));
        assertThat(rock.vs(new Fire()), instanceOf(Rock.class));
    }

    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
        assertThat(rock.vs(new Paper()), instanceOf(Paper.class));
    }

    @Test
    public void rockTieWithRock() {
        assertEquals(rock, rock.vs(rock));
        assertThat(rock.vs(new Rock()), instanceOf(Rock.class));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
        assertThat(paper.vs(new Rock()), instanceOf(Paper.class));
    }

    @Test
    public void paperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
        assertThat(paper.vs(new Scissors()), instanceOf(Scissors.class));
    }

    @Test
    public void paperTieWithPaper() {
        assertEquals(paper, paper.vs(paper));
        assertThat(paper.vs(new Paper()), instanceOf(Paper.class));
    }

    @Test
    public void paperLostWithFire() {
        assertEquals(fire, paper.vs(fire));
        assertThat(paper.vs(new Fire()), instanceOf(Fire.class));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
        assertThat(scissors.vs(new Paper()), instanceOf(Scissors.class));
    }

    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
        assertThat(scissors.vs(new Rock()), instanceOf(Rock.class));
    }

    @Test
    public void scissorsTieWithScissors() {
        assertEquals(scissors, scissors.vs(scissors));
        assertThat(scissors.vs(new Scissors()), instanceOf(Scissors.class));
    }

    @Test
    public void scissorsLostWithFire() {
        assertEquals(fire, scissors.vs(fire));
        assertThat(scissors.vs(new Fire()), instanceOf(Fire.class));
    }

    @Test
    public void fireBeatsScissors() {
        assertEquals(fire, fire.vs(scissors));
        assertThat(fire.vs(new Scissors()), instanceOf(Fire.class));
    }

    @Test
    public void fireBeatsPaper() {
        assertEquals(fire, fire.vs(paper));
        assertThat(fire.vs(new Paper()), instanceOf(Fire.class));
    }

    @Test
    public void fireLostWithRock() {
        assertEquals(rock, fire.vs(rock));
        assertThat(fire.vs(new Rock()), instanceOf(Rock.class));
    }

    @Test
    public void fireTieWithFire() {
        assertEquals(fire, fire.vs(fire));
        assertThat(fire.vs(new Fire()), instanceOf(Fire.class));
    }
}

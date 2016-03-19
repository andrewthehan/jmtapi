
package tests;

import infinotes.theory.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccidentalTests{

  @Test
  public void testOffset(){
    Accidental accidental;

    accidental = Accidental.NONE;
    assertEquals(accidental.getOffset(), 0);

    accidental = Accidental.fromOffset(0);
    assertEquals(accidental.getOffset(), 0);
    assertEquals(accidental, Accidental.NATURAL);
    accidental = Accidental.fromOffset(1);
    assertEquals(accidental.getOffset(), 1);
    assertEquals(accidental, Accidental.SHARP);
    accidental = Accidental.fromOffset(2);
    assertEquals(accidental.getOffset(), 2);
    assertEquals(accidental, Accidental.DOUBLE_SHARP);
    accidental = Accidental.fromOffset(-1);
    assertEquals(accidental.getOffset(), -1);
    assertEquals(accidental, Accidental.FLAT);
    accidental = Accidental.fromOffset(-2);
    assertEquals(accidental.getOffset(), -2);
    assertEquals(accidental, Accidental.DOUBLE_FLAT);
  }

	@Test
	public void testString(){
    Accidental accidental;

    accidental = Accidental.fromString("");
    assertEquals(accidental, Accidental.NONE);
    assertEquals(accidental.toString(), "");

    accidental = Accidental.fromString("n");
    assertEquals(accidental, Accidental.NATURAL);
    assertEquals(accidental.toString(), "n");

    accidental = Accidental.fromString("#");
    assertEquals(accidental, Accidental.SHARP);
    assertEquals(accidental.toString(), "#");

    accidental = Accidental.fromString("x");
    assertEquals(accidental, Accidental.DOUBLE_SHARP);
    assertEquals(accidental.toString(), "x");

    accidental = Accidental.fromString("b");
    assertEquals(accidental, Accidental.FLAT);
    assertEquals(accidental.toString(), "b");

    accidental = Accidental.fromString("bb");
    assertEquals(accidental, Accidental.DOUBLE_FLAT);
    assertEquals(accidental.toString(), "bb");
	}
}
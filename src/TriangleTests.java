import edu.princeton.cs.introcs.StdDraw;
import org.junit.Test;
import support.cse131.ArgsProcessor;

import static junit.framework.TestCase.assertTrue;

public class TriangleTests {

    @Test
    public void testLevelOne() {
        StdDraw.clear();
        Methods.triangle(1);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a single equilateral triangle that fills most of the window?\n\n " +
                "Enter true or false:"));
    }

    @Test
    public void testLevelTwo() {
        StdDraw.clear();
        Methods.triangle(2);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a large equilateral triangle with three smaller triangles inside of it?\n " +
                "(like a triforce from The Legend of Zelda)\n\n" +
                "Enter true or false:"));
    }

    @Test
    public void testLevelSix() {
        StdDraw.clear();
        Methods.triangle(6);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show an image of Sierpinski's Triangle that looks like the one on the studio page?\n\n" +
                "Enter true or false:"));
    }
}

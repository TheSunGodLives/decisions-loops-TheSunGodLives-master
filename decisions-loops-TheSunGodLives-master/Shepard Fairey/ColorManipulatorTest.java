

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testColorManipulator()
    {
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        int x = 450;
        int y = 540;
        Pixel pixel = picture.getPixel( x, y );
        int blue = pixel.getBlue();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        assertEquals( 123.66666, blue, 1e-6);
        assertEquals( 123.66666, red, 1e-6);
        assertEquals( 123.66666, green, 1e-6);
    }
    
    @Test
    public void test2ColorManipulator()
    {
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        int x = 701;
        int y = 228;
        Pixel pixel = picture.getPixel( x, y );
        int blue = pixel.getBlue();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        assertEquals( 43, blue, 1e-6);
        assertEquals( 43, red, 1e-6);
        assertEquals( 43, green, 1e-6);
    }
    
    @Test
    public void test3ColorManipulator()
    {
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        int x = 161;
        int y = 769;
        Pixel pixel = picture.getPixel( x, y );
        int blue = pixel.getBlue();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        assertEquals( 158, blue, 1e-6);
        assertEquals( 158, red, 1e-6);
        assertEquals( 158, green, 1e-6);
    }
}

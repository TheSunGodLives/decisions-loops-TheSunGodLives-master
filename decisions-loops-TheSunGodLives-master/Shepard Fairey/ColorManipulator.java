import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author gcschmit
 * @version 5 June 2017
 */
public class ColorManipulator
{
    private Picture picture;

    private static final Color OFF_WHITE = new Color( 248, 229, 175 );
    private static final Color LIGHT_BLUE = new Color( 121, 149, 159 );
    private static final Color RED = new Color( 198, 50, 45 );
    private static final Color DARK_BLUE = new Color( 16, 48, 77 );
    
    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }

    /**
     * Negates the color of every pixel in the picture
     *
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }
    
    public void grayscale()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int average = (color.getBlue() + color.getGreen() + color.getRed()) / 3;
                Color grayAverage = new Color( average, average, average );
                pixel.setColor( grayAverage );
            }
        }
    }
    
    public void mosaic()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                if ( color.getBlue() < 64 )
                {
                    pixel.setColor( OFF_WHITE );
                }
                else if ( color.getBlue() > 63 && color.getBlue() < 126 )
                {
                    pixel.setColor( LIGHT_BLUE );
                }
                else if ( color.getBlue() > 125 && color.getBlue() < 189 )
                {
                    pixel.setColor( RED );
                }
                else if ( color.getBlue() > 188 && color.getBlue() <= 255 )
                {
                    pixel.setColor( DARK_BLUE );
                }
            }
        }
    }

    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.grayscale();
        picture.explore();
    }
    
    public static void main2(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "selfieLandscape.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.grayscale();
        picture.explore();
    }
}

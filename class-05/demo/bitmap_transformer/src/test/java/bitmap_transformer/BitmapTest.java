package bitmap_transformer;

import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class BitmapTest {

    @Test
    public void testPaintItPurple() {
        // make a very silly image (3x3 square of black pixels)
        BufferedImage sillyImage = new BufferedImage(3,3, BufferedImage.TYPE_INT_ARGB);
        for(int i = 0; i < sillyImage.getHeight(); i++) {
            for(int j = 0; j < sillyImage.getWidth(); j++) {
                sillyImage.setRGB(j, i, 0);
            }
        }

//        [ -1, 0,
//          -1, 0 ]
//        [ 0, -1,
//          0, -1 ]
        // give that image to a bitmap instance
        Bitmap mapForTesting = new Bitmap(sillyImage);
        // purplify it
        mapForTesting.paintItPurple();
        // assert that the image has been changed to all purple
        for(int i = 0; i < sillyImage.getHeight(); i++) {
            for(int j = 0; j < sillyImage.getWidth(); j++) {
                assertEquals("all pixels should be purple",
                        new Color(245, 119, 250).getRGB(),
                        sillyImage.getRGB(j, i));
            }
        }
    }
}
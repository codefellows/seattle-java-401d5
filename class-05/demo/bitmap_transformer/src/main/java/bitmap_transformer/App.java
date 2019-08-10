/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap_transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        BufferedImage i = ImageIO.read(new File(args[0]));
        Bitmap myBitmap = new Bitmap(i);
        // transforms happen here? eventually
        if(args[2].equals("purple")) {
            myBitmap.paintItPurple();
        } else if (args[2].equals("none")) {
            // don't do any transforms
        } else {
            System.out.println("Please specify a valid transform.");
            return;
        }
        myBitmap.writeToFile(args[1]);

    }
}

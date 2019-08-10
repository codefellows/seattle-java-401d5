package bitmap_transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    // instance variables
    BufferedImage imageData;

    // constructor
    public Bitmap(BufferedImage imageData) {
        this.imageData = imageData;
    }

    // instance methods
    public void writeToFile(String s) throws IOException {
        ImageIO.write(this.imageData, "bmp", new File(s));
    }

    // first transform
    public void paintItPurple() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight(); j++) {
                this.imageData.setRGB(i, j,  new Color(245, 119, 250).getRGB());
            }
        }
    }
}


package Geometry;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SimpleImages {

    public static BufferedImage getColoredShapeImage(
            int size, Shape shape, Color color) {
        BufferedImage bi = new BufferedImage(
                size, size, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(color);
        g.fill(shape);
        g.dispose();

        return bi;
    }

    public static Shape getPointedShape(int points, int radius) {
        double angle = Math.PI * 2 / points;

        GeneralPath p = new GeneralPath();
        for (int ii = 0; ii < points; ii++) {
            double a = angle * ii;

            double x = (Math.cos(a) * radius) + radius;
            double y = (Math.sin(a) * radius) + radius;
            if (ii == 0) {
                p.moveTo(x, y);
            } else {
                p.lineTo(x, y);
            }
        }
        p.closePath();

        return p;
    }

    public static void main(String[] args) throws Exception {
        Color[] colors = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW
        };
        File f = new File(System.getProperty("user.home"));
        f = new File(f, "ShapedImages");
        f.mkdirs();
        for (Color c : colors) {
            for (int s = 15; s < 31; s += 15) {
                Shape sh = new Ellipse2D.Double(1, 1, 2 * s, 2 * s);
                BufferedImage i = getColoredShapeImage((2 * s) + 2, sh, c);
                String name = "Image"
                        + "0point-"
                        + s + "px-"
                        + c.getRed() + "r-"
                        + c.getGreen() + "g-"
                        + c.getBlue() + "b"
                        + ".png";
                File t = new File(f, name);
                ImageIO.write(i, "png", t);
                for (int ii = 3; ii < 7; ii++) {
                    sh = getPointedShape(ii, s);
                    i = getColoredShapeImage((2 * s) + 2, sh, c);
                    name = "Image"
                            + ii + "point-"
                            + s + "px-"
                            + c.getRed() + "r-"
                            + c.getGreen() + "g-"
                            + c.getBlue() + "b"
                            + ".png";
                    t = new File(f, name);
                    ImageIO.write(i, "png", t);
                }
            }
        }
        Desktop.getDesktop().open(f);
    }
}

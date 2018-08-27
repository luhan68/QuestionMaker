/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author Gene
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawImages {

    public void Draw(String text, String filename,boolean square, boolean rectangle, boolean other) {
        try {
            int width = 200, height = 200;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D ig2 = bi.createGraphics();

            Font font = new Font("TimesRoman", Font.BOLD, 20);
            ig2.setFont(font);
            String message = "Place";
            FontMetrics fontMetrics = ig2.getFontMetrics();
            int stringWidth = fontMetrics.stringWidth(message);
            int stringHeight = fontMetrics.getAscent();
            ig2.setPaint(Color.black);
            ig2.drawString(message, (width - stringWidth) / 2, height / 2 + stringHeight / 4);

            ig2.setPaint(new Color(150, 150, 150));

            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            rh.put(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);

            ig2.setRenderingHints(rh);

            if (square == true) {
                ig2.fillRect(30, 20, width, height);
            }
            if (rectangle == true) {
                ig2.fillRect(120, 20, 90, 60);
            }
            if (other == true) {
                ig2.fill(new Ellipse2D.Double(10, 100, 80, 100));
                ig2.fillArc(120, 130, 110, 100, 5, 150);
                ig2.fillOval(270, 130, 50, 50);

            }

            //    ImageIO.write(bi, "PNG", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\yourImageName.PNG"));
            ImageIO.write(bi, "JPEG", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\"+filename+".jpg"));
            //ImageIO.write(bi, "gif", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\yourImageName.GIF"));
            //ImageIO.write(bi, "BMP", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\yourImageName.BMP"));

        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}

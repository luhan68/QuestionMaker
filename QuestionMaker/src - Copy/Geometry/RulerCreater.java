package Geometry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

//Gene

public class RulerCreater {

    final static int rulerHeight = 80;
    final static int dragerWidth = 8;
    private static boolean isHorisontal = true;

    //When calling this function, pass the filename, starting point on the ruler (first tick), and where marker is (reminder ticks 16 per inch)
    
    public void drawRuler(String filename, int start, int marker) { 
        int width = 300, height = 80;
        int dims = 20;
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Dimension preferredSize = new Dimension(width, rulerHeight);

        Graphics2D ig2 = bi.createGraphics();
        AffineTransform origTransform = ig2.getTransform(); //save original transform
        int firstX = 1;
        int firstY = 1;
        int lastX = preferredSize.width;
        int lastY = preferredSize.height;
        int x = firstX;
        if (!isHorisontal) {
            ig2.rotate(Math.toRadians(90));
            ig2.translate(0, -rulerHeight);
            int tmp = lastX;
            lastX = lastY;
            lastY = tmp;
        }

        int diff = 1;
        int counter = 1;
        int totalcounter = 1;

     ig2.drawString("Inches", 0, firstY + 35); // Print the inches Text for The ruler

        while (x < lastX) {
            if(totalcounter == marker){
                ig2.setColor(Color.RED);
            }else{
                 ig2.setColor(Color.WHITE);
            }
            if((counter == 2) || (counter == 6 )|| (counter ==10) || (counter == 14)){ // first medium tick
                  ig2.drawLine(x, firstY, x, firstY + 8); //top
                ig2.drawLine(x, lastY, x, lastY - 8); //bottom
            }else if (counter == 4 || counter ==12) {
                  ig2.drawLine(x, firstY, x, firstY + 11); //top
                ig2.drawLine(x, lastY, x, lastY - 11); //bottom
            }
           else if (counter == 8) { // print half inch tick
                ig2.drawLine(x, firstY, x, firstY + 18); //top
                ig2.drawLine(x, lastY, x, lastY - 18); //bottom

            } else if (counter == 16) { //print inch tick
                ig2.drawLine(x, firstY, x, firstY + 20); //top
                ig2.drawLine(x, lastY, x, lastY - 20); // bottom 
                ig2.drawString("" + start, x - diff, firstY + 35);
                start++;
                counter = 0;
            }
            else { //print centimeter tick
                ig2.drawLine(x, firstY, x, firstY + 5);
                ig2.drawLine(x, lastY, x, lastY - 5);
            }
            counter++;
            totalcounter++;
            x += 5;
        }
        ig2.setTransform(origTransform);
        try {
File file = new File("for_upload/"+ filename);
        String location = file.getAbsolutePath();
            ImageIO.write(bi, "PNG", new File(location));

        } catch (Exception e) {
        }
    }

}


package Geometry;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 *
 * @author Gene
 */
public class ClockCreater {

    int centerPointX;
    int centerPointY;

    int xs;
    int ys;

    Font ClockNameFont;

    Date currentDate;

    public void clock_maker(String filename, int h, int m, int s ) {
        int width = 450, height = 450;
        centerPointX = width / 2;
        centerPointY = height / 2;
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        currentDate = new Date();

       // int s = currentDate.getSeconds();

        int s_minus_five = s - 5;
        int s_add_five = s + 5;

        xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 170 + centerPointX);
        ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 170 + centerPointY);

        int xsm = (int) (Math.cos(s_minus_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointX);
        int ysm = (int) (Math.sin(s_minus_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointY);

        int xsa = (int) (Math.cos(s_add_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointX);
        int ysa = (int) (Math.sin(s_add_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointY);

       // int m = currentDate.getMinutes();

        int m_minus_ten = m - 10;
        int m_add_ten = m + 10;

        int xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 170 + centerPointX);
        int ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 170 + centerPointY);

        int xmm = (int) (Math.cos(m_minus_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointX);
        int ymm = (int) (Math.sin(m_minus_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointY);

        int xma = (int) (Math.cos(m_add_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointX);
        int yma = (int) (Math.sin(m_add_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointY);

    //    int h = currentDate.getHours();

        int h_minus_ten = h - 10;
        int h_add_ten = h + 10;

        int xh = (int) (Math.cos(h * Math.PI / 6 - Math.PI / 2) * 100 + centerPointX);
        int yh = (int) (Math.sin(h * Math.PI / 6 - Math.PI / 2) * 100 + centerPointY);

        int xhm = (int) (Math.cos(h_minus_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointX);
        int yhm = (int) (Math.sin(h_minus_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointY);

        int xha = (int) (Math.cos(h_add_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointX);
        int yha = (int) (Math.sin(h_add_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointY);
		//************GET CURRENT HOUR AND ALL INFORMATION TO DRAW HOUR POINTER**************

        //OVAL THAT MAKE CLOCK CIRCLE
        int ovalWidth = 400;
        int ovalHeight = 400;
        //OVAL THAT MAKE CLOCK CIRCLE

        Graphics2D ig2 = bi.createGraphics();
        ig2.setBackground(Color.black);
        //PEN COLOR TO DRAW : White
        Color penColor = new Color(255, 255, 255);

        //PEN COLOR TO DRAW : Black
        Color penColor2 = new Color(0, 0, 0);

        //Clock circle background color
        ig2.setColor(penColor);
        ig2.fillOval(width / 2 - (ovalWidth / 2), ((height) / 2) - (ovalHeight / 2), ovalWidth, ovalHeight);

        ig2.setColor(penColor2);
        ClockNameFont = new Font("Verdana", Font.BOLD, 20);
        ig2.setFont(ClockNameFont);
        ig2.drawString("", centerPointX - 30, centerPointY - 100);

        //Draw numbers
        ClockNameFont = new Font("Verdana", Font.BOLD, 20);
        ig2.setFont(ClockNameFont);
        ig2.drawString("12", centerPointX - 15, centerPointY - 160);
        ig2.drawString("1", centerPointX + 77, centerPointY - 140);
        ig2.drawString("2", centerPointX + 140, centerPointY - 80);
        ig2.drawString("3", centerPointX + 165, centerPointY + 5);
        ig2.drawString("4", centerPointX + 140, centerPointY + 95);
        ig2.drawString("5", centerPointX + 77, centerPointY + 150);
        ig2.drawString("6", centerPointX - 8, centerPointY + 175);
        ig2.drawString("7", centerPointX - 95, centerPointY + 152);
        ig2.drawString("8", centerPointX - 152, centerPointY + 95);
        ig2.drawString("9", centerPointX - 170, centerPointY + 13);
        ig2.drawString("10", centerPointX - 152, centerPointY - 80);
        ig2.drawString("11", centerPointX - 95, centerPointY - 140);
        //*************DRAW SECOND POINTER*********
        int[] coordinateXs = {centerPointX, xsm, xs, xsa};
        int[] coordinateYs = {centerPointY, ysm, ys, ysa};
        ig2.fillPolygon(coordinateXs, coordinateYs, 4);
		//*************DRAW SECOND POINTER*********

        //*************DRAW MINUTE POINTER*********
        int[] coordinateXm = {centerPointX, xmm, xm, xma};
        int[] coordinateYm = {centerPointY, ymm, ym, yma};
        ig2.fillPolygon(coordinateXm, coordinateYm, 4);
		//*************DRAW MINUTE POINTER*********

        //*************DRAW HOUR POINTER*********
        int[] coordinateXh = {centerPointX, xhm, xh, xha};
        int[] coordinateYh = {centerPointY, yhm, yh, yha};
        ig2.fillPolygon(coordinateXh, coordinateYh, 4);
		//*************DRAW HOUR POINTER*********

        //*************DRAW LINE TICK*******************
        for (int i = 1; i <= 360; i++) {
            int tickX;
            int tickY;

            int tickXb;
            int tickYb;

            tickX = (int) (Math.cos(i * Math.PI / 30 - Math.PI / 2) * 180 + centerPointX);
            tickY = (int) (Math.sin(i * Math.PI / 30 - Math.PI / 2) * 180 + centerPointY);

            tickXb = (int) (Math.cos(i * Math.PI / 30 - Math.PI / 2) * 300 + centerPointX);
            tickYb = (int) (Math.sin(i * Math.PI / 30 - Math.PI / 2) * 300 + centerPointY);

            ig2.drawLine(tickXb, tickYb, tickX, tickY);
        }
        try {
File file = new File("for_upload/"+ filename);
        String location = file.getAbsolutePath();
            ImageIO.write(bi, "PNG", new File(location));
         //   ImageIO.write(bi, "JPEG", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\"+filename+".jpg"));
            //   ImageIO.write(bi, "gif", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\yourImageName.GIF"));
            //   ImageIO.write(bi, "BMP", new File("C:\\Users\\Gene\\Documents\\NetBeansProjects\\QuestionMaker\\yourImageName.BMP"));

        } catch (Exception e) {
        }
        //*************DRAW LINE TICK*******************
    }

}

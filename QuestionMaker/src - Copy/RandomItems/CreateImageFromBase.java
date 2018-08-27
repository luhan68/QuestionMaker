package RandomItems;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CreateImageFromBase {

    public String Create(String imagename, int quantity1, String imagename2, int quantity2, boolean isplus, boolean isminus) {

        String name = imagename + ".png";
        String command = "";
        String ItemOneString = "";
        String ItemTwoString = "";
        String IsPlus = "";
        String IsMinus = "";
        int val = Globals.GlobalVars.counter;
        String img_name_return = "Base_IMG_" + val + ".gif";
        Globals.GlobalVars.counter = val + 1;
        for (int i = 0; i < quantity1; i++) {
            // loop through the image 1 and add it x times
            ItemOneString = ItemOneString + Globals.GlobalVars.Img_Location + imagename + ".png ";

        }
        for (int i = 0; i < quantity2; i++) {
            // loop through the image 1 and add it x times
            ItemTwoString = ItemTwoString + Globals.GlobalVars.Img_Location + imagename2 + ".png ";

        }

        if (isplus) {
            IsPlus = Globals.GlobalVars.Img_Location + "plus.png ";
        }

        if (isminus) {
            IsPlus = Globals.GlobalVars.Img_Location + "minus.png ";
        }


        command = "convert " + ItemOneString + IsPlus + IsMinus + ItemTwoString + "+append -size 500x250 xc:none -background none -append " + Globals.GlobalVars.Img_Location + img_name_return;

        CreateFromBase(command);


        return img_name_return;
    }

    public void CreateFromBase(String command) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        String scriptname = Globals.GlobalVars.Img_Location + "scripts.bat";
        //first create batch script
        try {

            PrintWriter writer = new PrintWriter(scriptname, "UTF-8");
            writer.println(command);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }



        try {
            Process process = new ProcessBuilder(scriptname).start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);
            String line = "";
            while ((line = br2.readLine()) != null) {
                try {
            //        System.out.println(line);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            is.close();
            isr.close();
            br2.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

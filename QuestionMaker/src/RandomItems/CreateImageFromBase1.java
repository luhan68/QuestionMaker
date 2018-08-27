package RandomItems;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

public class CreateImageFromBase1 {

    public String Create(String imagename, int quantity1, String imagename2, int quantity2, boolean isplus, boolean isminus) {

        Date date = new Date();
        long unixTime = (long) date.getTime();

        String name = imagename + ".png";
        String command = "";
        String ItemOneString = "";
        String ItemTwoString = "";
        String IsPlus = "";
        String IsMinus = "";
        int val = Globals.GlobalVars.counter;
        String img_name_return = "Base_IMG_" + unixTime + ".gif";
        Globals.GlobalVars.counter = val + 1;
        for (int i = 0; i < quantity1; i++) {
            // loop through the image 1 and add it x times

            File file = new File("src/Configuration/" + imagename + ".png");
            String item_path_1 = file.getAbsolutePath();

            ItemOneString = ItemOneString + item_path_1 + " ";

        }
        for (int i = 0; i < quantity2; i++) {
            // loop through the image 1 and add it x times
            File file = new File("src/Configuration/" + imagename2 + ".png");
            String item_path_2 = file.getAbsolutePath();
            ItemTwoString = ItemTwoString + item_path_2 + " ";

        }

        if (isplus) {
            File file = new File("src/Configuration/plus.png ");
            IsPlus = file.getAbsolutePath();
        }

        if (isminus) {
            File file = new File("src/Configuration/minus.png ");
            IsPlus = file.getAbsolutePath();
        }

        File file = new File("for_upload/" + img_name_return);
        String ret_name = file.getAbsolutePath();
        command = "convert " + ItemOneString + IsPlus + IsMinus + ItemTwoString + "+append -size 500x250 xc:none -background none -append " + ret_name;

        CreateFromBase(command);


        return img_name_return;
    }

    public void CreateFromBase(String command) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
         File file = new File("for_upload/scripts.bat");
        String scriptname = file.getAbsolutePath();;
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

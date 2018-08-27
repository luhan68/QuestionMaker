/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomItems;

import java.util.Random;
import java.util.Vector;

public class GetRandomNames {

    public Vector SomeNames = new Vector();

    
    public String OneName(){
        String results = RandomNames(1).elementAt(0).toString();
        return results;
    }
    
    public Vector RandomNames(int num_names) {
        Vector results = new Vector();
        LoadList();
        Random rn = new Random();

        for (int i = 0; i < num_names ; i++) {
            boolean duplicate = true;
            String name = "";
            while (duplicate == true) {
                int randomnum = rn.nextInt(SomeNames.size() -1) + 1;
                name = SomeNames.elementAt(randomnum).toString();
                duplicate = ListContains(name, results);
            }
            results.addElement(name);

        }

        return results;
    }

    public boolean ListContains(String name, Vector list) {
        boolean contains = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.elementAt(i).toString().trim().equals(name.trim())) {
                contains = true;
            }
        }
        return contains;
    }

    public void LoadList() {
        SomeNames.addElement("Bob");
        SomeNames.addElement("Fred");
        SomeNames.addElement("Jane");
        SomeNames.addElement("Jack");
        SomeNames.addElement("Jill");
        SomeNames.addElement("David");
        SomeNames.addElement("Gene");
        SomeNames.addElement("Sue");
        SomeNames.addElement("Diana");
        SomeNames.addElement("Rudy");
        SomeNames.addElement("Mike");
        SomeNames.addElement("Martha");
        SomeNames.addElement("Ken");
        SomeNames.addElement("Barbie");
        SomeNames.addElement("Aaron");
        SomeNames.addElement("Eric");
        SomeNames.addElement("Peter");
        SomeNames.addElement("Claudia");
        SomeNames.addElement("Jeneva");
        SomeNames.addElement("Jenny");
        SomeNames.addElement("Ron");
        SomeNames.addElement("Don");
        SomeNames.addElement("Mark");
        SomeNames.addElement("Shawn");
        SomeNames.addElement("Veronica");
        SomeNames.addElement("Brandon");



    }
}

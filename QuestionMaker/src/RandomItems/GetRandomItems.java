package RandomItems;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class GetRandomItems {

    Vector SomeItems = new Vector(); // by default these are food
    Vector FoodItems = new Vector();
    Vector MoneyItems = new Vector();
    Vector PetItems = new Vector();
    Vector LocationItems = new Vector();

    public String OneItem() {
        String results = RandomItems(1).elementAt(0).toString();
        return results;
    }

    public String OneLocation() {
        String results = RandomLocations(1).elementAt(0).toString();
        return results;
    }

    public Vector RandomItems(int num_items) {
        Vector results = new Vector();
        LoadList();
        Random rn = new Random();

        for (int i = 0; i < num_items; i++) {
            boolean duplicate = true;
            String item = "";
            while (duplicate == true) {
                int randomnum = rn.nextInt(SomeItems.size() - 1) + 1;
                item = SomeItems.elementAt(randomnum).toString();
                duplicate = ListContains(item, results);
            }
            results.addElement(item);
        }

        return results;
    }

    public Vector RandomPets(int num_items) {
        Vector results = new Vector();
        LoadPets();
        Random rn = new Random();

        for (int i = 0; i < num_items; i++) {
            boolean duplicate = true;
            String item = "";
            while (duplicate == true) {
                int randomnum = rn.nextInt(PetItems.size() - 1) + 1;
                item = PetItems.elementAt(randomnum).toString();
                duplicate = ListContains(item, results);
            }
            results.addElement(item);
        }

        return results;
    }

    public Vector RandomLocations(int num_items) {
        Vector results = new Vector();
        LoadLocations();
        Random rn = new Random();

        for (int i = 0; i < num_items; i++) {
            boolean duplicate = true;
            String item = "";
            while (duplicate == true) {
                int randomnum = rn.nextInt(LocationItems.size()); // used to be rn.nextInt(PetItems.size() - 1) + 1
                item = LocationItems.elementAt(randomnum).toString();
                duplicate = ListContains(item, results);
            }
            results.addElement(item);
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

    public Vector GetList() {
        LoadList();
        return SomeItems;

    }

    public void LoadList() {
        SomeItems.addElement("apple");
        SomeItems.addElement("banana");
        SomeItems.addElement("blackberry");
        SomeItems.addElement("blueberry");
        SomeItems.addElement("broccoli");
        SomeItems.addElement("carrot");
        SomeItems.addElement("cherry");
        SomeItems.addElement("cookie");
        SomeItems.addElement("corn");
        SomeItems.addElement("eggplant");
        SomeItems.addElement("kiwi");
        SomeItems.addElement("muffin");
        SomeItems.addElement("onion");
        SomeItems.addElement("pear");
        SomeItems.addElement("pepper");
        SomeItems.addElement("pineapple");
        SomeItems.addElement("radish");
        SomeItems.addElement("strawberry");
        SomeItems.addElement("tomato");
    }

    public void LoadPets() {
        PetItems.addElement("Cats");
        PetItems.addElement("Dogs");
        PetItems.addElement("Fish");
        PetItems.addElement("Birds");
        PetItems.addElement("Hamsters");
        PetItems.addElement("Rabbits");
        PetItems.addElement("Turtles");

    }

    public void LoadLocations() {
        LocationItems.addElement("math class");
        LocationItems.addElement("park");
        LocationItems.addElement("plane");
        LocationItems.addElement("van");
        LocationItems.addElement("ball park");
        LocationItems.addElement("conference room");
        LocationItems.addElement("cafeteria");
        LocationItems.addElement("classroom");
        LocationItems.addElement("science class");
        LocationItems.addElement("movie");
        LocationItems.addElement("play");
        LocationItems.addElement("theater");
    }
}

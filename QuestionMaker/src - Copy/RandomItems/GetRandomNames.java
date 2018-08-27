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


        SomeNames.addElement("Jacob");
        SomeNames.addElement("Ethan");
        SomeNames.addElement("Michael");
        SomeNames.addElement("Jayden");
        SomeNames.addElement("William");
        SomeNames.addElement("Alexander");
        SomeNames.addElement("Noah");
        SomeNames.addElement("Daniel");
        SomeNames.addElement("Aiden");
        SomeNames.addElement("Anthony");
        SomeNames.addElement("Joshua");
        SomeNames.addElement("Mason");
        SomeNames.addElement("Christopher");
        SomeNames.addElement("Andrew");
        SomeNames.addElement("David");
        SomeNames.addElement("Matthew");
        SomeNames.addElement("Logan");
        SomeNames.addElement("Elijah");
        SomeNames.addElement("James");
        SomeNames.addElement("Joseph");
        SomeNames.addElement("Gabriel");
        SomeNames.addElement("Benjamin");
        SomeNames.addElement("Ryan");
        SomeNames.addElement("Samuel");
        SomeNames.addElement("Jackson");
        SomeNames.addElement("John");
        SomeNames.addElement("Nathan");
        SomeNames.addElement("Jonathan");
        SomeNames.addElement("Christian");
        SomeNames.addElement("Liam");
        SomeNames.addElement("Dylan");
        SomeNames.addElement("Landon");
        SomeNames.addElement("Caleb");
        SomeNames.addElement("Tyler");
        SomeNames.addElement("Lucas");
        SomeNames.addElement("Evan");
        SomeNames.addElement("Gavin");
        SomeNames.addElement("Nicholas");
        SomeNames.addElement("Isaac");
        SomeNames.addElement("Brayden");
        SomeNames.addElement("Luke");
        SomeNames.addElement("Angel");
        SomeNames.addElement("Brandon");
        SomeNames.addElement("Jack");
        SomeNames.addElement("Isaiah");
        SomeNames.addElement("Jordan");
        SomeNames.addElement("Owen");
        SomeNames.addElement("Carter");
        SomeNames.addElement("Connor");
        SomeNames.addElement("Justin");
        SomeNames.addElement("Jose");
        SomeNames.addElement("Jeremiah");
        SomeNames.addElement("Julian");
        SomeNames.addElement("Robert");
        SomeNames.addElement("Aaron");
        SomeNames.addElement("Adrian");
        SomeNames.addElement("Wyatt");
        SomeNames.addElement("Kevin");
        SomeNames.addElement("Hunter");
        SomeNames.addElement("Cameron");
        SomeNames.addElement("Zachary");
        SomeNames.addElement("Thomas");
        SomeNames.addElement("Charles");
        SomeNames.addElement("Austin");
        SomeNames.addElement("Eli");
        SomeNames.addElement("Chase");
        SomeNames.addElement("Henry");
        SomeNames.addElement("Sebastian");
        SomeNames.addElement("Jason");
        SomeNames.addElement("Levi");
        SomeNames.addElement("Xavier");
        SomeNames.addElement("Ian");
        SomeNames.addElement("Colton");
        SomeNames.addElement("Dominic");
        SomeNames.addElement("Juan");
        SomeNames.addElement("Cooper");
        SomeNames.addElement("Josiah");
        SomeNames.addElement("Luis");
        SomeNames.addElement("Ayden");
        SomeNames.addElement("Carson");
        SomeNames.addElement("Adam");
        SomeNames.addElement("Nathaniel");
        SomeNames.addElement("Brody");
        SomeNames.addElement("Tristan");
        SomeNames.addElement("Diego");
        SomeNames.addElement("Parker");
        SomeNames.addElement("Blake");
        SomeNames.addElement("Oliver");
        SomeNames.addElement("Cole");
        SomeNames.addElement("Carlos");
        SomeNames.addElement("Jaden");
        SomeNames.addElement("Jesus");
        SomeNames.addElement("Alex");
        SomeNames.addElement("Aidan");
        SomeNames.addElement("Eric");
        SomeNames.addElement("Hayden");
        SomeNames.addElement("Bryan");
        SomeNames.addElement("Max");
        SomeNames.addElement("Jaxon");
        SomeNames.addElement("Brian");
        SomeNames.addElement("Isabella");
        SomeNames.addElement("Sophia");
        SomeNames.addElement("Emma");
        SomeNames.addElement("Olivia");
        SomeNames.addElement("Ava");
        SomeNames.addElement("Emily");
        SomeNames.addElement("Abigail");
        SomeNames.addElement("Madison");
        SomeNames.addElement("Chloe");
        SomeNames.addElement("Mia");
        SomeNames.addElement("Addison");
        SomeNames.addElement("Elizabeth");
        SomeNames.addElement("Ella");
        SomeNames.addElement("Natalie");
        SomeNames.addElement("Samantha");
        SomeNames.addElement("Alexis");
        SomeNames.addElement("Lily");
        SomeNames.addElement("Grace");
        SomeNames.addElement("Hailey");
        SomeNames.addElement("Alyssa");
        SomeNames.addElement("Lillian");
        SomeNames.addElement("Hannah");
        SomeNames.addElement("Avery");
        SomeNames.addElement("Leah");
        SomeNames.addElement("Nevaeh");
        SomeNames.addElement("Sofia");
        SomeNames.addElement("Ashley");
        SomeNames.addElement("Anna");
        SomeNames.addElement("Brianna");
        SomeNames.addElement("Sarah");
        SomeNames.addElement("Zoe");
        SomeNames.addElement("Victoria");
        SomeNames.addElement("Gabriella");
        SomeNames.addElement("Brooklyn");
        SomeNames.addElement("Kaylee");
        SomeNames.addElement("Taylor");
        SomeNames.addElement("Layla");
        SomeNames.addElement("Allison");
        SomeNames.addElement("Evelyn");
        SomeNames.addElement("Riley");
        SomeNames.addElement("Amelia");
        SomeNames.addElement("Khloe");
        SomeNames.addElement("Makayla");
        SomeNames.addElement("Aubrey");
        SomeNames.addElement("Charlotte");
        SomeNames.addElement("Savannah");
        SomeNames.addElement("Zoey");
        SomeNames.addElement("Bella");
        SomeNames.addElement("Kayla");
        SomeNames.addElement("Alexa");
        SomeNames.addElement("Peyton");
        SomeNames.addElement("Audrey");
        SomeNames.addElement("Claire");
        SomeNames.addElement("Arianna");
        SomeNames.addElement("Julia");
        SomeNames.addElement("Aaliyah");
        SomeNames.addElement("Kylie");
        SomeNames.addElement("Lauren");
        SomeNames.addElement("Sophie");
        SomeNames.addElement("Sydney");
        SomeNames.addElement("Camila");
        SomeNames.addElement("Jasmine");
        SomeNames.addElement("Morgan");
        SomeNames.addElement("Alexandra");
        SomeNames.addElement("Jocelyn");
        SomeNames.addElement("Gianna");
        SomeNames.addElement("Maya");
        SomeNames.addElement("Kimberly");
        SomeNames.addElement("Mackenzie");
        SomeNames.addElement("Katherine");
        SomeNames.addElement("Destiny");
        SomeNames.addElement("Brooke");
        SomeNames.addElement("Trinity");
        SomeNames.addElement("Faith");
        SomeNames.addElement("Lucy");
        SomeNames.addElement("Madelyn");
        SomeNames.addElement("Madeline");
        SomeNames.addElement("Bailey");
        SomeNames.addElement("Payton");
        SomeNames.addElement("Andrea");
        SomeNames.addElement("Autumn");
        SomeNames.addElement("Melanie");
        SomeNames.addElement("Ariana");
        SomeNames.addElement("Serenity");
        SomeNames.addElement("Stella");
        SomeNames.addElement("Maria");
        SomeNames.addElement("Molly");
        SomeNames.addElement("Caroline");
        SomeNames.addElement("Genesis");
        SomeNames.addElement("Kaitlyn");
        SomeNames.addElement("Eva");
        SomeNames.addElement("Jessica");
        SomeNames.addElement("Angelina");
        SomeNames.addElement("Valeria");
        SomeNames.addElement("Gabrielle");
        SomeNames.addElement("Naomi");
        SomeNames.addElement("Mariah");
        SomeNames.addElement("Natalia");
        SomeNames.addElement("Paige");
        SomeNames.addElement("Rachel");
        SomeNames.addElement("Rachel");
        SomeNames.addElement("Beyonce");
        SomeNames.addElement("Jayla");
        SomeNames.addElement("Ayana");
        SomeNames.addElement("Zari");
        SomeNames.addElement("Laqueta");
        SomeNames.addElement("Aisha");
        SomeNames.addElement("Kimani");
        SomeNames.addElement("Kayla");
        SomeNames.addElement("Shaniqua");
        SomeNames.addElement("Imani");
        SomeNames.addElement("Demarco");
        SomeNames.addElement("Dion");
        SomeNames.addElement("Chikae");
        SomeNames.addElement("Deion");
        SomeNames.addElement("Malik");
        SomeNames.addElement("Darius");
        SomeNames.addElement("Deon");
        SomeNames.addElement("Demond");
        SomeNames.addElement("Elon");
        SomeNames.addElement("Taye");
        SomeNames.addElement("Alexander");
        SomeNames.addElement("Sebastián");
        SomeNames.addElement("Daniel");
        SomeNames.addElement("Ángel");
        SomeNames.addElement("Santiago");
        SomeNames.addElement("Diego");
        SomeNames.addElement("Alejandro");
        SomeNames.addElement("Christopher");
        SomeNames.addElement("David");
        SomeNames.addElement("Anthony");
        SomeNames.addElement("Sophia");
        SomeNames.addElement("Camila");
        SomeNames.addElement("Isabella");
        SomeNames.addElement("Valeria");
        SomeNames.addElement("Mia");
        SomeNames.addElement("Allison");
        SomeNames.addElement("Gabriela");
        SomeNames.addElement("Emily");
        SomeNames.addElement("Ashley");
        SomeNames.addElement("Nicole");



    }
}

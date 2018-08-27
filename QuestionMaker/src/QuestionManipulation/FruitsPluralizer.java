/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionManipulation;

/**
 *
 * @author gene
 */
public class FruitsPluralizer {
    
    public String CheckFruitPlural(String text){
        String results = text;
        if(ContainFruit(text)){
           results = ReplaceText(text);
        }
        
        
        return results;
    }
    
    
    
    public String ReplaceText(String text){
        String results = "";
        String item = "";
        String item_singular = "";
        
         if(text.contains("apple")){item_singular = "apple"; item = "apples";}
       if(text.contains("banana")){item_singular = "banana"; item = "bananas";}
       if(text.contains("blackberry")){item_singular = "blackberry"; item = "blackberries";}
       if(text.contains("blueberry")){item_singular = "blueberry"; item = "blueberries";}
       if(text.contains("broccoli")){item_singular = "broccoli"; item = "pieces of broccoli";}
       if(text.contains("carrot")){item_singular = "carrot"; item = "carrots";}
       if(text.contains("cherry")){item_singular = "cherry"; item = "cherries";}
       if(text.contains("cookie")){item_singular = "cookie"; item = "cookies";}
       if(text.contains("corn")){item_singular = "corn"; item = "pieces of corn";}
       if(text.contains("eggplant")){item_singular = "eggplant"; item = "eggplants";}
       if(text.contains("kiwi")){item_singular = "kiwi"; item = "kiwi";}
       if(text.contains("muffin")){item_singular = "muffin"; item = "muffins";}
       if(text.contains("onion")){item_singular = "onion"; item = "onions";}
       if(text.contains("pear")){item_singular = "pear"; item = "pears";}
       if(text.contains("pepper")){item_singular = "pepper"; item = "peppers";}
       if(text.contains("pineapple")){item_singular = "pineapple"; item = "pineapples";}
       if(text.contains("radish")){item_singular = "radish"; item = "radishes";}
       if(text.contains("strawberry")){item_singular = "strawberry"; item = "strawberries";}
       if(text.contains("tomato")){item_singular = "tomato"; item = "tomatos";}
        
        results = text.replaceAll(item_singular, item);

        return results;
    }
    
    
    public boolean ContainFruit(String text){
        boolean results = false;
      if(text.contains("apple")){results = true;}
       if(text.contains("banana")){results = true;}
       if(text.contains("blackberry")){results = true;}
       if(text.contains("blueberry")){results = true;}
       if(text.contains("broccoli")){results = true;}
       if(text.contains("carrot")){results = true;}
       if(text.contains("cherry")){results = true;}
       if(text.contains("cookie")){results = true;}
       if(text.contains("corn")){results = true;}
       if(text.contains("eggplant")){results = true;}
       if(text.contains("kiwi")){results = true;}
       if(text.contains("muffin")){results = true;}
       if(text.contains("onion")){results = true;}
       if(text.contains("pear")){results = true;}
       if(text.contains("pepper")){results = true;}
       if(text.contains("pineapple")){results = true;}
       if(text.contains("radish")){results = true;}
       if(text.contains("strawberry")){results = true;}
       if(text.contains("tomato")){results = true;}
        
        return results;
    }
    
    
    
    
    
    
    
    
}

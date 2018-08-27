/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomItems;

/**
 *
 * @author gene
 */
public class Tester {
    
    public static void main (String [] args){
            GetRandomItems rnd_items = new GetRandomItems();
        String item = rnd_items.OneItem();
        CreateImageFromBase bs = new CreateImageFromBase();
        
        bs.Create(item, 6, item, 7, true, false);
        
    }
    
    
    
}

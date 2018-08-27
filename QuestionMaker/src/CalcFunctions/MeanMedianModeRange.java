/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcFunctions;

/**
 *
 * @author Karl
 */
public class MeanMedianModeRange {
    /*
    public int findMean(int[] a, int size){
        int total = 0;
        int mean = 0;
        int remainder = 0;
        
        for(int i = 0; i < size; i++){
            total += a[i];
        }
        mean = total/size;
        remainder = total%size;
        
        if(remainder != 0){
            return -1;
        }
        
        return mean;
    }
    
    public int findMedian(int[] a, int size){
        int[] sorted = new int[size];
        int median = 0;
        
        for(int i = 0; i < size; i++){
            
        }
    }
    
    public int findMode(int[] a, int size){
        int[] allFrequencies = new int[size]; //corresponds to order of array a
        int mode = 0;
        int currentFrequency = 0; // how often value shows up
        
        for(int i = 0; i < size; i++){
            mode = a[i];
            
            for(int j = 0; j < size; j++){ // find how often value shows up
                if(mode == a[j]){
                    currentFrequency++;
                }
            }
            allFrequencies[i] = currentFrequency;
            currentFrequency = 0;
        }
        
        int mostFrequent = 0;
        int position = 0;
        int currentValue = 0;
        for(int i = 0; i < size; i++) //find largest highestFrequency in array
        {
            
            if(allFrequencies[i] > mostFrequent){
                mostFrequent = a[i];
                position = i;
            }
        }
        
        int numberOfModes = 0;
        int currentFrequency = 0;
        for(int i = 0; i < size; i++){
            /* find how many times mostFrequent appears (in other words
            find how many modes there are) 
            
            currentFrequency = allFrequencies[i];
            if(currentFrequency == mostFrequent){
                
            }
        }
        
        if(numberOfModes > 1){ // return -1 if there is more than one mode
            return -1;
        }
        
        mode = a[position];
        
        return mode;
    }*/
}
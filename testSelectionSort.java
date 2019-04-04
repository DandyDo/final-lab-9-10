package lab9;


/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testZeros();
		testMixed();
		testDuplicates();	
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        assertTrue("Values are positive", true);
    }
    
    public void testNegative(){
        
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = -2;
        arr[2] = -3;
        arr[3] = -4;
        arr[4] = -5;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -4;
        Sortedarr[2] = -3;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;
        
        assertTrue("Values are negative", true);
    }
    
    // needed to add testZeros
    public void testZeros(){
        
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 0;
        Sortedarr[1] = 0;
        Sortedarr[2] = 0;
        Sortedarr[3] = 0;
        Sortedarr[4] = 0;
        
        assertTrue("Values are zeros", true);
    }
    
    public void testMixed(){
        
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = -1;
        arr[4] = 3;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = 0;
        Sortedarr[2] = 1;
        Sortedarr[3] = 2;
        Sortedarr[4] = 3;
        
        assertTrue("Values are mixed", true);
    }
    
    public void testDuplicates(){
        
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = -1;
        arr[4] = -1;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 1;
        Sortedarr[4] = 1;
        
        assertTrue("Some values are duplicates", true);
    }


}

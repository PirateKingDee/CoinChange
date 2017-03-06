/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;

/**
 *
 * @author Andy
 */

import java.util.LinkedList;
import java.util.ListIterator;
public class CoinChange {
    
    private LinkedList<Integer> coinSet;
    public CoinChange(){
        coinSet = null;
    }
    public CoinChange(LinkedList<Integer> coinSet){
        this.coinSet = coinSet;
    }
    public LinkedList<Integer> leastCoins(int target){
        int curAmount = 0;
        LinkedList<Integer> change = new LinkedList<>();
        while(curAmount != target){
            ListIterator coinList = coinSet.listIterator();
            
            
        }
        return  change;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

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
    LinkedList<Integer> curSet;
    LinkedList<Integer> changeSet;
    int min;
    public CoinChange(){
        changeSet = new LinkedList();
        min = Integer.MAX_VALUE;
        curSet = new LinkedList<>();
    }
    public int coinChange(int[] coins, int amount) {
        return coinChange(0, coins, amount, 0);
    }

    private int coinChange(int idxCoin, int[] coins, int amount, int counter){
        
        for(int i = idxCoin; i<coins.length; i++){
            if(counter < min){
                if(amount==coins[i]){
                    counter +=1;
                    curSet.add(coins[i]);
                    if(changeSet == null){
                        changeSet.addAll(curSet);
                    }
                    else{
                        changeSet = new LinkedList(curSet);
                    }
                    
                    min = counter;
                    curSet.removeLast();
                    curSet.removeLast();

                    return counter;
                }
                else if(amount > coins[i]){
                    curSet.add(coins[i]);
                    counter +=1;
                    coinChange(i, coins, amount-coins[i], counter);

                }
            } 
        }
        if(curSet.isEmpty()){
            
        }
        else{
            curSet.removeLast();
            
        }
        return counter;
             
    }  
    public LinkedList<Integer> getChange(){
        return changeSet;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] coinSet = {50, 25, 20, 10, 5, 1};
                CoinChange coin = new CoinChange();
        System.out.println(coin.coinChange(coinSet, 75));
        System.out.println(coin.getChange());
    }
    
}

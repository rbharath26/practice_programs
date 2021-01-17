import java.util.*;
public class CoinWorld2{

     public static void main(String []args){
        System.out.println("Hello World");
        CoinWorld2 hw = new CoinWorld2();
       // System.out.println(hw.min_coins(31));
        int passedCoin =31;
        
         Integer[] coinList = {25,10,1};
         Integer[] coinListCopy =coinList;
         TreeSet  set = new TreeSet();
         ArrayList totalCoinList = new ArrayList();
         int coinListLenght = coinList.length;
          for (int i=0;i<coinListLenght;i++){
              totalCoinList.add(hw.min_coins_new(passedCoin,coinList));
              List<Integer> list = new ArrayList<Integer>(Arrays.asList(coinList));
               
              // set1 =(TreeSet<Integer>)set1.descendingSet();
               // Set<Integer> set1 = new TreeSet<Integer>( Collections.reverseOrder() ) ;
                
                  
              // set1.remove(i);
             
               System.out.println("new set "+list.toString());
               list.remove(0);
               coinList =Arrays.copyOf(list.toArray(), list.toArray().length, Integer[].class);
                System.out.println("new coinlist "+coinList.toString());
              // coinList = set1.toArray();
              
          }
          System.out.println(totalCoinList);
        
     }
     
  public int min_coins_new(int money,Integer[] coinlist){
        ArrayList a = new ArrayList();
        
         if (money<1) {
             return 0;
         }
         Integer[] coins = coinlist;
         int no_of_coins = 0;
         int curr_coins_no;
         for (int i=0;i<coins.length;i++){
            curr_coins_no = money/(coins[i]);
             no_of_coins+=curr_coins_no ;
              System.out.println("old money"+money);
             money = money%(coins[i]);
             System.out.println("new money"+money);
              System.out.println("hw.min_coins()"+no_of_coins);
            for (int j=0;j<curr_coins_no;j++){
             a.add(coins[i]);
            }
             if (money==0) {
                 break;
             }
         }
         System.out.println(a);
         return no_of_coins;
     }
     
     public int min_coins(int money){
        ArrayList a = new ArrayList();
        
         if (money<1) {
             return 0;
         }
         int[] coins = {25,10,5,1};
         int no_of_coins = 0;
         int curr_coins_no;
         for (int i=0;i<coins.length;i++){
            curr_coins_no = money/(coins[i]);
             no_of_coins+=curr_coins_no ;
              System.out.println("old money"+money);
             money = money%(coins[i]);
             System.out.println("new money"+money);
              System.out.println("hw.min_coins()"+no_of_coins);
            for (int j=0;j<curr_coins_no;j++){
             a.add(coins[i]);
            }
             if (money==0) {
                 break;
             }
         }
         System.out.println(a);
         return no_of_coins;
     }
     
}

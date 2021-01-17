import java.util.*;
public class CoinWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        CoinWorld hw = new CoinWorld();
        System.out.println(hw.min_coins(17));
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

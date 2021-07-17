import java.util.HashMap;
import java.util.Arrays;

public class DomainCounter{

    public static void main(String[] args)
    {
       String[] list={"900 google.mail.com", "50 yahoo.mail.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(list);
    }
   
    public static void subdomainVisits(String[] cpdomains) {
         HashMap<String, Integer> domainCount = new HashMap<String, Integer>();
        for (int i = 0; i < cpdomains.length; i++) {
 
            String[] splited = cpdomains[i].split("\\s+");
            System.out.println(Arrays.toString(splited));
            String completeDomain =splited[1];
           
            String[] domainSplited = splited[1].split("\\.");
            System.out.println(Arrays.toString(domainSplited));
            String strAppend= new String();
            for (int j = domainSplited.length-1; j >= 0 ; j--) {
                System.out.println(domainSplited[j]+"index :"+j);
                
                 
               if(j!=domainSplited.length-1){
               
                System.out.println("strAppend: "+strAppend);
                strAppend = domainSplited[j]+"."+strAppend;
                 System.out.println("strAppend: "+strAppend);
               }else{
                 strAppend = domainSplited[j];  
               }
               
               if(completeDomain.contains(strAppend)){
                    Integer oldCount =0;
                    Integer total =0;
                    if(domainCount.get(strAppend)!= null){
                     oldCount = (Integer)domainCount.get(strAppend);
                    }
                    total =oldCount+Integer.parseInt(splited[0]);
                    domainCount.put(strAppend,total);
                }
               
                /*if(completeDomain.contains(domainSplited[j])){
                    Integer oldCount =0;
                    Integer total =0;
                    if(domainCount.get(domainSplited[j])!= null){
                     oldCount = (Integer)domainCount.get(domainSplited[j]);
                    }
                    total =oldCount+Integer.parseInt(splited[0]);
                    domainCount.put(domainSplited[j],total);
                }*/
                
                
               
            }
           
            domainCount.put(splited[1],Integer.parseInt(splited[0]));
           

        }
       System.out.println(domainCount);
       
    }

}

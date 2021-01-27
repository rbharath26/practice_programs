/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class StringMatchProgram
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(patternmatching("abc","a.n"));
		System.out.println(patternmatching("bbbn","b**."));
		System.out.println(patternmatching("bbbbn","b***."));
		System.out.println(patternmatching("abbbbn",".b*n"));
	}
	
	public static boolean patternmatching(String s,String p){
	    int lenS= s.length();
	    int lenP= p.length();
	    boolean match = false;
	    if(lenS==lenP){
	        for(int i=0;i<lenS;i++){
	            if(s.charAt(i)==p.charAt(i)){
	               continue;
	            }else if(p.charAt(i)=='.'){
	               continue;
	            }else if(p.charAt(i)=='*'){
	               int j=i;
	               for(int k=j;k>=0;k--){
	                   if((s.charAt(i)==p.charAt(k)) || (p.charAt(k)=='*')){
	                    continue;
    	               }else{
    	                   return false;
    	               }
	               }
	               
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }
	    if(lenS>lenP){
	        int si = 0;
	        boolean isbreak = false;
	        char lastMatchChar = Character.MIN_VALUE;
	        if(p.contains("*")){
	            for(int i=0;i<lenP;i++){
	            if(s.charAt(i)==p.charAt(si)){
	                si++;
	                lastMatchChar =p.charAt(si);
	               continue;
	            }else if(p.charAt(i)=='.'){
	                si++;
	               continue;
	            }else if(p.charAt(i)=='*'){
	               int j=i;
	               isbreak = false;
	               for(int k=j;k<lenS;k++){
	                   if((lastMatchChar==s.charAt(k)) ){
	                    continue;
    	               }else{
    	                   si =k;
    	                   isbreak =true;
    	                   break;
    	                   
    	               }
	               }
	               if(!isbreak)
	                return true;
	               
	            }else{
	                return false;
	            }
	        }
	            
	        }else{
	            return false;
	        }
	    }
	    return match;
	    
	}
}

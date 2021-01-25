/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;

public class Main
{
	public static int [] quicksort(int [] array,int start, int end){
	    System.out.println("start " +start);
	    System.out.println("end " +end);
	    if(start<end){
    	    int pivot=partition(array,start,end);
    	    System.out.println("start pre pre pivot " +pivot);
    	     int pivottemp=pivot;
    	    quicksort(array,start,pivottemp-1);
    	    System.out.println("start pre pivot " +pivot);
    	    System.out.println("start pre pivot start " +start);
	        System.out.println("end " +end);
    	    quicksort(array,pivot+1,end);
	    }
	    return array;
	
	}
	
	public static int partition(int [] array,int start, int end){
	    int index = start;
	    int pivot =array[end];
	    System.out.println("index " +index);
	    System.out.println("pivot " +pivot);
	    System.out.println("end " +end);
	    for(int i=start;i<end;i++){
	        System.out.println("array[i] " +array[i]+"i value"+i+":index :"+index+"array[index] :"+array[index]);
	        if(array[i]<=pivot){
	            System.out.println("Prep1 Swap" +Arrays.toString(array));
	            array=swap(i,index,array);
	            System.out.println("Prep1 After  Swap" +Arrays.toString(array));
	            index=index+1;
	        }
	    }
	    System.out.println("index after" +index);
	    System.out.println("pivot  after" +pivot);
	     System.out.println("Prep2 Swap" +Arrays.toString(array));
	    array=swap(index,end,array);
	    System.out.println("Prep2 After  Swap" +Arrays.toString(array));
	    return index;
	    
	}
	
	private static int[] swap(int i, int j, int[] arr) {
   int t = arr[i];
   arr[i] = arr[j];
   arr[j] = t;
   return arr;
  // System.out.println(Arrays.toString(arr)); // print array passed in
}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] array1={2,9,1,6,5};
		quicksort(array1,0,(array1.length-1));
		 System.out.println("After sort" +Arrays.toString(array1));
		
	}
}

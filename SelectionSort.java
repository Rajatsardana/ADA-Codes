package JavaCodes;

	import java.util.*;
	class SelectionSortADA{
	   public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	     // System.out.print("Enter size of an array : ");
	     // int l = sc.nextInt();
	      int l =100000;
	      int arr[] = new int[l];
	      System.out.println("Enter elements of array");
	      for(int i=0; i<l ; i++){
	        // System.out.print((i+1)+"  :  ");
	         arr[i] = r.nextInt(100000);
	      }
	      BubbleSortADA b = new BubbleSortADA();
	      InsertionSortADA in = new InsertionSortADA();
	      
	      long startTime = System.nanoTime();
	     // selectionSort(arr);
	    //  b.bubble_Sort(arr); 
	      in.sort(arr);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000000.0;
	      System.out.println("Took "+t+ " s"); 
	    
	      
	      for(int i=0; i<l ; i++){
	         System.out.print(arr[i]+"  ");
	      }
	      
	      
	      
	   }
	   public static void selectionSort(int[] arr){
	      int l = arr.length;
	      for(int i=0; i<l-1 ; i++){
	         int a = min(i,l,arr);
	         int temp = arr[a]; 
	         arr[a] = arr[i]; 
	         arr[i] = temp;
	      }
	   }
	   public static int min(int n , int l , int[] arr){
	      int a = n; 
	      for (int j = n+1; j < l; j++) 
	          if (arr[j] < arr[a]) 
	              a = j;
	      return a;
	   }
	}



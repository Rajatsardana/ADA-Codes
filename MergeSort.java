package JavaCodes;

	import java.util.*;
	public class MergeSortADA{
	   public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	      int size = 1000;
	      int[] arr = new int[size];
	      System.out.println("RANDOM");
	      for(int i=0; i<size ; i++){
	         arr[i] = r.nextInt(size);

	      }
	      long startTime = System.nanoTime();
	      sort(arr,0,size-1);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000.0;
	      System.out.println("Took "+t+ " ms");
	      printarr(arr,size);

	      aes(arr,size);
	      des(arr,size);
	      same(arr,size);        
	      
	   }
	   
	   public static void printarr(int[] arr,int size){
	      for(int i=0; i<size ; i++){
	         System.out.print(arr[i]+"  ");
	      }

	   }
	   
	   public static void same(int[] arr,int size){
	      System.out.println("\nSAME");
	      
	       for(int i = 0; i<size; i++){   //same
	         arr[i] = 20;
	      }
	      long startTime = System.nanoTime();
	      sort(arr,0,size-1);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000.0;
	      System.out.println("Took "+t+ " ms");
	      printarr(arr,size);
	   }

	   
	   
	   public static void aes(int[] arr,int size){
	      System.out.println("\nAESCENDING");
	      
	       for(int i = 0; i<size; i=i+1){   //ascending
	         arr[i] = i+20;
	      }
	      long startTime = System.nanoTime();
	      sort(arr,0,size-1);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000.0;
	      System.out.println("Took "+t+ " ms");
	      printarr(arr,size);
	   }
	   
	   public static void des(int[] arr,int size){
	      System.out.println("\nDESCENDING");
	      int k = 0;
	      for(int i = size; i>0; i--){   //descending
	         arr[k] = i;
	         k=k+1;
	      }
	       
	      long startTime = System.nanoTime();
	      sort(arr,0,size-1);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000.0;
	      System.out.println("Took "+t+ " ms");
	      printarr(arr,size);
	   }
	   
	   public static void sort(int arr[], int l, int r){
	      if (l < r){
	         int m = (l + r) / 2;
	         sort(arr, l, m);
	         sort(arr, m + 1, r);
	         merge(arr, l, m, r);
	     }
	  }
	  
	   public static void merge(int arr[], int l, int m, int r){
	        int size1 = m - l + 1;  //size of array1
	        int size2 = r - m;      // size of array2
	 
	        int Left[] = new int[size1]; //array 1 after splitting
	        int Right[] = new int[size2]; //array 2 after splitting
	 
	        for (int i = 0; i < size1; ++i) //copying elements in left array
	            Left[i] = arr[l + i];
	        for (int j = 0; j < size2; ++j) //copying elements in right array
	            Right[j] = arr[m + 1 + j];
	 
	        int i = 0, j = 0;
	        int k = l;
	        while (i < size1 && j < size2){
	            if (Left[i] <= Right[j]){
	                arr[k] = Left[i];
	                i++;
	            }
	            else{
	                arr[k] = Right[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < size1){    //Copying elements to Left array
	            arr[k] = Left[i];
	            i++;
	            k++;
	        }
	        while (j < size2){     //Copying remaining elements to Right array
	            arr[k] = Right[j];
	            j++;
	            k++;
	        }
	    }
	 
	      
	}

}

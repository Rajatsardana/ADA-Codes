package JavaCodes;

	import java.util.*;
	class QuicksortADA{
	static int c = 0;
	   public static void main(String args[]){
	     Scanner sc =new Scanner(System.in);
	     Random r = new Random();
	     int beg = 0;
	     int end;

	     int l = 3;
	     end = l-1;
	     int arr[] = new int[l];
	     for(int i=0; i<l ; i++){
	         arr[i] = r.nextInt(l);

	      }
//	      find_time(arr,l);
	     
	     rand(arr,l);
	     aes(arr,l);
	     des(arr,l);
	     same(arr,l); 
	   

	   }
	   
	   
	   public static void find_time(int[] arr,int size){
	      long startTime = System.nanoTime();
	      quick_sort(arr,0,size-1);
	      long endTime = System.nanoTime();
	      double t = (endTime - startTime)/1000000.0;
	      System.out.println("Took "+t+ " ms");
	      printarr(arr,size);
	   }
	   
	   public static void printarr(int[] arr,int size){
	      for(int i=0; i<size ; i++){
	         System.out.print(arr[i]+"  ");
	      }

	   }
	   public static void rand(int[] arr,int size){
	      System.out.println("RANDOM");
	      find_time(arr,size);
	      System.out.print("\nQUICKSORT has been recursively called "+c+" times");


	   }
	   
	   public static void aes(int[] arr,int size){
	      c=0;
	      System.out.println("\nAESCENDING");
	       for(int i = 0; i<size; i=i+1){   //ascending
	         arr[i] = i+20;
	      }
	      find_time(arr,size);
	      System.out.print("\nQUICKSORT has been recursively called "+c+" times");
	   }
	   
	   public static void des(int[] arr,int size){
	      c=0;
	      System.out.println("\nDESCENDING");
	      int k = 0;
	      for(int i = size; i>0; i--){   //descending
	         arr[k] = i;
	         k=k+1;
	      }
	       
	      find_time(arr,size);
	      System.out.print("\nQUICKSORT has been recursively called "+c+" times");
	   }
	   
	   public static void same(int[] arr,int size){
	      c=0;
	      System.out.println("\nSAME");
	      
	       for(int i = 0; i<size; i++){   //same
	         arr[i] = 17;
	      }
	      find_time(arr,size);
	      System.out.print("\nQUICKSORT has been recursively called "+c+" times");
	   }


	   
	   public static void quick_sort(int []arr,int beg,int end){
	      c=c+1;
	      if(beg<end){
	         int num = partition(arr,beg,end);
	         quick_sort(arr,beg,num-1);
	         quick_sort(arr,num+1,end);  
	      }   
	      

	   }
	   
	   public static int partition(int arr[], int beg, int end){
	      int loc = beg;
	      int l = beg;
	      int r = end;
	      int flag = 0;
	      while(flag==0){
	         while(arr[loc]<=arr[r] && loc!=r){
	            r=r-1;
	         }
	         if(loc==r){
	         
	            flag=100;
	         }
	         else if(arr[loc]>arr[r]){
	            int temp = arr[loc];
	            arr[loc] = arr[r];
	            arr[r] = temp;
	            loc=r;
	         }
	         
	         if(flag==0){
	            while(arr[loc]>=arr[l] && loc!=l){
	            l=l+1;
	         }
	         if(loc==l){
	         
	            flag=100;
	         }
	         else if(arr[loc]<arr[l]){
	            int temp = arr[loc];
	            arr[loc] = arr[l];
	            arr[l] = temp;
	            loc=l;
	         }
	         }
	      }
	      return loc;
	      
	   }
	}




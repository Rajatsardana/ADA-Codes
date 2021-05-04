package JavaCodes;

public class knapsack {
	public class knapsack01 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int num=5;
	        int[] bi= {15,17,12,18,14};
			int[] wi= {5,3,7,6,4};
			System.out.println("Enter the capacity:");
			int W= sc.nextInt();
			int[][] p=new int[num+1][W+1];
			int[] A= new int[W+1];
			int[] B= new int[W+1];
			for(int i=0;i<=W;i++) {
				B[i]=0;
			}
			for(int k=0;k<num;k++) {
				for(int m=0;m<=W;m++) {
					A[m]=B[m];
				}
				for(int w=wi[k];w<=W;w++) {
					if(A[w-wi[k]]+bi[k]>A[w]) {
						B[w]=A[w-wi[k]]+bi[k];
					}
				}
				for(int m=0;m<=W;m++) {
					p[k+1][m]=B[m];
				}
			}
			int i=num;
			int k=W;
			int we=0;
			int sum=0;
			while(i>0 && k>0) {
				if(p[i][k]!= p[i-1][k]) {
					System.out.println("Weights:"+wi[i-1]);
					we=we+wi[i-1];
					sum=sum+bi[i-1];
					k=k-wi[i-1];
					i=i-1;
				}
				else {
					i=i-1;
				}
			}
			System.out.println("Total weight:"+we);
			System.out.println("Total profit:"+sum);
		}

	}
}

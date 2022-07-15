package maxsubarraySum;

class Matrix{
	public static int maxSumRectangle(int[][] arr, int n, int m)
    {
    int sum=0,maxsum=0;
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             sum=sum+arr[i][j];
             maxsum=Math.max(maxsum,sum);
             if(sum<0)
             {
                 sum=0;
             }
         }
         
     }
    return maxsum;
    }
}

public class Maxsum_matrix {
	
	public static void main(String[] args) {
	
		
		
		int[][] ar= {{-1,1},{2,2}};
		
		int sumof=Matrix.maxSumRectangle(ar,2,2);
		System.out.println("maxsum = "+sumof);
	}

}

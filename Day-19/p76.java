import java.util.*;
public class p76
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("Enter the matrix rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the matrix a elements");
        int a[][]=new int[n][m];
        //SUM OF DIAGONAL  OF  MATRICES
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();//For matrix
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal of matrix is:");
        System.out.println(sum);       
    }
}

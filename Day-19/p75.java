import java.util.*;
public class p75
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the matrix rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c[][]=new int[n][m];
        System.out.println("Enter the matrix a elements");
        int a[][]=new int[n][m];
        //TRANSPOSE OF TWO MATRICES
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();//For matrix
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
             c[j][i]=a[i][j];
            }
        }
        System.out.println("Transpose of matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(+c[i][j] + " ");//Displaying matrix c
            }
            System.out.println();
        }    

        
    }
}

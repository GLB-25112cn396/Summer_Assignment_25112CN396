import java.util.*;
public class p74
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the matrix rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the matrix a elements");
        int a[][]=new int[n][m];
        //SUBTRACTION OF TWO MATRICES
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();//For first matrix
            }
        }
        System.out.println("Enter the matrix b elements");
        int b[][]=new int[n][m];
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
                b[i][j]=sc.nextInt();//For second matrix 
            }
        }
        int c[][]=new int[n][m];//Subtraction of two matrix
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
                c[i][j]=a[i][j]-b[i][j];//a[][]>b[][]
            }
        }
        System.out.println("The subtraction of matrices is:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(+c[i][j] + " ");//Displaying matrix c
            }
            System.out.println();
        }    

        
    }
}

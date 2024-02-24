import java.util.Scanner;
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int tMatrix[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               tMatrix[j][i]=matrix[i][j];
            }
        }
        System.gc();
        return tMatrix;
    }
    public static void main(String[] args) {
        TransposeMatrix tm=new TransposeMatrix();
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of elements in the array:");
        m=sc.nextInt();
        n=sc.nextInt();
        int nums[][]=new int[m][n];
        System.out.println("Enter the number of elements into the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int output[][]=tm.transpose(nums);
        System.out.println("The array after transposing of the matrix is:");
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output[0].length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class pjk1{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n = sc1.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] matrix3 = new int[n][n];
 System.out.println("Enter elements of Matrix1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc1.nextInt();
            }
        }
  System.out.println("Enter elements of Matrix2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc1.nextInt();
            }
        }
       for (int i = 0; n > i; i++) {
            for (int j = 0; j < n; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + "\t");
}
            System.out.println();
        }

        sc1.close();
    }
}


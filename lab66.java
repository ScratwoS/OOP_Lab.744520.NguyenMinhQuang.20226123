import java.util.Scanner;

public class lab66 {
    public static void main(String args[])
    {
        int a, b, x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows of matrix :");
        a = sc.nextInt();
        System.out.print("Number of columns of matrix :");
        b  = sc.nextInt();

        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.print("Input elements of first matrix :");

        for (  x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                array1[x][y] = sc.nextInt();

        System.out.print("Input the elements of second matrix :");

        for ( x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                array2[x][y] = sc.nextInt();

        for ( x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                sum[x][y] = array1[x][y] + array2[x][y];

        System.out.print("Sum of the matrices : ");

        for ( x = 0 ; x < a ; x++ )
        {
            for ( y = 0 ; y < b ; y++ )
                System.out.print(sum[x][y]+"\t");

            System.out.println();
        }
    }
}
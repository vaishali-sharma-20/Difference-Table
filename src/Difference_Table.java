import java.lang.*;
import java.util.Scanner;

public class Difference_Table {
    public static void main(String args[]) {
        int i, j, n;
        float x[] = new float[20];
        float y[][] = new float[20][20];
        Scanner sc = new Scanner(System.in);
        /* Input Section */
        System.out.println("Enter number of data: ");
        n = sc.nextInt();
        System.out.println("Enter data: ");
        for(i = 0; i < n ; i++)
        {
            System.out.print("x[" + i + "] = ");
            x[i]=sc.nextFloat();
            System.out.print("y[" + i +"] = ");
            y[i][0]=sc.nextFloat();
        }
        /* Generating Forward Difference Table */
        for(i = 1; i < n; i++)
        {
            for(j = 0; j < n-i; j++)
            {
                y[j][i] = y[j+1][i-1] - y[j][i-1];
            }
        }
        System.out.println("FORWARD DIFFERENCE TABLE");
        for(i = 0; i < n; i++)
        {
            System.out.print(x[i]);
            for(j = 0; j < n-i ; j++)
            {
                System.out.print("\t" + y[i][j]);
            }
            System.out.println();
        }
    }
}

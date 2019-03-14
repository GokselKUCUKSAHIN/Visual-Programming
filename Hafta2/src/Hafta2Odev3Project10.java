import java.util.Scanner;

public class Hafta2Odev3Project10
{

    //Matris Çarpımı
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Matrisin Satır sayısı (R): ");
        int r1 = Integer.parseInt(scan.nextLine());
        System.out.print("1. Matrisin Kolon sayısı (C): ");
        int c1 = Integer.parseInt(scan.nextLine());
        System.out.print("2. Matrisin Satır sayısı (R): ");
        int r2 = Integer.parseInt(scan.nextLine());
        System.out.print("2. Matrisin Kolon sayısı (C): ");
        int c2 = Integer.parseInt(scan.nextLine());
        //
        long[][] matrix = new long[r1][c2];
        //
        long[][] priMatrix = new long[r1][c1];
        long[][] secMatrix = new long[r2][c2];
        //
        for (int r = 0; r < r1; r++)
        {
            for (int c = 0; c < c1; c++)
            {
                System.out.printf("1. Matrisin %d. Satırının %d. elemanını girin: ", r + 1, c + 1);
                priMatrix[r][c] = Long.parseLong(scan.nextLine());
            }
        }
        System.out.println("1. Matris Tamam!");
        //
        for (int r = 0; r < r2; r++)
        {
            for (int c = 0; c < c2; c++)
            {
                System.out.printf("2. Matrisin %d. Satırının %d. elemanını girin: ", r + 1, c + 1);
                secMatrix[r][c] = Long.parseLong(scan.nextLine());
            }
        }
        System.out.println("Oluşturuldu\n1.Matris:");
        printMatrix(priMatrix);
        System.out.println("2.Matris:");
        printMatrix(secMatrix);
        System.out.println();
        //
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                matrix[i][j] = 0;
                for (int k = 0; k < c1; k++)
                {
                    matrix[i][j] += priMatrix[i][k] * secMatrix[k][j];
                }
            }
        }
        System.out.println();

        printMatrix(matrix);
    }

    private static void printMatrix(long[][] matrix)
    {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++)
        {
            System.out.printf("[");
            for (int j = 0; j < c; j++)
            {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println("]");
        }
    }
}

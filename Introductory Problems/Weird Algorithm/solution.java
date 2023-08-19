import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        while (true) {
            System.out.print(n + " ");
            if (n == 1)
                break;
            else if (n % 2 == 0)
                n = n / 2;
            else
                n = n * 3 + 1;
        }
    }
}
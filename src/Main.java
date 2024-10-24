import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de N: ");
        int n = sc.nextInt();

        System.out.println("LINEAR: ");
        System.out.println(linearPrimeNumbers(n));

        System.out.print("Valor de N para fibonacci: ");
        n = sc.nextInt();

        System.out.println("LINEAR: ");
        System.out.println("Index " + fibLinear(n));

        // Para minha honestidade, não irei implementar os métodos recursivos, pois ainda não adquiri conhecimento de recursividade.

        sc.close();
    }

    public static List<Integer> linearPrimeNumbers(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Invalid input");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (isPrimeNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }

    // Auxiliary method
    public static boolean isPrimeNumber(int n) {
        int dividers = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividers++;
                if (dividers > 2) break;
            }
        }
        return dividers == 2;
    }

    public static int fibLinear(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int a = 0, b = 1;
        for (int i = 0; i < index; i++) {
            int aux = a;
            a = b;
            b = aux + b;
        }
        return a;
    }
}
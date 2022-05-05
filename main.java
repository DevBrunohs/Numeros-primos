import java.util.Scanner;



public class main {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.print("Digite o numero: ");
        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }
            if (counter == 2) {
                System.out.println("O numero " + i + " é primo");
            }
        }

        ler.close();
    }
}

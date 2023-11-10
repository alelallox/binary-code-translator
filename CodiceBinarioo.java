import java.util.Scanner;

public class CodiceBinarioo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x == 0) {
            System.out.println();
            System.out.println("Vuoi trasformare numeri o caratteri?");
            String var = scanner.nextLine();

            if (var.equals("numeri")) {
                System.out.println("Inserisci il numero da trasformare:");
                int var2 = scanner.nextInt();
                scanner.nextLine();
                numeri(var2);
            } else if (var.equals("caratteri")) {
                System.out.println("Inserisci i caratteri o la parola:");
                String var3 = scanner.nextLine();
                caratteri(var3);
            }else{
                System.out.println("Errore");
                x = 1;
            }
        }
    }

    public static void numeri(int value) {
        if (value > 0) {
            numeri(value / 2);
            System.out.print(value % 2 + " ");
        }
    }

    public static void caratteri(String input) {
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            String binaryRepresentation = Integer.toBinaryString((int) character);
            System.out.print(binaryRepresentation + " ");
        }
    }

}
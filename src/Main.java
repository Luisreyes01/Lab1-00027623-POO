import java.util.*;
public class Main {
    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {
        Scanner escaner = new Scanner(System.in);

        int op;

        int num1;
        int num2;
        do {
            Calculadora calcu1 = new Calculadora();
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            op = escaner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese num  1: ");
                    num1 = escaner.nextInt();
                    System.out.print("Ingrese num  2: ");
                    num2 = escaner.nextInt();
                    System.out.print("La suma es: " + calcu1.sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese num  1: ");
                    num1 = escaner.nextInt();
                    System.out.print("Ingrese num  2: ");
                    num2 = escaner.nextInt();
                    System.out.print("La resta es: " + calcu1.restar(num1, num2));
                    break;
                case 3:
                    System.out.print("Ingrese num  1: ");
                    num1 = escaner.nextInt();
                    System.out.print("Ingrese num  2: ");
                    num2 = escaner.nextInt();
                    System.out.print("La multiplicacion es: " + calcu1.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese num  1: ");
                    num1 = escaner.nextInt();
                    System.out.print("Ingrese num  2: ");
                    num2 = escaner.nextInt();
                    System.out.print("La division es: " + calcu1.dividir(num1, num2));
                    break;
            }
        } while(op != 5);
    }
}
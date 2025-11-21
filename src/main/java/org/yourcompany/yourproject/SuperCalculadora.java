package org.yourcompany.yourproject;
import java.util.Scanner;

public class SuperCalculadora {


    public  static  int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }


    public static  int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static  int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }


    public static  int calcularPotencia(int base, int exponent) {
        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }


    public static int nombreDigits(int n) {
        int digits = 0;
        int num = Math.abs(n);
        if (num == 0) return 1;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }

 
    public void mostrarMenuConsola() {
        System.out.println("Menú de SuperCalculadora");
        System.out.println("1 Suma dels primers n números");
        System.out.println("2 Factorial d'un nombre");
        System.out.println("3 Suma dels quadrats dels primers n números");
        System.out.println("4 Potència d'un nombre");
        System.out.println("5 Nombre de dígits d'un nombre");
        System.out.println("6 Sortir");
    }

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SuperCalculadora calc = new SuperCalculadora();
        int opcio = 0;

        while (opcio != 6) {
            calc.mostrarMenuConsola();
            System.out.print("Tria una opció: ");
            opcio = teclado.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix n: ");
                    int n1 = teclado.nextInt();
                    System.out.println("Resultat: " + sumaPrimersNumeros(n1));
                    break;
                case 2:
                    System.out.print("Introdueix n: ");
                    int n2 = teclado.nextInt();
                    System.out.println("Resultat: " + calcularFactorial(n2));
                    break;
                case 3:
                    System.out.print("Introdueix n: ");
                    int n3 = teclado.nextInt();
                    System.out.println("Resultat: " + sumaQuadrats(n3));
                    break;
                case 4:
                    System.out.print("Introdueix la base: ");
                    int base = teclado.nextInt();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = teclado.nextInt();
                    System.out.println("Resultat: " + calcularPotencia(base, exponent));
                    break;
                case 5:
                    System.out.print("Introdueix un nombre: ");
                    int n4 = teclado.nextInt();
                    System.out.println("Té " + nombreDigits(n4) + " dígits.");
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        }
    }
}

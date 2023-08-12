package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número 1");
        int a = scanner.nextInt();
        System.out.println("Ingresa el número 2");
        int b = scanner.nextInt();
        System.out.println("Introduce que quieres hacer:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Salir");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int suma = calculadora1.sumar(a, b);
                System.out.println(suma);
                break;
            case 2:
                int resta = calculadora1.restar(a, b);
                System.out.println(resta);
                break;
            case 3:
                int multiplica = calculadora1.multiplicar(a, b);
                System.out.println(multiplica);
                break;
            case 4:
                while (b == 0 ){
                    System.out.println("Operación imposible, vuelva a ingresar número válido");
                    b = scanner.nextInt();
                }
                double divide = calculadora1.dividir(a, b);
                System.out.println(divide);
                break;
            case 5:
                break;
        }

    }
}
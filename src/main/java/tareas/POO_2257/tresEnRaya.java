package tareas.POO_2257;

import java.util.Scanner;
public class tresEnRaya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres (solo X, 0 o _): ");
        String cadena = sc.nextLine();
        sc.close();

        if (cadena.length() != 9) {
            System.out.println("La cadena ingresada no contiene 9 caracteres.");
            return;
        }
        for (char c : cadena.toCharArray()) {
            if (c != 'X' && c != '0' && c != '_') {
                System.out.println("La cadena que ingreso contiene caracteres no válidos.");
                return;
            }
        }

        // Imprimir la cadena ingresada
        System.out.println("Cadena ingresada: " + cadena);

        // Imprimir el marco con los caracteres ordenados
        System.out.println("  " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " ");
        System.out.println("-----------");
        System.out.println("  " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " ");
        System.out.println("-----------");
        System.out.println("  " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " ");
    }
    }



package aprender;

import java.util.Scanner;

public class Aprender {

    public static void main(String[] args) {
        /*System.out.println("Hola");
        final int numero = 10; //Constante
        Scanner entrada = new Scanner(System.in);// in= input entrada de datos guardar los datos
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();//nextInt guardar el numero entero
        System.out.println("El numero es: "+numero);*/
        
        /*Scanner entrada = new Scanner (System.in);
        float numero;
        System.out.println("Diigite un numero: ");
        numero= entrada.nextFloat();
        System.out.println("El numero es: "+numero);*/
        
        Scanner entrada = new Scanner(System.in);
        char letra;
        System.out.println("Digite un carater");
        letra= entrada.next().charAt(0);
        System.out.println(letra);
}
}

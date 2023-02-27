package Fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int numero = input.nextInt();
	ArrayList listaNumeros = new ArrayList();
	
	for (int i = 0; i < numero; i++) {
            System.out.print(Exercicio2.fibo(i) + "\t");
            listaNumeros.add(Exercicio2.fibo(i));
            
        }
	
	List<ArrayList> lista = Arrays.asList(listaNumeros);
    if (lista.contains(numero)) {
    	System.out.println("\nO número informado pertence a sequência");
    } else {
    	System.out.println("\nO número informado não pertence a sequência");
    }

    }

}

/**
 * @author Ramon Vieira
 *
 */

public class Fibonacci {

	static int calculaFibonacciNormal(int numero){
		int anterior = 0;
		int atual = 0;

		for (int i = 0; i <= numero; i++) {
			if(i < 2){
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}
		}
		
		return atual;	
	}
	
	static int calculaFibonacciRecursivo(int numero){
		return (numero <= 2 ? 1 : calculaFibonacciRecursivo(numero - 1) + calculaFibonacciRecursivo(numero - 2));
	}

}

/**
 * @author Ramon Vieira
 *
 */

public class Fatorial {

	static int calculaFatorial(int numero){
		int resultado = numero;
		
		while (numero > 1) {
			resultado *= numero - 1;
			numero--;
		}
		
		return resultado;
	}
	
}

/**
 * @author Ramon Vieira
 *
 */

public class NumeroPrimo {

	static Boolean verificaNumeroPrimo(int numero){

		int divisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0){
				divisores++;
			}
		}
		
		if(divisores == 2){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
}

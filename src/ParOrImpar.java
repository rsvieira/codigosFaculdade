/**
 * @author Ramon Vieira
 *
 */

public class ParOrImpar {

	public static final String PAR = "Par";
	public static final String IMPAR = "Impar";
	
	static String verificaParOrImpar(int numero){
		
		if(numero % 2 == 0){
			return PAR;
		} else {
			return IMPAR;
		}
	}
	
}

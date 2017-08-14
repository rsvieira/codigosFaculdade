/**
 * @author Ramon Vieira
 *
 */

public class Palindromo {

	static Boolean verificaPalindromo(String palavra){
		
		if(new StringBuilder().append(palavra).reverse().toString().equals(palavra)){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
}

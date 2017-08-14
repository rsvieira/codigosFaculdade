/**
 * @author Ramon Vieira
 *
 */

public class CharRepetido {

	static Boolean verificaCharRepetido(String palavra, char letra){
		
		int count = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == letra){
				count++;
			}
		}
		
		if(count <= 1){
			return Boolean.FALSE;
		}
		
		return Boolean.TRUE;
	}
	
}

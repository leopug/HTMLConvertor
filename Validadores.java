public class Validadores {

	public static boolean validaParaATagBR(String texto){

		if(texto.matches(".*\\*{2}.*\\*{2}.*")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean validaParaATagI(String texto){

		if(texto.matches(".*/{2}.*/{2}.*")){
			return true;
		}else{
			return false;
		}
	}
	
	
}

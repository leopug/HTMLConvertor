
public class TestaGeralTransformador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	String texto = "Testando a tag br     		...   **vivaaaaaa** \n" +
				   "Testando a tag i      		...   //vivaaaaaa// \n" +
				   "Testando a tag u      		...   __vivaaaaaa__ \n" +
				   "Testando path de img  		...   [image    src=\"C:\\Users\\SAA\\Pictures\"] \n" +
				   "Testando path de link 		...   http://www.youtube.com \n" +
				   "Testando path de link 		...   http://www.youtube.com.br \n" +
				   "Testando path de link 		...   https://www.brasilmelhorpais.gov.net \n" +
				   "Testando path de link 		...   Link para youtube = http://www.youtube.com.br \n" +
				   "Testando path de link 		...   Link para youtube   http://www.youtube.com/watch?v=/f46oqH/c8UF/E \n" +
				   "Testando path de link curto     ...   [http://www.google.com](Google)";
		
	TransformaGeral transformaTudoEmHTML = new TransformaGeral();
	
	System.out.println(transformaTudoEmHTML.transformaTextoEmHTML(texto));

	}

}
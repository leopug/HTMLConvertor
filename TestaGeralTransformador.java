
public class TestaGeralTransformador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	String texto = "Vamo que vamo **bruxao** . E agora **";	
		
	TransformaGeral transformaTudoEmHTML = new TransformaGeral();
	
	System.out.println(transformaTudoEmHTML.transformaTextoEmHTML(texto));

	}

}
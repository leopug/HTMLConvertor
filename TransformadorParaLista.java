
public class TransformadorParaLista implements InterfaceTransformador{

	@Override
	public String transforma(String textoASerTransformado) {
		String textoAnterior = "";
		String textoFinal = "";
		while(validacaoDeListaNaString(textoASerTransformado)){

			String textoAserTransformadoArray[] = textoASerTransformado.split("\n");

			for(String texto : textoAserTransformadoArray){
				
				if(textoAnterior.matches(".*<ul>.*")){
				texto = texto.replaceAll("\\*(.*)", "<li>$1</li>");

				}else if(texto.matches("\\*.*") && textoAnterior.matches("<li>.*</li>")){
				texto = texto.replaceAll("\\*(.*)", "<li>$1</li>");
				}
				
				
				textoAnterior = texto;
				textoFinal.concat(texto);
			}

		}
		
		return textoASerTransformado;
	}
	
	public boolean validacaoDeListaNaString(String textoASerTransformado){

		if(textoASerTransformado.matches("<ul>.*\n\\*.*</ul>")){
			return true;
		}else{
			return false;
		}

	}
	
	

}

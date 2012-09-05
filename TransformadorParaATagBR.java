
public class TransformadorParaATagBR implements InterfaceTransformador {

	@Override
	public String transforma(String textoASerTransformado) {
			
		textoASerTransformado = textoASerTransformado.replaceAll("\\*{2}(.*?)\\*{2}", "<br>$1</br>");
		
		return textoASerTransformado;
		
	}

}

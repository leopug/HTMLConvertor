
public class TransformadorParaATagBR implements InterfaceTransformador {

	@Override
	public String transforma(String textoASerTransformado) {
		
		boolean valida = true;
		
		while(valida){
		
		textoASerTransformado = textoASerTransformado.replaceAll("\\*{2}(.*?)\\*{2}", "<br>$1</br>");
		valida =  Validadores.validaParaATagBR(textoASerTransformado);
		
		}
		return textoASerTransformado;
		
	}

}


public class TransformadorParaATagBR implements InterfaceTransformador {

	@Override
	public String transforma(String textoASerTransformado) {
		
		boolean valida = true;
		
		while(valida){
			
		textoASerTransformado = textoASerTransformado.replaceFirst("\\*\\*", "<br>");
		textoASerTransformado = textoASerTransformado.replaceFirst("\\*\\*", "<\\\\br>");
		valida =  Validadores.validaParaATagBR(textoASerTransformado);
		
		}
		return textoASerTransformado;
		
	}

}

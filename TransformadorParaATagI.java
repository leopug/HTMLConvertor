
public class TransformadorParaATagI implements InterfaceTransformador {

	@Override
	public String transforma(String textoASerTransformado) {

		boolean valida = true;
		
		while(valida){
			
		textoASerTransformado = textoASerTransformado.replaceFirst("//", "<i>");
		textoASerTransformado = textoASerTransformado.replaceFirst("//*", "<\\\\i>");
		valida =  Validadores.validaParaATagI(textoASerTransformado);
		
		}
		
		return textoASerTransformado;
	}

	
	
}

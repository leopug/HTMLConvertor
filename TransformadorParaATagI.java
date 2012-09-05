
public class TransformadorParaATagI implements InterfaceTransformador {

	@Override
	public String transforma(String textoASerTransformado) {
		
		textoASerTransformado = textoASerTransformado.replaceAll("/{2}(.*?)/{2}", "<i>$1</i>");
		
		return textoASerTransformado;
	}
	
}

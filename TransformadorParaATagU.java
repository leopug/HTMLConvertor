
public class TransformadorParaATagU implements InterfaceTransformador{

	@Override
	public String transforma(String textoASerTransformado) {
		
		textoASerTransformado = textoASerTransformado.replaceAll("_{2}(.*?)_{2}", "<u>$1</u>");
		
		return textoASerTransformado;
	}
	


}


public class TransformadorParaLink implements InterfaceTransformador{

	@Override
	public String transforma(String textoASerTransformado) {
		
		textoASerTransformado = textoASerTransformado.replaceAll("[^\"]https?://w{3}.?\\..+\\.[^ ]+(\\.[^ ]+)*(//.*)*( |$|[^\\(])", 
				"<a href=\"$0\">$0</a>");
		
		return textoASerTransformado;
		
	}
	
}

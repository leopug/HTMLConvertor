
public class TransformadorParaLinkComApelido implements InterfaceTransformador{

	@Override
	public String transforma(String textoASerTransformado) {

		textoASerTransformado = textoASerTransformado.replaceAll("(\\[(https?://w{3}.?\\..+\\.[^ ]+(\\.[^ ]+)*(//.*)*)\\])\\((.*)\\)", 
				"<a href=\"$2\">$5</a>");
		
		
		return textoASerTransformado;
	}

}

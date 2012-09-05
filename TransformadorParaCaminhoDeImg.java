
public class TransformadorParaCaminhoDeImg implements InterfaceTransformador{

	@Override
	public String transforma(String textoASerTransformado) {

		textoASerTransformado = textoASerTransformado.replaceAll("\\[image *src=\"(.*)\" *\\]", "<img src=\"$1\" />");
		
		return textoASerTransformado;
	}

}

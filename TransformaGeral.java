import java.util.List;


public class TransformaGeral {
		
	public String transformaTextoEmHTML(String textoASerTransformado){
		
	List<InterfaceTransformador> listaDeTransformadores = GeraObjetosDeTransformacaoNecessarios.geraObjetosTransformadores(textoASerTransformado);
		
	for(InterfaceTransformador transforma : listaDeTransformadores){
		
	textoASerTransformado = transforma.transforma(textoASerTransformado);
		
	}	
		
	return textoASerTransformado;
	
	}	
	
}

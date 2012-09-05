import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeraObjetosDeTransformacaoNecessarios {

	public static List<InterfaceTransformador> geraObjetosTransformadores(String textoASerValidado){
		
		List<InterfaceTransformador> listaTransformadores = new ArrayList<InterfaceTransformador>();
			
			listaTransformadores.addAll(Arrays.asList(new InterfaceTransformador[]{new TransformadorParaATagBR(),
					new TransformadorParaATagI(),new TransformadorParaATagU(), new TransformadorParaCaminhoDeImg(),
					new TransformadorParaLinkComApelido(), new TransformadorParaLink()}));	
		
		return listaTransformadores;
	}	
	
}
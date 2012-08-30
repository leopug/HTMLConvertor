import java.util.ArrayList;
import java.util.List;

public class GeraObjetosDeTransformacaoNecessarios {

	public static List<InterfaceTransformador> geraObjetosTransformadores(String textoASerValidado){
		
		List<InterfaceTransformador> listaTransformadores = new ArrayList<InterfaceTransformador>();
		
			listaTransformadores.add(new TransformadorParaATagBR());		
			listaTransformadores.add(new TransformadorParaATagI());
		
		
		return listaTransformadores;
	}	
	
}
import java.util.ArrayList;
import java.util.List;

public class GeraObjetosDeTransformacaoNecessarios {

	public static List<InterfaceTransformador> geraObjetosTransformadores(String textoASerValidado){
		
		List<InterfaceTransformador> listaTransformadores = new ArrayList<InterfaceTransformador>();
		
		if(Validadores.validaParaATagBR(textoASerValidado)){
			TransformadorParaATagBR transformador = new TransformadorParaATagBR();
			listaTransformadores.add(transformador);
		}
		
		return listaTransformadores;
	}	
	
}
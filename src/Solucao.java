import java.util.ArrayList;

public class Solucao {
	
	public int GetQtdeTotal(String recurso, ArrayList<Governante> governantes){
		int resultado = 0;
		
		switch (recurso) {
		case "ouro":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getOuro();
			}
				return resultado;
				
		case "agua":
			for (int j = 0; j< governantes.size(); j++) {
				resultado = resultado + governantes.get(j).getAgua();
			}	
				return resultado;
				
		case "madeira":
			for (int k = 0; k < governantes.size(); k++) {
				resultado = resultado + governantes.get(k).getMadeira();
			}
				return resultado;					

		default:
			return resultado;
			
	
		}
		
		
				
		
	/*	if (recurso.equals("ouro")) {
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getOuro();
			}				
		} else {
			
		}
					
		
	return resultado;
	*/
	}
	
}
		

		
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
		
		
	}
	public String getQtdeFicarVivo(String nomeGovernante, ArrayList<Governante> governantes){
		
		String resultado = "";
		
		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)){
				resultado = "Pedido do governante: " + nomeGovernante + "\n" +
						"Ouro: " + governantes.get(i).getPedidoOuro() + "\n" +
						"Agua: " + governantes.get(i).getPedidoAgua() + "\n" +
						"Madeira: " + governantes.get(i).getPedidoMadeira();
				
			}
		}
		return resultado;
	}

	public int calcularQtdeViagens(String nomeGovernante, ArrayList<Governante> governantes){
		
		int resultado = 0;
		
		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)){
				resultado = (governantes.get(i).getPedidoOuro() / 50) +
							(governantes.get(i).getPedidoAgua() / 100) +
							(governantes.get(i).getPedidoMadeira() / 1000);
			}
		}
		return resultado;
	}
	
	
	
}





		
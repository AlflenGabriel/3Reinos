import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Governante montante = new Governante("Montante", 5000, 4000, 20000);
		Governante lenha = new Governante("Lenha", 500, 25000, 10000);
		Governante clareza = new Governante("Clareza", 200, 7000, 120000);
		
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);
		
		Solucao s = new Solucao();
		System.out.println(s.GetQtdeTotal("ouro", governantes));
		System.out.println(s.GetQtdeTotal("agua", governantes));
		System.out.println(s.GetQtdeTotal("madeira", governantes));

	}

}

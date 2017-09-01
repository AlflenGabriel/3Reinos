
public class Governante {
	
	private String nome;
	private int ouro;
	private int agua;
	private int madeira;
	
	
	
	public Governante(String nome, int ouro, int agua, int madeira) {
		
		this.nome = nome;
		this.ouro = ouro;
		this.agua = agua;
		this.madeira = madeira;
	}

	public String getNome() {
		return nome;
		}

	public void setNome(String nome) {
		this.nome = nome;
		}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getMadeira() {
		return madeira;
	}
	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}

}

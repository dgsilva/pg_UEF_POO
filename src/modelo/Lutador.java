package modelo;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador() {
		// TODO Auto-generated constructor stub
	}

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 5.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de  " + getNacionalidade());
		System.out.println("com " + getIdade() + " anos e  " + getAltura());
		System.out.println(getAltura() + " m de altura");
		System.out.println("Pesando " + getPeso() + "kg");
		System.out.println(getVitorias() + " vitorias");
		System.out.println(getDerrotas() + " derrotas e");
		System.out.println(getEmpates() + " empates!");
	}

	public void status() {
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println("Ganhou " + getVitorias() + " vezes");
		System.out.println("Perdeu " + getDerrotas() + " vezes");
		System.out.println("Empatou " + getEmpates() + " vezes");
	}

	public void ganharLutas() {
		setVitorias(getVitorias() + 1);

	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);

	}

	public void empaterLuta() {
		setEmpates(getEmpates() + 1);

	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas
				+ ", empates=" + empates + "]";
	}

}

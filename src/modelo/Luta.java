package modelo;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public Luta() {
		// TODO Auto-generated constructor stub
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
			setAprovada(true);
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			setAprovada(false);
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aletorio = new Random();
			System.out.println("### RESULTADO DA LUTA ###");
			int vencedor = aletorio.nextInt(3);
			switch (vencedor) {
			case 0:
				System.out.println("Empatou!");
				this.desafiado.empaterLuta();
				this.desafiante.empaterLuta();
				break;

			case 1:
				System.out.println(this.desafiado.getNome() + " venceu a luta");
				this.desafiado.ganharLutas();
				this.desafiante.perderLuta();
				break;

			case 2:
				System.out.println(this.desafiante.getNome() + " venceu a luta");
				this.desafiante.ganharLutas();
				this.desafiado.perderLuta();
				break;
			}
			System.out.println("==================================================================");
		} else {
			System.out.println("Luta não pode acontecer.");
		}
	}

}

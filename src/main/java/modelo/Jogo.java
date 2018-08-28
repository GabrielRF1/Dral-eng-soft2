package modelo;

import controle.OccupiedException;
import controle.OutOfBaseException;
import personagem.Personagem;
import tabuleiro.Celula;
import tabuleiro.Tabuleiro;

public class Jogo {

	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;
	private int turnoAtual;
	
	public Jogo() {

		iniciaJogo();
		
	}

	public void iniciaJogo() {
		tabuleiro = Tabuleiro.getObject();
		this.jogador1 = new Jogador();
		this.jogador1.setEhVez(true);
		this.jogador2 = new Jogador();
		this.turnoAtual = 0;
	}

	public void adicionarPersonagemAoTabuleiro(Celula local, Personagem personagem) throws OutOfBaseException, OccupiedException{
		/*Celula base = null;
		if (this.turnoAtual == 0) {
			base = this.tabuleiro.getBaseUm();
		}
		if (this.turnoAtual == 1) {
			base = this.tabuleiro.getBaseDois();
		}*/

		this.tabuleiro.adicionarPersonagem(local, personagem);

	}

	public void moverPersonagem(Celula celulaSelecionada, Celula clickedPosition) {

		Personagem personagem = celulaSelecionada.getPersonagem();
		clickedPosition.setPersonagem(personagem);
		celulaSelecionada.setPersonagem(null);
	
	}
	
	public void atacarPersonagem(Celula celulaSelecionada, Celula clickedPosition) {
		
	}

	public int turnoAtual() {
		return this.turnoAtual;
	}

	public Jogador getJogadorUm() {
		return this.jogador1;
	}

	public Jogador getJogadorDois() {
		return this.jogador2;
	}

	public Tabuleiro getTabuleiro() {
		return this.tabuleiro;
	}

}
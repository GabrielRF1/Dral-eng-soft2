package modelo;

import personagem.Personagem;
import tabuleiro.Celula;

import java.util.ArrayList;

public class Jogador {

	private ArrayList<Personagem> personagens;
	private boolean ehVez;
	private Celula celulaSelecionada;

	public Jogador() {
		personagens = new ArrayList<>();
		setEhVez(false);
	}

	public void setCelulaSelecionada(Celula celula) {
		this.celulaSelecionada = celula;
	}

	public Celula getCelulaSelecionada() {
		return this.celulaSelecionada;
	}

	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}

	public void adicionarPersonagem(Personagem p) {
		this.personagens.add(p);
	}

	public void removePersonagem (Personagem p) {
		for (int i = 0; i < this.personagens.size(); i++) {
			if (p == this.personagens.get(i)) {
				this.personagens.remove(p);
			}
		}
	}

	public boolean verificarSePersonagemPertenceAoJogador(Personagem personagem) {
		if (this.personagens.contains(personagem))
			return true;
		return false;
	}

	public boolean ehVez() {
		return ehVez;
	}

	public void setEhVez(boolean ehVez) {
		this.ehVez = ehVez;
	}

	public void atualizarStatusDosPersonagens() {
		Personagem personagem = null;
		for (int i = 0; i < this.personagens.size(); i++) {
                        personagem = personagens.get(i);
			personagem.setMoveu(false);
			personagem.setAtacou(false);
		}
	}
}

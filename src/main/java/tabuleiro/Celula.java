/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuleiro;

import personagem.Personagem;

/**
 *
 * @author Gabriel
 */
public class Celula {
	
	private int x;
	private int y;
	private Personagem personagem;
	private TipoSolo tipoSolo;

	public Celula(int x, int y, TipoSolo tipoSolo) {
		this.x = x;
		this.y = y;
		this.tipoSolo = tipoSolo;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Personagem getPersonagem() {
		return this.personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public TipoSolo getTipoSolo() {
		return this.tipoSolo;
	}

	public void setTipoSolo(TipoSolo tipoSolo) {
		this.tipoSolo = tipoSolo;
	}
}

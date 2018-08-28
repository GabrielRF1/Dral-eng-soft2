/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagem;

public class Personagem {

    private int hp;
    private int energy;
    private TipoPersonagem tipoPersonagem;
    private boolean moveu;
    private boolean atacou;
    private String imagePath;

    public Personagem(int hp, int energy, TipoPersonagem tipoPersonagem) {
        this.hp = hp;
        this.energy = energy;
        this.tipoPersonagem = tipoPersonagem;
        this.moveu = false;
        this.atacou = false;
    }

    public int getHP() {
        return this.hp;
    }

    public boolean getMoveu() {
        return moveu;
    }

    public void setMoveu(boolean moveu) {
        this.moveu = moveu;
    }

    public boolean getAtacou() {
        return this.atacou;
    }

    public void setAtacou(boolean atacou) {
        this.atacou = atacou;
    }
    
    public TipoPersonagem getTipoPersonagem() {
        return this.tipoPersonagem;
    }

	public int getEnergy() {
		return energy;
	}
}

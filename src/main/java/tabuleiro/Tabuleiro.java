package tabuleiro;

import java.awt.Point;

import personagem.Personagem;

public class Tabuleiro {

    private Celula[][] tabuleiro;
    private int tamLinha;
    private int tamColuna;
    private static Tabuleiro tab;
    // Só coloquei pra ter um parâmetro de onde os bonecos seriam criados. Dá pra modificar ou mesmo alterar depois.
    //private Celula base1;
    //private Celula base2;

    private Tabuleiro(int tamLinha, int tamColuna) {
        this.tamLinha = tamLinha;
        this.tamColuna = tamColuna;
        this.tabuleiro = new Celula[tamLinha][tamColuna];
        iniciarTabuleiroPadrao();
    }

    public static Tabuleiro getObject() {
        if (tab == null) {
            tab = new Tabuleiro(28, 28);
        }
        return tab;
    }

    private void iniciarTabuleiroPadrao() {
        Celula celula;
        for (int i = 0; i < tamLinha; i++) {
            for (int j = 0; j < tamColuna; j++) {
                celula = new Celula(i, j, TipoSolo.GRAMA);
                tabuleiro[i][j] = celula;
            }
        }
        //this.adicionaBases();
    }

    public Celula[][] getTabuleiro() {
        return tabuleiro;
    }

    /*private void adicionaBases() {
        this.tabuleiro[0][13].setTipoSolo(TipoSolo.BASE_1);
        base1 = this.tabuleiro[0][13];
        this.tabuleiro[27][14].setTipoSolo(TipoSolo.BASE_2);
        base2 = this.tabuleiro[27][14];
    }*/

    public Celula getCelula(int x, int y) {
        return this.tabuleiro[x][y];
    }

    public int getTamLinha() {
        return this.tamLinha;
    }

    public int getTamColuna() {
        return this.tamColuna;
    }

    public void adicionarPersonagem(Celula base, Personagem personagem) {

        base.setPersonagem(personagem);

    }

    /*public Celula getBaseDois() {
        return this.base2;
    }*/

    /*public Celula getBaseUm() {
        return this.base1;
    }*/
}

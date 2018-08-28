package controle;

import modelo.Jogador;
import modelo.Jogo;
import personagem.Personagem;
import personagem.TipoPersonagem;
import tabuleiro.Celula;
import visão.TabuleiroView;

public class Controle {

    private Jogo jogo;
    private Jogador jogadorDaVez;
    private static Controle c;
    private boolean firstDeployer;

    private Controle() {
    }

    public void iniciarJogo() {
        this.jogo = new Jogo();
        this.jogadorDaVez = this.jogo.getJogadorUm();
        this.firstDeployer = true;
        // Só pra ver o tabuleiro funcionando mesmo, depois tem que arrumar
        TabuleiroView a = new TabuleiroView();
        a.setVisible(true);

    }

    public boolean isFirstDeployer() {
        return firstDeployer;
    }

    public void setFirstDeployer(boolean isFirstDeployer) {
        this.firstDeployer = isFirstDeployer;
    }

    public Jogador getJogadorDaVez() {
        return jogadorDaVez;
    }

    public static Controle getObject() {
        if (c == null) {
            c = new Controle();
        }
        return c;
    }

    public void jogarTurno(Celula celulaSelecionada, Celula clickedPosition) {
        jogo.moverPersonagem(celulaSelecionada, clickedPosition);
    }

    public void selecionarPersonagem(TipoPersonagem tipoPersonagem, Celula local) throws OutOfBaseException, OccupiedException {
        Personagem personagem = null;

        switch (tipoPersonagem) {
            case BARDO:
                personagem = new Personagem(0, 0, TipoPersonagem.BARDO);
                this.jogo.adicionarPersonagemAoTabuleiro(local, personagem);
                this.jogadorDaVez.adicionarPersonagem(personagem);
                break;
            case ARQUEIRO:
                personagem = new Personagem(0, 0, TipoPersonagem.ARQUEIRO);
                this.jogo.adicionarPersonagemAoTabuleiro(local, personagem);
                this.jogadorDaVez.adicionarPersonagem(personagem);
                break;
            case ASSASSINO:
                personagem = new Personagem(0, 0, TipoPersonagem.ASSASSINO);
                this.jogo.adicionarPersonagemAoTabuleiro(local,personagem);
                this.jogadorDaVez.adicionarPersonagem(personagem);
                break;
            case CLERIGO:
                personagem = new Personagem(0, 0, TipoPersonagem.CLERIGO);
                this.jogo.adicionarPersonagemAoTabuleiro(local, personagem);
                this.jogadorDaVez.adicionarPersonagem(personagem);
                break;
            case GUERREIRO:
                personagem = new Personagem(0, 0, TipoPersonagem.GUERREIRO);
                this.jogo.adicionarPersonagemAoTabuleiro(local, personagem);
                this.jogadorDaVez.adicionarPersonagem(personagem);
                break;
        }
    }

    public void selecionarAcao(int x, int y) {

        Celula clickedPosition = this.jogo.getTabuleiro().getCelula(x, y);
        Celula celulaSelecionada = jogadorDaVez.getCelulaSelecionada();
        Personagem personagem = clickedPosition.getPersonagem();

        if (celulaSelecionada != null) {
            System.out.println(this.jogadorDaVez.verificarSePersonagemPertenceAoJogador(personagem));
            if (this.jogadorDaVez.verificarSePersonagemPertenceAoJogador(personagem)) {
                this.jogo.moverPersonagem(celulaSelecionada, clickedPosition);
                System.out.println("Posição moveu peça.");
            } else {
                this.jogo.atacarPersonagem(celulaSelecionada, clickedPosition);
                System.out.println("Jogador atacou peça.");
            }
        } else {
            this.jogadorDaVez.setCelulaSelecionada(clickedPosition);
            System.out.println("Jogador selecionou peça.");
        }
    }

    // não teste ainda
    public void passarTurno() {
        if (jogo != null) {
            if (this.jogadorDaVez == this.jogo.getJogadorUm()) {
                this.jogadorDaVez.atualizarStatusDosPersonagens();
                this.jogadorDaVez = this.jogo.getJogadorDois();
            } else {
                this.jogadorDaVez.atualizarStatusDosPersonagens();
                this.jogadorDaVez = this.jogo.getJogadorUm();
            }
        }
    }

    public Jogo getJogo() {
        return this.jogo;
    }
}

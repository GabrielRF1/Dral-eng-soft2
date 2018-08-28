package personagem;

public enum TipoPersonagem {

	ARQUEIRO(100, 2, 8), GUERREIRO(100, 5, 5), CLERIGO(100, 5, 5), BARDO(100, 5, 5), ASSASSINO(100, 5, 5);

	private int dano;
	private int rangeAtaque;
	private int rangeMovimento;

	TipoPersonagem(int dano, int rangeAtaque, int rangeMovimento) {
		this.dano = dano;
		this.rangeAtaque = rangeAtaque;
		this.rangeMovimento = rangeMovimento;
	}

	public int getDano() {
		return dano;
	}

	public int getRangeAtaque() {
		return rangeAtaque;
	}

	public int getRangeMovimento() {
		return rangeMovimento;
	}

}
package jogo;

public class Peça {
	private int linha;
	private int coluna;
	private boolean cor;
	private Tabuleiro tab;
	
	public Peça(int linha, int coluna, boolean cor, Tabuleiro tab) {
		this.linha = linha;
		this.coluna = coluna;
		this.cor = cor;
		this.tab = tab;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}

	public Tabuleiro getTab() {
		return tab;
	}

	public void setTab(Tabuleiro tab) {
		this.tab = tab;
	}
	
	
	
	
}

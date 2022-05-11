package br.com.ifce.estrutura.arvore;

public class ArvoreBinario {
	private NoBinario root;

	public ArvoreBinario() {
		super();
		this.root = new NoBinario("raiz");
	}

	public ArvoreBinario(NoBinario root) {
		super();
		if (root == null) {
			this.root = new NoBinario("raiz");
		} else {
			this.root = root;
		}
	}

	public NoBinario addNo(String Add, String posicao, NoBinario noPai) {
		NoBinario noToAdd = new NoBinario(Add);
		if (noPai == null) {
			addFilho(noToAdd, posicao, root);
		} else {
			addFilho(noToAdd, posicao, noPai);
		}
		
		return noToAdd;
	}

	private void addFilho(NoBinario noToAdd, String posicao, NoBinario pai) {
		noToAdd.setPai(pai);
		
		if (posicao.equals("direita")) {
			pai.setDireita(noToAdd);
		} else {
			pai.setEsquerda(noToAdd);
		}
	}
	
	public void removeNo(String posicao, NoBinario pai) {
		if (pai.getEsquerda() == null) {
			System.out.println("não ha nó a ser removido");
		} else {
			if (pai.getDireita() == null) {
				System.out.println("não ha nó a ser removido");
			} else {
				removeFilho(posicao, pai);
			}
		}
	}
	
	private void removeFilho(String posicao, NoBinario pai) {
		if (posicao.equals("direita")) {
			pai.setDireita(null);
		} else {
			pai.setEsquerda(null);
		}
	}
}

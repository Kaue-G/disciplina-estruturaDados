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
	
//	public void removeNo(String posicao, NoBinario pai) {
//		if (pai.getEsquerda() == null) {
//			System.out.println("não ha nó a ser removido");
//		} else {
//			if (pai.getDireita() == null) {
//				System.out.println("não ha nó a ser removido");
//			} else {
//				removeFilho(posicao, pai);
//			}
//		}
//	}
//	
//	private void removeFilho(String posicao, NoBinario pai) {
//		if (posicao.equals("direita")) {
//			pai.setDireita(null);
//		} else {
//			pai.setEsquerda(null);
//		}
//	}
	
	public void removeNo (NoBinario tirarNo) {
		if (tirarNo == null) {
			System.out.println("não há no a ser removido");
		}
		
		if (tirarNo != root) {
			NoBinario pai = tirarNo.getPai();
			
			if (pai.getDireita() == tirarNo) {
				pai.setDireita(null); 
			} else {
				pai.setEsquerda(null);
			}
		}
		
		if (tirarNo.getDireita() != null) {
			removeNo(tirarNo.getDireita());
		}
		
		if (tirarNo.getEsquerda() != null) {
			removeNo(tirarNo.getEsquerda());
		}
		
		apagarNo(tirarNo);
	}
	
	private void apagarNo (NoBinario apagar) {
		apagar.setDescricao(null);
		apagar.setDireita(null);
		apagar.setEsquerda(null);
		apagar.setPai(null);
	}
	
	public NoBinario buscarNo(NoBinario noAtual, String descricao) {
		if (noAtual == null) {
			noAtual = root;
		}
		
		if (noAtual.getDescricao() == descricao) {
			return noAtual;
		}
		
		NoBinario noAuxiliar = null;
		if (noAtual.getDireita() != null) {				
			noAuxiliar = buscarNo(noAtual.getDireita(), descricao);
		}
		
		if(noAuxiliar == null && noAtual.getEsquerda() != null) {
			noAuxiliar = buscarNo(noAtual.getEsquerda(), descricao);				
		}
		
		return noAuxiliar;
	}
}

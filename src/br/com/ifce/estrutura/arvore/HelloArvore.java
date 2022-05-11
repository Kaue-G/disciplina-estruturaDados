package br.com.ifce.estrutura.arvore;

public class HelloArvore {

	public static void main(String[] args) {
		
		ArvoreBinario arvoreBinario = new ArvoreBinario();
		arvoreBinario.addNo("folha1", "esquerda", null);
		NoBinario folha2 = arvoreBinario.addNo("folha2", "direita", null);
		
		NoBinario testeRemove1 = arvoreBinario.addNo("folha3", "esquerda", folha2);		
		NoBinario testeRemove2 = arvoreBinario.addNo("folha4", "direita", folha2);
		
		arvoreBinario.removeNo("esquerda", folha2);
	}
}

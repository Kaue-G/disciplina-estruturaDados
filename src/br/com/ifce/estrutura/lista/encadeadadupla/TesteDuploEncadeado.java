package br.com.ifce.estrutura.lista.encadeadadupla;

import java.util.LinkedList;

public class TesteDuploEncadeado {

	public static void main(String[] args) throws Exception {
		ListaNo listaDupla = new ListaNo(null, null);

		listaDupla.append(new DuploNo("Daniel"));
		listaDupla.append(new DuploNo("Joao"));
		listaDupla.append(new DuploNo("Francisco"));
		listaDupla.append(new DuploNo("Raimundo"));

		System.out.println("Count manual: " + listaDupla.countManual());
		System.out.println("Count por variavel: " + listaDupla.getCount());

		System.out.println("Tem nome francisco? " + listaDupla.containsName("francisco2"));

		// TODO: dizer qual posicao foi encontrado o nome?
		System.out.println(listaDupla.encontrarPosicaoDescricao("Joao"));
		// TODO: imprimir a lista com quebra de linha e o numero da posi��o
		System.out.println(listaDupla.listToString());
		// TODO: add em uma posi��o espec�fica um determinado n�
		listaDupla.addPosition(new DuploNo("Pedro"), 3);
		System.out.println(listaDupla.listToString());
		// TODO: add na frente
		listaDupla.addFist(new DuploNo("Maria"));
		System.out.println(listaDupla.listToString());
		
		//BONUS
		//CRIE UMA FIFO E UMA LIFO
	}
}

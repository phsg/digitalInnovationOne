package me.dio.internationalCarrerAcceleration_2.tonnie;

import java.util.Scanner;

/**
 * Alice and Betty collect Pok�mon cards. The cards are printed for a game that
 * imitates the battle system of one of the most popular videogames in history,
 * but Alice and Betty are too young to actually play the game, and are only
 * interested in the actual cards. To make it easier, we'll assume each card has
 * a unique identifier, given as an integer number.
 * 
 * Both girls have a set of cards, and, like most girls their age, like to trade
 * the cards they have. They obviously don't care about identical cards they
 * both have, and they don't want to receive repeated cards in the trade.
 * Besides, the cards are traded in a single operation: Alice gives Betty N
 * distinct cards and receives back other N distinct cards.
 * 
 * The girls want to know what is the maximum number of cards they can trade.
 * For instance, if Alice has cards {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} and Betty
 * has cards {2, 2, 2, 3, 4, 6, 10, 11, 11}, they can trade at most four cards.
 * 
 * Write a program that given the sets of cards owned by Alice and Betty,
 * determines the maximum number of cards they can trade.
 * 
 * Input The input contains several test cases. The first line of a test case
 * contains two integers A and B, separated by a blank space, indicating
 * respectively the number of cards Alice and Betty have (1 <= A <= 104 and 1 <=
 * B <= 104). The second line contains A space-separated integers Xi, each
 * indicating one of Alice\'s cards(1 <= Xi <= 105). The third line contains B
 * integers Yi separated by whitespaces, each number indicating one of Betty's
 * cards(1 <= Yi <= 105). Alice and Betty's cards are listed in non-descending
 * order.
 * 
 * The end of input is indicated by a line containing only two zeros, separated
 * by a blank space.
 * 
 * Output For each test case, your program should print a single line,
 * containing an integer number, indicating the maximum number of cards Alice
 * and Betty can trade.
 * 
 * 
 * Alice e Betty colecionam cartas de Pok�mon. As cartas s�o impressas para um
 * jogo que imita o sistema de batalha de um dos videogames mais populares da
 * hist�ria, mas Alice e Betty s�o muito novas para realmente jogar o jogo e s�
 * est�o interessadas nas cartas reais. Para facilitar, assumiremos que cada
 * cart�o possui um identificador �nico, fornecido como um n�mero inteiro.
 * 
 * Ambas as meninas t�m um conjunto de cartas e, como a maioria das garotas de
 * sua idade, gostam de trocar as cartas que possuem. Eles obviamente n�o se
 * importam com as cartas id�nticas que ambos possuem e n�o querem receber
 * cartas repetidas na troca. Al�m disso, as cartas s�o negociadas em uma �nica
 * opera��o: Alice d� a Betty N cartas distintas e recebe de volta outras N
 * cartas distintas.
 * 
 * As meninas querem saber qual � o n�mero m�ximo de cartas que podem trocar.
 * Por exemplo, se Alice tiver cartas {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} e Betty
 * tiver cartas {2, 2, 2, 3, 4, 6, 10, 11, 11 }, eles podem negociar no m�ximo
 * quatro cartas.
 * 
 * Escreva um programa que, dados os conjuntos de cartas de Alice e Betty,
 * determine o n�mero m�ximo de cartas que eles podem negociar.
 * 
 * Entrada<br>
 * A entrada cont�m v�rios casos de teste. A primeira linha de um caso de teste
 * cont�m dois inteiros A e B, separados por um espa�o em branco, indicando
 * respectivamente o n�mero de cartas que Alice e Betty possuem (1 <= A <= 104 e
 * 1 <= B <= 104). A segunda linha cont�m A inteiros separados por espa�o Xi,
 * cada um indicando um dos cart�es de Alice (1 <= Xi <= 105). A terceira linha
 * cont�m B inteiros Yi separados por espa�os em branco, cada n�mero indicando
 * uma das cartas de Betty (1 <= Yi <= 105). As cartas de Alice e Betty s�o
 * listadas em ordem n�o decrescente.
 * 
 * O final da entrada � indicado por uma linha contendo apenas dois zeros,
 * separados por um espa�o em branco.
 * 
 * Sa�da<br>
 * Para cada caso de teste, seu programa deve imprimir uma �nica linha, contendo
 * um n�mero inteiro, indicando o n�mero m�ximo de cartas que Alice e Betty
 * podem negociar.
 *
 *
 * Sample Input | Sample Output<br>
 * 1 1 | 0<br>
 * 1000<br>
 * 1000<br>
 * 3 4 | 3<br>
 * 1 3 5<br>
 * 2 4 6 8<br>
 * 10 9 | 4 <br>
 * 1 1 2 3 5 7 8 8 9 15<br>
 * 2 2 2 3 4 6 10 11 11<br>
 * 0 0
 * 
 * 0 3 4
 * 
 * @author phsg5
 *
 */
public class Desafio3_B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
			int[] alice = new int[a];
			int[] betty = new int[b];
			for (int i = 0; i < a; i++) {
				alice[i] = scan.nextInt();
			}
			for (int i = 0; i < b; i++) {
				betty[i] = scan.nextInt();
			}
			int counter = 0, al = 0;
			int counter2 = 0, be = 0;
			for (int i = 0; i < a; ++i) {
				for (int j = 0; j < b; ++j) {
					if (alice[i] != betty[j]) {
						counter++;
						if (j + 1 == b && counter == b) {
							al++;
							counter = 0;
						}
					} else {
						counter = 0;
						break;
					}
					if (betty[j] != alice[i]) {
						counter2++;
						if (j + 1 == b && counter2 == b) {
							be++;
							counter2 = 0;
						}
					} else {
						counter2 = 0;
						break;
					}
				}
			}
			if (al > be) {
				System.out.println(be);
			} else {
				System.out.println(al);
			}
		}
	}
}
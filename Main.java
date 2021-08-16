package Main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro jogo = new Tabuleiro();
		String posicao;
		int valida = 0, jogadas = 0;
		
	
		while(true) {
			System.out.println("------------| Jogo da velha |------------");
			jogo.Mostrar();
			
			
			do {
				System.out.print("Jogador 1, Informe uma posição ");
				posicao = sc.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada invalida, tente novamente");
					System.out.print("Jogador 1, Informe uma posição ");
					posicao = sc.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0);
			
			jogadas++;
			jogo.Mostrar();
			valida = 0;
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
			do {
				System.out.print("Jogador 2, Informe uma posição ");
				posicao = sc.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada invalida, tente novamente");
					System.out.print("Jogador 2, Informe uma posição ");
					posicao = sc.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0);
			
			jogadas++;
			jogo.Mostrar();
			valida = 0;
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
		}
		
		System.out.println("O "+jogo.Ganhou(jogadas));
		
	}
}

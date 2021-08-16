package Main;

public class Tabuleiro {
	String[][] T = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	
	public String Mostrar() {
		for(int l = 0; l < 3; l++ ) {
			for(int c = 0; c < 3; c++) {
				System.out.printf("   "+T[l][c]);
				
			}
			System.out.println("\n");
		}
		return null;
	}
	
	public boolean Valido(String pos) {
		for(int l = 0; l<3; l++) {
			for(int c = 0; c < 3; c++) {
				if(T[l][c].equals(pos))
					return true;
			}
		}
		return false;
	}
	
	public void Jogada (String pos, String jogador) {
		if(pos.equals("1"))
			T[0][0] = jogador;
		else if(pos.equals("2"))
			T[0][1] = jogador;
		else if(pos.equals("3"))
			T[0][2] = jogador;
		else if(pos.equals("4"))
			T[1][0] = jogador;
		else if(pos.equals("5"))
			T[1][1] = jogador;
		else if(pos.equals("6"))
			T[1][2] = jogador;
		else if(pos.equals("7"))
			T[2][0] = jogador;
		else if(pos.equals("8"))
			T[2][1] = jogador;
		else if(pos.equals("9"))
			T[2][2] = jogador;
		
	}
	
	public String Ganhou(int jogadas) {
		String[] G = new String[8];
		String vencedor = "null";
		if(jogadas == 9) {
			vencedor = "EMPATE";
		}
		
		G[0] = T[0][0] + T[0][1] + T[0][2];
		G[1] = T[1][0] + T[1][1] + T[1][2];
		G[2] = T[2][0] + T[2][1] + T[2][2];
		
		G[3] = T[0][0] + T[1][0] + T[2][0];
		G[4] = T[0][1] + T[1][1] + T[2][1];
		G[5] = T[0][2] + T[1][2] + T[2][2];
		
		G[6] = T[0][0] + T[1][1] + T[2][2];
		G[7] = T[0][2] + T[1][1] + T[2][0];
		
		for(int i = 0; i < G.length; ++i) {
			if(G[i].equals("XXX")) {
				vencedor = "O Jogador 1 Venceu";
			}
			else if(G[i].equals("OOO")) {
				vencedor = "O Jogador 2 Venceu";
			}
		}
		return vencedor;
	}
}

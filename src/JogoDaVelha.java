import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		perguntaProUsuario();
	}

	private static String[] perguntaProUsuario() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a linha: ");
		String linha = entrada.nextLine();
		System.out.println("Digite a coluna: ");
		String coluna = entrada.nextLine();
		System.out.println("Digite X ou O : ");
		String jogador = entrada.nextLine();

		String[] respostas = { linha, coluna, jogador };

		return respostas;
	}

	public static String[][] inicializar() {
		String tabuleiroEsperado[][] = new String[][] { { "", "", "" },
														{ "", "", "" }, 
														{ "", "", "" } };
		return tabuleiroEsperado;
	}

	// realiza jogo
	public static void jogar(String[][] tabuleiro, int i, int j, String jogador)
			throws JogoDaVelhaException {
		verificaPosicaoForaDoTabuleiro(tabuleiro, i, j);
		marcaNoTabuleiro(tabuleiro, i, j, jogador);

	}

	public static void verificaPosicaoForaDoTabuleiro(String[][] tabuleiro,
			int i, int j) throws JogoDaVelhaException {

		if (i >= tabuleiro.length || j >= tabuleiro.length) {
			throw new JogoDaVelhaException("pocisão fora");
		}

	}

	public static void marcaNoTabuleiro(String[][] tabuleiro, int i, int j,
			String jogador) throws JogoDaVelhaException {
		if (tabuleiro[i][j].equals("")) {
			tabuleiro[i][j] = jogador;
		} else if (!tabuleiro[i][j].equals("")) {
			throw new JogoDaVelhaException("jogada invalida");
		}
	}

	public static boolean existeGanhador(String[][] tabuleiro, String jogador) {
		  	   if ((tabuleiro[0][0].equals("X")) 
				&& (tabuleiro[0][1].equals("X"))
				&& (tabuleiro[0][2].equals("X"))) {
			return true;
		} else if ((tabuleiro[1][0].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[1][2].equals("X"))) {
			return true;
		} else if ((tabuleiro[2][0].equals("X"))
				&& (tabuleiro[2][1].equals("X"))
				&& (tabuleiro[2][2].equals("X"))) {
			return true;
			
		} else if ((tabuleiro[0][0].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[2][2].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[2][0].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("O"))
				&& (tabuleiro[0][1].equals("O"))
				&& (tabuleiro[0][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[1][0].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[1][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[2][0].equals("O"))
				&& (tabuleiro[2][1].equals("O"))
				&& (tabuleiro[2][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[2][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[2][0].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("X"))
				&& (tabuleiro[1][0].equals("X"))
				&& (tabuleiro[2][0].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][1].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[2][1].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("X"))
				&& (tabuleiro[1][2].equals("X"))
				&& (tabuleiro[2][2].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("O"))
				&& (tabuleiro[1][0].equals("O"))
				&& (tabuleiro[2][0].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][1].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[2][1].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("O"))
				&& (tabuleiro[1][2].equals("O"))
				&& (tabuleiro[2][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[2][2].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("X"))
				&& (tabuleiro[1][1].equals("X"))
				&& (tabuleiro[2][0].equals("X"))) {
			return true;
		} else if ((tabuleiro[0][0].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[2][2].equals("O"))) {
			return true;
		} else if ((tabuleiro[0][2].equals("O"))
				&& (tabuleiro[1][1].equals("O"))
				&& (tabuleiro[2][3].equals("O"))) {
			return true;
		}
		return false;
		}
	}

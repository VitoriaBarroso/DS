package prjJogo;


	import java.util.Scanner;
	public class JogoDaIdosa {
		  private static char[][] tabuleiro = new char[3][3];
		    private static char jogadorAtual = 'X';

		    public static void main(String[] args) {
		        inicializarTabuleiro();
		        boolean jogoEmAndamento = true;

		        while (jogoEmAndamento) {
		            fazerJogada();
		            jogoEmAndamento = !verificarVitoria() && !verificarEmpate();
		            alternarJogador();
		        }

		        exibirResultado();
		    }

		    private static void inicializarTabuleiro() {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                tabuleiro[i][j] = ' ';
		            }
		        }
		    }

		    private static void fazerJogada() {
		        Scanner scanner = new Scanner(System.in);
		        int linha, coluna;

		        do {
		            System.out.print("Jogador " + jogadorAtual + ", escolha a linha (0, 1 ou 2): ");
		            linha = scanner.nextInt();
		        } while (linha < 0 || linha >= 3);

		        do {
		            System.out.print("Jogador " + jogadorAtual + ", escolha a coluna (0, 1 ou 2): ");
		            coluna = scanner.nextInt();
		        } while (coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ');

		        tabuleiro[linha][coluna] = jogadorAtual;
		    }

		    private static boolean verificarVitoria() {
		        for (int i = 0; i < 3; i++) {
		            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
		                return true;
		            }
		            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
		                return true;
		            }
		        }

		        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
		            return true;
		        }
		        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
		            return true;
		        }

		        return false;
		    }

		    private static boolean verificarEmpate() {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (tabuleiro[i][j] == ' ') {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }

		    private static void alternarJogador() {
		        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
		    }

		    private static void exibirResultado() {
		        if (verificarVitoria()) {
		            System.out.println("Jogador " + jogadorAtual + " venceu!");
		        } else {
		            System.out.println("Empate!");
		        }
		    }
		}


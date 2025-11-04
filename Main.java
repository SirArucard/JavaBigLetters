import java.util.Scanner;

public class Main
{
	//Classe principal que chama todas as funções, o coração do nosso código
	public static void main(String[] args) { 
		int alturaPalavra = 5; // Declaração da altura e largura das letras, sempre num quadrado
		String palavra = pedePalavra(); // Realiza a declação da variável palavra que chama a função pedePalavra
		imprimePalavra(alturaPalavra, palavra); //Chama a função que imprime a palavrona na tela
		
	}

	public static String pedePalavra() {
		Scanner text = new Scanner(System.in);
		System.out.println("Digite a palavra que vai virar palavrona: ");
		String palavrona = text.nextLine().toUpperCase();
		return palavrona;
	}

	public static void imprimePalavra(int alturaPalavra, String palavra) {
		for (int linha = 0; linha < alturaPalavra; linha++) {
			for (int i = 0; i < palavra.length(); i++) {
				char letra = palavra.charAt(i);
				char [][] matrizLetra = montaLetra(letra);
				for (int coluna = 0; coluna < alturaPalavra; coluna++) {
					System.out.print(matrizLetra[linha][coluna]);
				}

				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static char[][] montaLetra(char letra)
	{
		if (letra == 'A') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'B') {
			return new char[][] {
				{'O', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == 'C') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'D') {
			return new char[][] {
				{'O', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == 'E') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'F') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '}

			};
		}
		else if (letra == 'G') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'H') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'I') {
			return new char[][] {
				{' ', 'O', 'O', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == 'J') {
			return new char[][] {
				{' ', 'O', 'O', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{'O', ' ', 'O', ' ', ' '},
				{'O', ' ', 'O', ' ', ' '},
				{'O', 'O', 'O', ' ', ' '}

			};
		}
		else if (letra == 'K') {
			return new char[][] {
				{'O', ' ', ' ', 'O', ' '},
				{'O', ' ', 'O', ' ', ' '},
				{'O', 'O', ' ', ' ', ' '},
				{'O', ' ', 'O', ' ', ' '},
				{'O', ' ', ' ', 'O', ' '}

			};
		}
		else if (letra == 'L') {
			return new char[][] {
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'M') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', ' ', 'O', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'N') {
			return new char[][] {
				{'O', 'O', ' ', ' ', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', ' ', ' ', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'O') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'P') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '}

			};
		}
		else if (letra == 'Q') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', 'O', ' ', ' '}

			};
		}
		else if (letra == 'R') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', ' ', ' '},
				{'O', ' ', ' ', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'S') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'T') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '}

			};
		}
		else if (letra == 'U') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == 'V') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{' ', 'O', ' ', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '}

			};
		}
		else if (letra == 'W') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', 'O', ' ', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'X') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{' ', 'O', ' ', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', 'O', ' ', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'}

			};
		}
		else if (letra == 'Y') {
			return new char[][] {
				{'O', ' ', ' ', ' ', 'O'},
				{' ', 'O', ' ', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '}

			};
		}
		else if (letra == 'Z') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', ' ', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', 'O', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == '0') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', 'O', 'O'},
				{'O', ' ', 'O', ' ', 'O'},
				{'O', 'O', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == '1') {
			return new char[][] {
				{' ', 'O', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == '2') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', ' ', 'O', 'O'},
				{' ', ' ', 'O', ' ', ' '},
				{'O', 'O', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == '3') {
			return new char[][] {
				{' ', 'O', 'O', 'O', ' '},
				{' ', ' ', ' ', ' ', 'O'},
				{' ', ' ', 'O', 'O', ' '},
				{' ', ' ', ' ', ' ', 'O'},
				{' ', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == '4') {
			return new char[][] {
				{'O', ' ', ' ', 'O', ' '},
				{'O', ' ', ' ', 'O', ' '},
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', 'O', ' ', ' '},
				{' ', ' ', 'O', ' ', ' '}

			};
		}
		else if (letra == '5') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == '6') {
			return new char[][] {
				{' ', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', 'O', ' '},
				{'O', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == '7') {
			return new char[][] {
				{'O', 'O', 'O', 'O', ' '},
				{' ', ' ', ' ', 'O', ' '},
				{' ', ' ', 'O', ' ', ' '},
				{' ', 'O', ' ', ' ', ' '},
				{' ', 'O', ' ', ' ', ' '}

			};
		}
		else if (letra == '8') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', 'O'},
				{' ', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', 'O'}

			};
		}
		else if (letra == '9') {
			return new char[][] {
				{' ', 'O', 'O', 'O', ' '},
				{'O', ' ', ' ', ' ', 'O'},
				{' ', 'O', 'O', 'O', ' '},
				{' ', ' ', ' ', ' ', 'O'},
				{'O', 'O', 'O', 'O', ' '}

			};
		}
		else if (letra == 'Ç') {
			return new char[][] {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', ' ', ' ', ' ', ' '},
				{'O', ' ', ' ', ' ', ' '},
				{'O', 'O', 'O', 'O', 'O'},
				{' ', ' ', 'O', 'O', ' '}

			};
		}
		else {
		    return new char[][] {
				{' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' '}

			};
		}
    }
}
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		int alturaPalavra = 5;
		
		String palavra = pedePalavra();
		imprimePalavra(alturaPalavra, palavra);
		
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
		else {
			System.out.println("Error: Tu nao digitou uma letra po");
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
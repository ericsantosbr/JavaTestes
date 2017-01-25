import java.util.Scanner;

public class jogoDaVelha{
	public static void main(String [] args){
		// Instancia objeto de entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		// Instancia objeto campo
		campo Campo = new campo();
		boolean jogo = true;
		jogadorX = true;
		jogadorY = false;
		
		while(jogo){
		
			while(jogadorX){
				Campo.jogada();
			}
		}
	}
}

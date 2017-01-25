// O método recebe um objeto do tipo campo e faz o processo de imprimir de modo arcaico um campo na tela fazendo uso de System.out.println

/*
O campo deve se parecer mais ou menos com isso:

X | 1 | 2 | 3
- - - - - - - -
1 | * | * | *
- - - - - - - -
2 | * | * | *
- - - - - - - -
3 | * | * | *

*/

public class imprimeCampo{
	public void imprime(campo Campo){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				String atual = Campo.getMatriz(i, j);
				if(i == 0 && j == 0){
					System.out.println("X | 1 | 2 | 3");
					System.out.println("- - - - - - -");
				}
				if(i == 0 && j == 0){
					System.out.printf("1 | " + atual);
				}
				if(i == 0 && j == 1){
					System.out.printf(" | " + atual);
				}
				if(i == 0 && j == 2){
					System.out.println(" | " + atual);
					System.out.println("- - - - - - -");
				}
				if(i == 1 && j == 0){
					System.out.printf("2 | " + atual);
				}
				if(i == 1 && j == 1){
					System.out.printf(" | " + atual);
				}
				if(i == 1 && j == 2){
					System.out.println(" | " + atual);
					System.out.println("- - - - - - -");
				}
				if(i == 2 && j == 0){
					System.out.printf("3 | " + atual);
				}
				if(i == 2 && j == 1){
					System.out.printf(" | " + atual);
				}
				if(i == 2 && j == 2){
					System.out.println(" | " + atual);
				}
				
			}
		}
	}
}


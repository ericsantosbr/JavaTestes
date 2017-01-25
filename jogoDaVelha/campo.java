public class campo{
	private String matriz[][] = new String[3][3];
	// Construtor que varre a matriz ao instanciar o objeto Campo e faz uma limpeza
	public campo(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = "*";
			}
		}
	}
	boolean jogada(int x, int y, String peca){
		if(peca.equals("x")){
			peca = "X";
		}
		if(peca.equals("y")){
			peca = "Y";
		}
		if(matriz[x][y].equals("X") || matriz[x][y].equals("Y")){
			System.out.println("Erro! Jogada inválida!");
			return false;
		}
		else{
			matriz[x][y] = peca;
			System.out.println("Perfeito");
			return true;
		}
	}
	String getMatriz(int i, int j){
		String atual = matriz[i][j];
		return atual;
	}
}

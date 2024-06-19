package Matriz;

public class atividade04 {

	public static void main(String[] args) {
		char matrizA[] []= {
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
				{'*','*','*','*','*'},
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
				};
		for(char[]letra:matrizA) {
		for (char coluna: letra) {
			System.out.print(coluna + "\t");
				}
			System.out.println();
	}
		}
		}

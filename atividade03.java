package Matriz;

public class atividade03 {

	public static void main(String[] args) {
		
			char matrizA[] [] = {
					{' ',' ',' ','*'},
					{' ', ' ','*',' '},
					{' ','*',' ',' '},
					{'*',' ',' ',' '},
			};
			for(char[]letra:matrizA) {
				for(char diagonal: letra) {
				System.out.print(diagonal + "\t");
				}
					System.out.println();
				}
				
			}

		


	}



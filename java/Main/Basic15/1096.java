import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[19][19];
		// 흰 돌을 놓을 개수
		int whiteCount = sc.nextInt();
		
		for (int set = 0; set < whiteCount; set++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			// 입력 좌표는 1 부터 받음
			// 인덱스는 0 이므로 -1 처리
			// 여러번 입력 받아도 어차피 돌은 한번만 놓으니까 그냥 1
			board[x][y] = 1;
		}
		
		for (int row = 0; row < board.length; row++) {				
			for (int i = 0; i < board[row].length; i++) {												
				System.out.print(board[row][i] + " ");				
			}						
			System.out.println();
		}
						
		// 항상된 for문 출력
		/*
		for (int[] row : board) {
		 
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}				
		*/
		
		sc.close();
	}

}

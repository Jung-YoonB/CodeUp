import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 바둑판
		int[][] board = new int[19][19];
		
		// 놓인 돌 입력 받기
		for (int row = 0; row < board.length; row++) {			
			for (int i = 0; i < board[row].length; i++) {
				board[row][i] = sc.nextInt();				
			}						
		}
		
		// 뒤집기 횟수 입력 받기
		int reversCount = sc.nextInt();
		
		// 뒤집을 좌표 입력 받고 뒤집기
		for (int set = 0; set < reversCount; set++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// 행 뒤집기
			for (int i = 0; i < board.length; i++) {
				if (board[x - 1][i] == 0) {
					board[x - 1][i] = 1;
					} else if (board[x - 1][i] == 1) {
						board[x - 1][i] = 0;
					}
			}

			
			// 열 뒤집기
			for (int i = 0; i < board.length; i++) {
				if (board[i][y - 1] == 0) {
					board[i][y - 1] = 1;
					} else if (board[i][y - 1] == 1) {
						board[i][y - 1] = 0;
					}
			}
			
			
		}
		
		// 나열하기
		for (int row = 0; row < board.length; row++) {						
			for (int i = 0; i < board[row].length; i++) {				
				System.out.print(board[row][i] + " ");	
			}						
			System.out.println();
		}
						
		
		sc.close();
	}

}

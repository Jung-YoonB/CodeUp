import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 격자판 세로(h), 가로(w)
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		// 격자판
		int[][] board = new int[h][w];
		
		// 바로 입력 받을 수 도 있음
//		int[][] board = new int[sc.nextInt()][sc.nextInt()];
		
		// 놓을 막대기 수
		int nCount = sc.nextInt();
		
		// 막대 길이, 방향, 좌표 입력
		for (int set = 0; set < nCount; set++) {
			// 막대 길이
			int l = sc.nextInt();
			// 막대 방향 가로 0, 세로 1
			int d = sc.nextInt();
			// 막대 위치 왼쪽 x, 위쪽 y
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			for (int i = 0; i < l; i++) {
				if (d == 0) {
					// 가로 놓기
					board[x][y + i] = 1;
				}	else {
					// 세로 놓기
					board[x + i][y] = 1;
				}				
			}
					
		}
				
		// 나열하기
		/*
		for (int row = 0; row < board.length; row++) {						
			for (int i = 0; i < board[row].length; i++) {				
				System.out.print(board[row][i] + " ");	
			}						
			System.out.println();
		}
		*/
		
		// 항상된 for문으로 출력
		for (int[] row : board) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

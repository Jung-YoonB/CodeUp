import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 미로 상자
		int[][] box = new int[10][10];
		
		// 미로 상자 구성 입력
		// 갈 수 있는 곳 0, 벽/장애물 1, 먹이 2
		for (int row = 0; row < box.length; row++) {			
			for (int i = 0; i < box[row].length; i++) {
				box[row][i] = sc.nextInt();				
			}						
		}
		
		// 개미의 시작 좌표
		int x = 1;
		int y = 1;

		// 개미가 움직이면 9, 먹이 찾으면 멈추기
		while (true) {
			// 받은 위치랑 시작점이 곧 먹이 였다
			if (box[x][y] == 2) {
				box[x][y] = 9;
				break;
			}
			
			// 일단 개미가 있으면 1,1 에도 9 표시
			box[x][y] = 9;
					
			// 오른쪽부터 이동
			if (box[x][y + 1] == 0 || box[x][y + 1] == 2) {
				y++;
				// 아래로 이동
			}	else if (box[x + 1][y] == 0 || box[x + 1][y] == 2) {
				x++;
				// 갈 곳이 없다
			}	else {
				break;
			}
		}		
		
		// 결과 출력
		for (int[] row : box) {		 
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}				
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		// 그냥 print / println / printf 쓰면 메모리 초과 및 시간 초과
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int k = 0; k < b; k++) {
					sb.append(i).append(" ").append(j).append(" ").append(k).append("\n");
					
					count++;
				}
			}			
		}
		System.out.print(sb);
		System.out.println(count);
		sc.close();
	}

}

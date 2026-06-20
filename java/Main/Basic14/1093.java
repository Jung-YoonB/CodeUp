import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
  // 출석 번호를 부를 횟수 입력
  int call = sc.nextInt();
  
  // 출석 번호 불린 횟수
  int[] callCount = new int[23];
  
  // 출석 번호 부를 만큼 값 입력 받기
  for (int i = 0; i < call; i++) {
   int callStu = sc.nextInt();
   callCount[callStu - 1] += 1; // 1번이 불린 횟수를 1번 인덱스(0)에 저장
  }
  
  for (int value : callCount) {
   System.out.print(value + "" "");
  }
  
  sc.close();
 
 }

}

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
  // 출석 번호를 부를 횟수 입력
  int call = sc.nextInt();
  
  // 불린 번호
  int[] callNum = new int[call];
  
  // 출석 번호 부를 만큼 값 입력 받기
  for (int i = 0; i < call; i++) {
   int callStu = sc.nextInt();
   callNum[i] = callStu; // 1번 인덱스(0)에 저장 불린 출석 번호 저장
  }
  
  for (int i = call - 1; i >= 0; i--) {
   System.out.print(callNum[i] + "" "");
  }
  
  sc.close();
 
 }

}

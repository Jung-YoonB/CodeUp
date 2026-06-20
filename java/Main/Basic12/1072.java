import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  // 마지막 카운트가 되어야 하는 입력 받을 값
  int maxCount = sc.nextInt();
  // 0부터 세기 시작 할게
  int countNum = 0;
  
  while (true) {
   // 카운트 도달 하면 멈출게
   if (maxCount == countNum) {
    break;
   }
   
   // 실행할 내용
   int num = sc.nextInt();
   System.out.println(num);
   
   // 하나 셌다 다음거 세러 간다
   countNum++;
  }

  sc.close();
 }

}

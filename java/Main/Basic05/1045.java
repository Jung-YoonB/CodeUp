import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
  // 미리 한 값을 실수로 바꿔 줘야 실수 부분이 같이 계산되어 나옴 안그럼 정수로 버린 뒤 계산을 해버림
  double result = (double)num1 / num2;
  
  System.out.println(num1 + num2);
  System.out.println(num1 - num2);
  System.out.println(num1 * num2);
  System.out.println(num1 / num2);
  System.out.println(num1 % num2);
  System.out.printf(""%.2f"", result);
  
  sc.close();
 }

}

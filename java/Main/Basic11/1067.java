import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int num = sc.nextInt();
  
  // 첫 조건문에서 minus 나 plus 출력
  // 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
  if (num < 0) {
   System.out.println(""minus"");
  } else {
   System.out.println(""plus"");
  }
  
  if (num % 2 == 0) {
   System.out.println(""even"");
  } else {
   System.out.println(""odd"");
  }
  
  sc.close();
 }

}

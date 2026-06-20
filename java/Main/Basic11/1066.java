import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
    
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
  int num3 = sc.nextInt();
     
  // 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
  String result1 = (num1 % 2 == 0) ? ""even"" : ""odd"";
  String result2 = (num2 % 2 == 0) ? ""even"" : ""odd"";
  String result3 = (num3 % 2 == 0) ? ""even"" : ""odd"";
    
  System.out.println(result1);
  System.out.println(result2);
  System.out.println(result3);
  
  sc.close();
      
 }

}

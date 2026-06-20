"// 1050 과 동일

// 다르게 짜 볼 수 있는 코드
// 삼항 연산자 이용
package main;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
    
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
   
  int result = (num1 == num2) ? 1 : 0;
  
  System.out.println(result);
   
  sc.close();
      
 }

}"

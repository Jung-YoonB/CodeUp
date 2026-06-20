import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  int num = sc.nextInt(); 
  
  // %x : 16진수로 출력, %X : 16진수 대문자로 출력 
  System.out.printf(""%X"", num);
  
  sc.close();
 }

}

"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  char ch = sc.next().charAt(0); 
  int num = Integer.valueOf(ch);
  
  System.out.printf(""%d"", num);
  
  sc.close();
 }

}"

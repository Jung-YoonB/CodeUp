import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  char ch = sc.nextLine().charAt(0);
  char a = 'a';
  
  do {
   System.out.printf(""%c "", a);
   
   a += 1;
  } while (a <= ch);  

  sc.close();
 }

}

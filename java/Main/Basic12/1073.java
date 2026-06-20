import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  
  for (; ;) {
   int num = sc.nextInt();
   
   if (num == 0) {
    break;
   }
   
   System.out.println(num);
  }
  

  sc.close();
 }

}

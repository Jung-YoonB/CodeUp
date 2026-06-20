import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String[] rNum = sc.next().split(""-""); 
        
  System.out.println(rNum[0] + rNum[1]);

  sc.close();
 }

}

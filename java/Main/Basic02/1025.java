"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String[] num = sc.next().split(""""); 
  
  System.out.println(""["" + (Integer.valueOf(num[0]) * 10000) + ""]"");
  System.out.println(""["" + (Integer.valueOf(num[1]) * 1000) + ""]"");
  System.out.println(""["" + (Integer.valueOf(num[2]) * 100) + ""]"");
  System.out.println(""["" + (Integer.valueOf(num[3]) * 10) + ""]"");
  System.out.println(""["" + Integer.valueOf(num[4]) + ""]"");
  
  
  sc.close();
 }

}"

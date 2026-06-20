"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String[] date = sc.next().split("":""); 
  
  int hour = Integer.valueOf(date[0]);
  int min = Integer.valueOf(date[1]);
  int sec = Integer.valueOf(date[2]);
    
  System.out.println(min);

  sc.close();
 }

}"

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String word = sc.next(); 
  
  /* while 문으로도 작성
  int i = 0;
  while (i < word.length()) {
   System.out.println(""'"" + word.charAt(i)+ ""'"");
   i++;
  }
  */
  
  int i;
  for (i = 0; i < word.length(); i++) {
   System.out.printf(""'%c'\n"", word.charAt(i));
  }
  
  sc.close();
 }

}

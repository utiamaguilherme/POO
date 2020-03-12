import java.util.Scanner;


public class exedois {
  public static void main (String[] args )
  {
    int a;
    Scanner teclado = new Scanner ( System.in );
    a = teclado.nextInt();
    if(0 <= a && a < 5){
      System.out.println("f("+ a + ") = "+ a);
    }
    else if(a >= 5 && a <10 ){
      System.out.println("f("+ a + ") = " + (a*2 + 1));
    }
    else if(a >= 10){
      System.out.println("f("+ a + ") = " + (a-3));
    }
  }
}

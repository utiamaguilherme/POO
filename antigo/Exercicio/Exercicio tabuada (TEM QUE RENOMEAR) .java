import java.util.Scanner;
import java.util.Locale;

public class Exercicio {
  public static void main (String[] args )
  {
    int a, contador;
    Scanner teclado = new Scanner ( System.in );
    a =  teclado.nextInt();
    for (contador = 1; contador <= 10; contador ++){
      System.out.println(contador +"x"+ a + " = " + contador * a);
    }
  }
}

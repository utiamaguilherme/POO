import java.util.Scanner;
import java.util.Locale;

public class Exercicio {
  public static void main (String[] args )
  {
    int a,b,c;

    Scanner teclado = new Scanner ( System.in );
    a = teclado.nextInt();
    b = teclado.nextInt();
    c = teclado.nextInt();

    if ( a  ==  b  && b == c){
      System.out.println("Triângulo equilátero");
    }
    else if ( a ==  b || b == c || a == c){
      System.out.println("Triângulo isósceles");
    }
    else {
      System.out.println("Triângulo escaleno");
    }
  }
}

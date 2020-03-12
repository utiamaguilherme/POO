import java.util.Scanner;
import java.util.Locale;

public class exetres {
  public static void main (String[] args )
  {
    double peso = 0, altura = 0;
    int contador = 0;
    Scanner teclado = new Scanner ( System.in );
        teclado.useLocale( Locale.US );

    while(peso != -1 && altura != -1){
      peso = teclado.nextDouble();
      if (peso < 0){ break;}
      altura = teclado.nextDouble();
      if( (peso/(altura*altura))> 25 && peso >= 0 && altura >= 0){
        contador++;
      }
    }
    System.out.println(contador + " pessoas estão acima do peso.");

  }
}

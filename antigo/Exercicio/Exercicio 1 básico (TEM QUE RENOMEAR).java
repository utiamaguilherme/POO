import java.util.Scanner;
import java.util.Locale;

public class Exercicio {
  public static void main (String[] args )
  {
    float valor;
    int qtditem;
    float total;
    Scanner teclado = new Scanner (System.in);
    teclado.useLocale( Locale.US );
    valor = teclado.nextFloat();
    qtditem = teclado.nextInt();
    total = qtditem * valor;
    System.out.println("O valor do produto foi de R$ " + valor + " com a quantidade de " + qtditem + " , o preço total foi de R$ " + total );
  }

  }

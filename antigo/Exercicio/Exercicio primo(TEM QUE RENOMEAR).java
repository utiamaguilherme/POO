import java.util.Scanner;
import java.util.Locale;

public class POO {
  public static void main (String[] args ){
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número por favor!!!!\n");
    n = scan.nextInt();
    boolean primo = true;
    for(int i=2; i<n; i++){
      if(n%i == 0){
        primo = false;
        break;
      }
    }
    if(primo){
      System.out.println("O número é primo.");
    } else {
      System.out.println("Não é primo.");
    }
  }
}

package objeto;


public class Carro {
    String cor;
     static String dono;
     int preco,kmetragem;
     int anoFabricacao;
    
    void show(){
        System.out.println(dono); // eu nao sei printar 
         System.out.println(this.preco);
         System.out.println(this.kmetragem);
         System.out.println(this.anoFabricacao);
         System.out.println(this.cor);
    }
    void cor(String novaCor){
        cor = novaCor;
    }
    
    
}

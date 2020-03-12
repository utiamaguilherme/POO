package objeto;
public class Objeto {
    public static void main(String[] args) {
        Carro meu_carro = new Carro();
        Carro.dono = "DogãoCar";
        
        meu_carro.preco = 43200;
        meu_carro.kmetragem = 32055;
        meu_carro.anoFabricacao = 2013;
        meu_carro.cor("azul escuro metálico");
        meu_carro.show();
         
         Carro novo_carro = new Carro();
         novo_carro.preco = 23900;
         novo_carro.cor = "prata";
         novo_carro.anoFabricacao = 2006;
         novo_carro.kmetragem = 89233;
         novo_carro.show();
         
         Carro novo_carro2 = new Carro();
         novo_carro2.preco = 139800;
         novo_carro2.cor = "preto fosco";
         novo_carro2.anoFabricacao = 2013;
         novo_carro2.kmetragem = 19631;
         novo_carro2.show();
        
     
    }
    
}

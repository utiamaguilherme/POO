package javaapplication1;
/**
 * @author 3
 */
public class Personagem {  
    
    private static int counter=0;
    private int str;
    private int con;
    private int dex;
    private int agi;
    private String name;
 
    Personagem(String name, int str, int con, int dex, int agi){
        this.name = name;
        this.str = str > 0 ? str : 0;
        this.con = con > 0 ? con : 0;
        this.dex = dex > 0 ? dex : 0;
        this.agi = agi > 0 ? agi : 0;
        this.counter++;
    }
    
    public void getInfo(){
        System.out.println("Name: " + this.name   + 
                           "\nStr: "+ this.str    +
                           "\nCon: "+ this.con    +
                           "\nDex: "+ this.dex    +
                           "\nAgi: "+ this.agi    );
    }
    
    public String getName() {
        return name;
    }

    public void upStr(int str) {
        this.str = str;
    }

    public void upCon(int con) {
        this.con = con;
    }

    public void upDex(int dex) {
        this.dex = dex;
    }

    public void upAgi(int agi) {
        this.agi = agi;
    }
    
    public int HP(){
        return (this.con*100 + this.str*5);
    }
    
    public static int instances(){
        return counter;
    }
    
}

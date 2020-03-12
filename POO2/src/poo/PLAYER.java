/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author gustavo
 */
public class PLAYER {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if("".equals(this.name))
            this.name = name;
        else
            System.out.println("O nome "+ this.name +" nao pode ser alterado");      
    }

    /**
     * @return the str
     */
    public int getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(int str) {
        if(str>0){
            if((this.str+str)>0)
                this.str = this.str+ str;
            else
                System.out.println("atributos nao podem ser negativos");
        } 
        else
            System.out.println("só pode valores positivos");
    }

    /**
     * @return the vit
     */
    public int getVit() {
        return vit;
    }

    /**
     * @param vit the vit to set
     */
    public void setVit(int vit) {
        if(vit>0){
            if((this.vit+vit)>0)
                this.vit = this.vit+ vit;
            else
                System.out.println("atributos nao podem ser negativos");
        } 
        else
            System.out.println("só pode valores positivos");
    }

    /**
     * @return the dex
     */
    public int getDex() {
        return dex;
    }

    /**
     * @param dex the dex to set
     */
    public void setDex(int dex) {
        if(dex>0){
            if((this.dex+dex)>0)
                this.dex = this.dex+ dex;
            else
                System.out.println("atributos nao podem ser negativos");
        } 
        else
            System.out.println("só pode valores positivos");
    }

    /**
     * @return the agi
     */
    public int getAgi() {
        return agi;
    }

    /**
     * @param agi the agi to set
     */
    public void setAgi(int agi) {
        if(agi>0){
            if((this.agi+agi)>0)
                this.agi = this.agi+ agi;
            else
                System.out.println("atributos nao podem ser negativos");
        } 
        else
            System.out.println("só pode valores positivos");
        
    }
    private String name;
    private int str;
    private int vit;
    private int dex;
    private int agi;
    
    
    public PLAYER(String _name,int _str,int _vit,int _dex,int _agi)
    {
        this.name=_name;
        if(_str>=0)
            this.str=_str;
        else
            System.out.println("Valor de força invalido");
        if(_vit>=0)
            this.vit=_vit;
        else
            System.out.println("Valor de constituição invalido");
        if(_dex>=0)
            this.dex=_dex;
        else
            System.out.println("Valor de destreza invalido");
        if(_agi>=0)
            this.agi=_agi;
        else
            System.out.println("Valor de agilidade invalido");   
        

        
    }
        public void show()
        {
            System.out.println("Nome: "+this.getName()+"\nForça: "+this.getStr()+"\nConstituição: "+this.getVit()+"\nDestreza: "+this.getDex()+"\nAgilidade: "+this.getAgi()+"\nHP: "+((this.getVit()*100)+this.getStr()*5+"\n"));
        }

}

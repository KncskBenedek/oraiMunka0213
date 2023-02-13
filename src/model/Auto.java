
package model;


public class Auto extends Jarmu {
    private boolean defekt;

    public Auto() {
        super();
        this.defekt = false;
    }
    
    
    public void kereketCserel(){
        this.defekt = false;
    }
    @Override
    public boolean halad(){
         if(this.isUzemanyag() && Math.random() > 0.25){
           this.setMegerkezett(true);
           this.setUzemanyag(false);
       }else{
             this.defekt = true;
         }
       return this.defekt;
    }
}

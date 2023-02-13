
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
        if(Math.random() > 0.25){
            super.halad();
        }else{
            this.defekt = true;
        }
        
       return this.defekt;
    }

    public boolean isDefekt() {
        return defekt;
    }
    
}

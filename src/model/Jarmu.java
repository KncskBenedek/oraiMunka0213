
package model;


public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu() {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    
   public  void beindit(){
       this.beinditva = true;
   }
   public  void leallit(){
       this.beinditva = false;
   }
   public  boolean tankol(){
       if(!this.beinditva){
           this.uzemanyag = true;
       }
       return this.uzemanyag;
   }
   
   public  boolean halad(){
       if(this.uzemanyag){
           this.megerkezett = true;
           this.uzemanyag = false;
       }
       return this.megerkezett;
   };

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }
   
}

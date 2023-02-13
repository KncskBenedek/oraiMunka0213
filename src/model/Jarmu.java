
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
       return true;
   }
   
   public  boolean halad(){
       if(this.uzemanyag){
           this.megerkezett = true;
           this.uzemanyag = false;
       }
       return this.megerkezett;
   };
   
}

import greenfoot.*;  


public abstract class AktorKtóryKiedyśZnikaZwłaszczaKiedyGoKliknąć extends Actor
{
    public final void act(){
        wykonajRuch();
        if(czyMaZniknąć()){          
            znikam();
            getWorld().removeObject(this);
        }
        else{
            if(Greenfoot.mouseClicked(this)){
                znikamPrzezKliknięcie();
                getWorld().removeObject(this); 
            }            
        }        
    }
    
    abstract void wykonajRuch();
    abstract boolean czyMaZniknąć();
    abstract void znikamPrzezKliknięcie();
    abstract void znikam();
} 
    
    


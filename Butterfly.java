import greenfoot.*;  


public class Butterfly extends AktorKtóryZnikaNaKrawędzi
{
    int SPEED = 1;
    public Butterfly(){
        GreenfootImage img = getImage();
        img.scale(30, 30);         
    }
    
    void wykonajRuch(){        
        setLocation(getX() + SPEED, getY());
    }
    
    boolean czyMaZniknąć(){
        return isAtEdge();
    }
     
   void znikamPrzezKliknięcie(){
        
    } 
    
    void znikam(){
        ((MyWorld)getWorld()).score.subtract(1);
    }
}

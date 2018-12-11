import greenfoot.*;  


public class Cytryna extends AktorKtóryZnikaNaKrawędzi
{
    int SPEED = 1;
    private Kierunek kierunek;    
    public Cytryna(Kierunek x){
        GreenfootImage img = getImage();
        img.scale(30, 30);
        this.kierunek = x;
    }     
    void znikam(){    
    }
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.subtract(Greenfoot.getRandomNumber(8) - 2);
    }
    void wykonajRuch(){
        if(kierunek == Kierunek.DÓŁ){
            setLocation(getX(), getY() + SPEED);            
        }
        if(kierunek == Kierunek.LEWO){
            setLocation(getX() - SPEED, getY());            
        }
        if(kierunek == Kierunek.GÓRA){
            setLocation(getX(), getY() - SPEED);            
        }
        if(kierunek == Kierunek.PRAWO){
            setLocation(getX() + SPEED, getY());            
        }      
    }
}

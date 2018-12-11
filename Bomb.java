import greenfoot.*;  


public class Bomb extends AktorKtóryZnikaPoPewnymCzasie
{
    public Bomb(){
        GreenfootImage img = getImage();
        img.scale(25, 25); 
    }
    int dajCzasŻycia(){
        return 150;
    } 
    void wykonajRuch(){
    
    }
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.subtract(2); 
    }
    void znikam(){
    
    }
}

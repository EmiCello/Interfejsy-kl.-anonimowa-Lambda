import greenfoot.*;  

public class Miś extends AktorKtóryZnikaPoPewnymCzasie
{
    int quasiSecond = 40;
    int teddyTime = 0;    
    int disappearanceTime = 20 * quasiSecond - teddyTime * quasiSecond;
    public Miś(){
        GreenfootImage img = getImage();
        img.scale(30, 30);    
    }
    int dajCzasŻycia(){
        return 20 * quasiSecond;
    }
    void znikam(){
    
    }
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.add(disappearanceTime / 5); 
    }
    void wykonajRuch(){
        teddyTime++;    
    }
}

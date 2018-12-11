import greenfoot.*;  


public class Banan extends AktorKtóryZnikaPoPewnymCzasie
{
    int bananasTime = 0;
    public Banan(){
        GreenfootImage img = getImage();
        img.scale(40, 40);    
    }
    int dajCzasŻycia(){
        return 350;
    }
    void znikam(){
    
    }
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.add(bananasTime / 10); 
    }
    void wykonajRuch(){
        bananasTime++;
    }
}

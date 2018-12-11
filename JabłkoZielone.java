import greenfoot.*;  


public class JabłkoZielone extends AktorKtóryZnikaPoPewnymCzasie
{
    int quasiSecond = 40;
    public JabłkoZielone(){
        GreenfootImage img = getImage();
        img.scale(30, 30);    
    }
    int dajCzasŻycia(){
        return 12 * quasiSecond;
    }
    void znikam(){
        ((MyWorld)getWorld()).score.subtract(2);
    }
    void znikamPrzezKliknięcie(){
         ((MyWorld)getWorld()).score.add(5);
    }
    void wykonajRuch(){            
    } 
}

import greenfoot.*;  

public class JabłkoCzerwone extends AktorKtóryZnikaNaKrawędzi
{
    int SPEED = 1;
    public JabłkoCzerwone(){
        GreenfootImage img = getImage();
        img.scale(30, 30);    
    }
    void znikam(){
    
    } 
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.add(1);
    }
    void wykonajRuch(){
        setLocation(getX(), getY() + SPEED);
    }
}    


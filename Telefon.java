import greenfoot.*; 

public class Telefon extends AktorKtóryZnikaNaKrawędzi
{
    int SPEED = Greenfoot.getRandomNumber(3) + 1;
    int currentY;
    public Telefon(){
        GreenfootImage img = getImage();
        img.scale(30, 30);    
    }
    void znikam(){
    
    } 
    void znikamPrzezKliknięcie(){
        if(currentY < getWorld().getHeight() / 2){
                ((MyWorld)getWorld()).score.subtract(2); 
        }else{
                ((MyWorld)getWorld()).score.add(6); 
        } 
    }
    void wykonajRuch(){
        currentY = getY();
        setLocation(getX(), getY() + SPEED);
    }
}

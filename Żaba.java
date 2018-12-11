import greenfoot.*;  

public class Żaba extends AktorKtóryZnikaNaKrawędzi
{
    int JUMPSIZE = 15;
    int jumpCounter = 0;
    public Żaba(){
        GreenfootImage img = getImage();
        img.scale(30, 30);    
    }
    void wykonajRuch(){
        if(jumpCounter == 0){
            jump(JUMPSIZE);
        }
        jumpCounter++;
        if(jumpCounter == 100){
            jumpCounter = 0;
        }
    }
    private void jump(int JUMPSIZE){
        move(JUMPSIZE);
    }
    void znikam(){
        ((MyWorld)getWorld()).score.add(Greenfoot.getRandomNumber(5) + 1);
    }
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.subtract(Greenfoot.getRandomNumber(2) + 1); 
    }
}

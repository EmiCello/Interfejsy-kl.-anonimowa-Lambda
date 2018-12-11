import greenfoot.*;  


public class NiebieskiBalonik extends AktorKtóryZnikaNaKrawędzi
{
    void wykonajRuch(){        
        setLocation(getX(), getY() - 1);
    } 
    void znikamPrzezKliknięcie(){
        ((MyWorld)getWorld()).score.add(3);
    }
    void znikam(){
        ((MyWorld)getWorld()).score.subtract(1);
    }
}

import greenfoot.*;  


public class ZlecenieOkresowegoTworzeniaAktora extends Actor
{
    private FabrykaAktorów fabrykaAktorów;
    private int odKiedyTworzyćAktora;
    private int coIleTworzyćAktora;
    
    public ZlecenieOkresowegoTworzeniaAktora
    (FabrykaAktorów fabrykaAktorów, int odKiedyTworzyćAktora, int coIleTworzyćAktora){
        this.fabrykaAktorów = fabrykaAktorów;
        this.odKiedyTworzyćAktora = odKiedyTworzyćAktora;
        this.coIleTworzyćAktora = coIleTworzyćAktora;
    }
    
    public FabrykaAktorów getFabrykaAktorów() { 
        return fabrykaAktorów; 
    }
    
    public void setFabrykaAktorów(FabrykaAktorów fabrykaAktorów){
        this.fabrykaAktorów = fabrykaAktorów;
    }
    
    public int getOdKiedyTworzyćAktora() { 
        return odKiedyTworzyćAktora; 
    }
    
    public void setOdKiedyTworzyćAktora(int odKiedyTworzyćAktora){
        this.odKiedyTworzyćAktora = odKiedyTworzyćAktora;
    }
    
    public int getCoIleTworzyćAktora() { 
        return coIleTworzyćAktora; 
    }
    
    public void setCoIleTworzyćAktora(int coIleTworzyćAktora){
        this.coIleTworzyćAktora = coIleTworzyćAktora;
    }   
}

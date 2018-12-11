import greenfoot.*;  
import java.util.ArrayList;
import java.util.List;

public class TwórcaAktorów extends Actor 
{
    int quasiSecond = 50;
    int counter = 0; 
    
   List <ZlecenieOkresowegoTworzeniaAktora> zleceniaOkresowegoTworzeniaAktora = new ArrayList<>();    
    
    public void act(){
       for(ZlecenieOkresowegoTworzeniaAktora a : zleceniaOkresowegoTworzeniaAktora){
           if(counter == a.getOdKiedyTworzyćAktora() * quasiSecond){
               AktorZPołożeniem aktor = a.getFabrykaAktorów().zróbAktoraZPołożeniem();
               ((MyWorld)getWorld()).addObject(aktor.aktor, aktor.x, aktor.y);
               a.setOdKiedyTworzyćAktora(a.getOdKiedyTworzyćAktora() + a.getCoIleTworzyćAktora());
           }              
       }
       counter++;    
   }
   
   public void zlećOkresoweTworzenieAktora(FabrykaAktorów fabrykaAktorów, int odKiedyTworzyćAktora, int coIleTworzyćAktora ){
       ZlecenieOkresowegoTworzeniaAktora z = 
       new ZlecenieOkresowegoTworzeniaAktora(fabrykaAktorów, odKiedyTworzyćAktora, coIleTworzyćAktora);
       z.setFabrykaAktorów(fabrykaAktorów); 
       z.setOdKiedyTworzyćAktora(odKiedyTworzyćAktora);
       z.setCoIleTworzyćAktora(coIleTworzyćAktora);        
       zleceniaOkresowegoTworzeniaAktora.add(z);
   }
}


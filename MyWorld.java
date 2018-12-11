import greenfoot.*;  


public class MyWorld extends World
{
    Score score;
    BananPołożenie położenieBanana;
    MiśPołożenie położenieMisia;
    TelefonPołożenie położenieTel;
    CytrynaPołożenie położenieCytryny; 
    int doIlu = 4;
    int oprócz;
   
    public MyWorld()
    {    
            super(600, 400, 1, false);  
            score = new Score();
            addObject(score, 100, 360); 
            
            położenieBanana = new BananPołożenie();
            położenieBanana.x = getWidth() / 2;
            położenieBanana.y = getHeight() / 2;
            położenieBanana.previouslyRandomDirection = 4;           
            
            położenieMisia = new MiśPołożenie();
            położenieMisia.previousQuarter = 5;
            
            położenieTel = new TelefonPołożenie();
            położenieTel.x = 1;
            
            położenieCytryny = new CytrynaPołożenie();
            położenieCytryny.krawędź = 1;
         
            TwórcaAktorów kreator = new TwórcaAktorów();
            addObject(kreator, 50, 50); 
            
            kreator.zlećOkresoweTworzenieAktora(() ->{                
                    return new AktorZPołożeniem(
                    new NiebieskiBalonik(),
                    Greenfoot.getRandomNumber(getWidth()),
                    (getHeight() - 1));                                              
            }, 3, 3);
            
            kreator.zlećOkresoweTworzenieAktora(() -> {
                    return new AktorZPołożeniem(
                    new Bomb(),
                    Greenfoot.getRandomNumber(getWidth()),
                    Greenfoot.getRandomNumber(getHeight())); 
            }, 15, 5);
            
            kreator.zlećOkresoweTworzenieAktora(() ->{                
                    return new AktorZPołożeniem(
                    new Butterfly(),
                    Greenfoot.getRandomNumber(getWidth() - 100),
                    Greenfoot.getRandomNumber(getHeight()));                                              
            }, 32, 32); 
            
            kreator.zlećOkresoweTworzenieAktora(() ->{               
                    return new AktorZPołożeniem(
                    new Żaba(),
                    1,
                    Greenfoot.getRandomNumber(getHeight()));
            }, 48, 7);
            
            kreator.zlećOkresoweTworzenieAktora(() ->{
                    int rodzajJabłka = Greenfoot.getRandomNumber(2);
                    Actor aktor;
                    if(rodzajJabłka == 0){
                        aktor = new JabłkoZielone();
                    }else{
                        aktor = new JabłkoCzerwone();
                    } 
                    return new AktorZPołożeniem(
                    aktor,                         
                    Greenfoot.getRandomNumber(getWidth()),
                    Greenfoot.getRandomNumber(getHeight()));
            }, 141, 12); 
            
            FabrykaAktorów fbn = new FabrykaAktorów(){
                @Override
                public AktorZPołożeniem zróbAktoraZPołożeniem(){
                    AktorZPołożeniem aktor = 
                    new AktorZPołożeniem(new Banan(), położenieBanana.x, położenieBanana.y);                       
                    dajNowePołożenieBanana(położenieBanana);
                    return aktor;                    
                } 
                
                private BananPołożenie dajNowePołożenieBanana(BananPołożenie położenieBanana){           
                    int randomDirection = wylosujLiczbę(doIlu, położenieBanana.previouslyRandomDirection);               
                    if(randomDirection == 0){
                        położenieBanana.x = położenieBanana.x + 50;
                        return dajPołożenieX(położenieBanana, randomDirection);
                    }
                    if(randomDirection == 1){
                        położenieBanana.x =  położenieBanana.x - 50;
                        return dajPołożenieX(położenieBanana, randomDirection);
                    }
                    if(randomDirection == 2){
                        położenieBanana.y = położenieBanana.y - 50;
                        return dajPołożenieY(położenieBanana, randomDirection);
                    }else{
                        położenieBanana.y = położenieBanana.y + 50;
                        return dajPołożenieY(położenieBanana, randomDirection);         
                    }           
                }
                private BananPołożenie dajPołożenieX(BananPołożenie położenieBanana, int randomDirection){
                    if(położenieBanana.x < 0){
                        położenieBanana.x = getWidth() / 2;
                        położenieBanana.previouslyRandomDirection = randomDirection;
                        return położenieBanana;
                    }else{
                        położenieBanana.previouslyRandomDirection = randomDirection;
                        return położenieBanana;
                    }    
                }    
                private BananPołożenie dajPołożenieY(BananPołożenie położenieBanana, int randomDirection){
                    if(położenieBanana.y < 0){
                        położenieBanana.y = getHeight() / 2;
                        położenieBanana.previouslyRandomDirection = randomDirection;
                        return położenieBanana;
                    }else{
                        położenieBanana.previouslyRandomDirection = randomDirection;
                        return położenieBanana;
                    }
                }
            };
            FabrykaAktorów fMisiów = new FabrykaAktorów(){                
                @Override
                public AktorZPołożeniem zróbAktoraZPołożeniem(){
                    dajNowePołożenieMisia(położenieMisia);
                    AktorZPołożeniem aktor = 
                    new AktorZPołożeniem(new Miś(), położenieMisia.x, położenieMisia.y); 
                    return aktor;                    
                } 
                  
                private MiśPołożenie dajNowePołożenieMisia(MiśPołożenie położenieMisia){
                    int randomQuarter = wylosujLiczbę(doIlu, położenieMisia.previousQuarter);                     
                    if(randomQuarter == 0){
                        położenieMisia.x = Greenfoot.getRandomNumber(getWidth() / 2);
                        położenieMisia.y = Greenfoot.getRandomNumber(getHeight() /  2);
                        położenieMisia.previousQuarter = randomQuarter;
                        return położenieMisia;
                    }
                    if(randomQuarter == 1){
                        położenieMisia.x = Greenfoot.getRandomNumber((getWidth() / 2) + getWidth() / 2);
                        położenieMisia.y = Greenfoot.getRandomNumber(getHeight() /  2);  
                        położenieMisia.previousQuarter = randomQuarter;
                        return położenieMisia;
                    }
                    if(randomQuarter == 2){
                        położenieMisia.x = Greenfoot.getRandomNumber(getWidth() / 2);
                        położenieMisia.y = Greenfoot.getRandomNumber((getHeight() /  2) + getHeight() /  2);
                        położenieMisia.previousQuarter = randomQuarter;
                        return położenieMisia;
                    }else{
                        położenieMisia.x = Greenfoot.getRandomNumber((getWidth() / 2) + getWidth() / 2);
                        położenieMisia.y = Greenfoot.getRandomNumber((getHeight() /  2) + getHeight() /  2);
                        położenieMisia.previousQuarter = randomQuarter;
                        return położenieMisia;
                    }
                }
            };                
            FabrykaAktorów ft = new FabrykaAktorów(){
                @Override
                public AktorZPołożeniem zróbAktoraZPołożeniem(){
                    AktorZPołożeniem aktor = 
                    new AktorZPołożeniem(new Telefon(), położenieTel.x, położenieTel.y);
                    dajNowyxPhone(położenieTel);
                    return aktor;                    
                } 
                
                private TelefonPołożenie dajNowyxPhone(TelefonPołożenie położenieTel){
                    if(położenieTel.x < (getWidth() - 15)){
                        położenieTel.x += 15;
                        return położenieTel;
                    }else{
                        położenieTel.x = 1;
                        return położenieTel;
                    }
                }
            }; 
            FabrykaAktorów fc = new FabrykaAktorów(){
                @Override
                public AktorZPołożeniem zróbAktoraZPołożeniem(){
                    dajPołożenieCytryna(położenieCytryny);
                    AktorZPołożeniem aktor = 
                    new AktorZPołożeniem(new Cytryna(położenieCytryny.kierunek), położenieCytryny.x, położenieCytryny.y);
                    return aktor;                    
                }     
                
                private CytrynaPołożenie dajPołożenieCytryna(CytrynaPołożenie położenieCytryny){
                    if(położenieCytryny.krawędź == 4){
                        położenieCytryny.x = 17; 
                        położenieCytryny.y = Greenfoot.getRandomNumber(getHeight()); 
                        położenieCytryny.kierunek = Kierunek.PRAWO;
                        położenieCytryny.krawędź++; 
                        return położenieCytryny;
                    }
                    if(położenieCytryny.krawędź == 3){
                        położenieCytryny.x = Greenfoot.getRandomNumber(getWidth() - 10);
                        położenieCytryny.y = 387;  
                        położenieCytryny.kierunek = Kierunek.GÓRA;
                        położenieCytryny.krawędź++; 
                        return położenieCytryny;
                    }
                    if(położenieCytryny.krawędź == 2){
                        położenieCytryny.x = 587;
                        położenieCytryny.y = Greenfoot.getRandomNumber(getHeight());   
                        położenieCytryny.kierunek = Kierunek.LEWO;
                        położenieCytryny.krawędź++; 
                        return położenieCytryny;
                    }
                    if(położenieCytryny.krawędź == 1){
                        położenieCytryny.x = Greenfoot.getRandomNumber(getWidth());
                        położenieCytryny.y = 12;
                        położenieCytryny.kierunek = Kierunek.DÓŁ;
                        położenieCytryny.krawędź++; 
                        return położenieCytryny;
                    }else{
                        położenieCytryny.krawędź = 1;                     
                        return położenieCytryny;
                    } 
                }
            };
            kreator.zlećOkresoweTworzenieAktora(fbn, 73, 6);
            kreator.zlećOkresoweTworzenieAktora(fMisiów, 82, 12);
            kreator.zlećOkresoweTworzenieAktora(ft, 0, 4); 
            kreator.zlećOkresoweTworzenieAktora(fc, 0, 10); 
    }
    
    private static int wylosujLiczbę(int doIlu, int oprócz){
        int wylosowana = Greenfoot.getRandomNumber(doIlu);
        if(wylosowana == oprócz){
             while(wylosowana == oprócz){
                   wylosowana = Greenfoot.getRandomNumber(doIlu);                
             }           
        }    
        return wylosowana;
    }
    
    
    
    
    
    
    
}

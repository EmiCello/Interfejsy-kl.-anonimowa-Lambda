import greenfoot.*;  


public abstract class AktorKtóryZnikaPoPewnymCzasie extends AktorKtóryKiedyśZnikaZwłaszczaKiedyGoKliknąć
{
    int ileJużŻyje = 0;
    abstract int dajCzasŻycia();  
    boolean czyMaZniknąć(){
        ileJużŻyje++;
        return dajCzasŻycia() == ileJużŻyje;
    }    
}

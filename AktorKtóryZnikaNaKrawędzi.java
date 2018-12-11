import greenfoot.*;  


public abstract class AktorKtóryZnikaNaKrawędzi extends AktorKtóryKiedyśZnikaZwłaszczaKiedyGoKliknąć
{
    boolean czyMaZniknąć(){
        return isAtEdge();
    }
}

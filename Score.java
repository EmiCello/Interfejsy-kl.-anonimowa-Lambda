import greenfoot.*;  


public class Score extends Actor
{
   int score = 0;
   public Score(){
         result(score);
   }
   public void add(int amount){
        score = score + amount; 
        result(score);
   } 
   public void subtract(int amount){
        score = score - amount; 
        result(score);
   }
   public void result(int score){
       GreenfootImage scoreBackground = new GreenfootImage(130, 30);
       scoreBackground.setFont(new Font("", true, false, 16));
       scoreBackground.drawString("SCORE: " + score , 12, 21);
       setImage(scoreBackground);
   }
}

import greenfoot.*; 

public class Score extends Actor
{
    public Score(String text)
    {
        GreenfootImage img = new GreenfootImage(text.length()*20, 20);
        img.drawString(text, 2, 20);
        setImage(img);
    }
}
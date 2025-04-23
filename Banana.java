import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int increase = 3;
    public int count = 0; 
    public void act()
    {
        // Add your action code here.
        
        move(-increase);
        if(getX() <= 0) 
        {
        resetBanana();
        }
        
        if(isTouching(Hero.class)) 
        {
            GameOver over = new GameOver();
            getWorld().addObject(over, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBanana() 
    {
        int num = Greenfoot.getRandomNumber(2); 
        if (num == 0) 
        {
            setLocation(600, 100);
            count++;
        }
        else 
        {
            setLocation(600, 300);
            count++;
        }
        if (count == 5) 
        {
            count = 0;
            increase+= Greenfoot.getRandomNumber(3);
        }
    }
}

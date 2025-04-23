import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Score score = new Score("Score: ");
        addObject(score, 100, 20);
        
        GreenfootImage myImage = new GreenfootImage("road.png");
        setBackground(myImage);
    }
}

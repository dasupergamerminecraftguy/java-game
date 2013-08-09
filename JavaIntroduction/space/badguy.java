import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badguy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badguy extends Actor
{
    /**
     * Act - do whatever the badguy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (canSee(Rocket.class))
        fireGoldenBall();
    } 

    
    
    public boolean canSee(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void fireGoldenball() {
        
    }
}

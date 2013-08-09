import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badguyfighterplanes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badguyfighterplanes extends Actor
{
    /**
     * Act - do whatever the badguyfighterplanes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     checkKeys();
    }    
    
    public void checkKeys()
    {
        move(Greenfoot.getRandomNumber(12)) ;  
        turn(Greenfoot.getRandomNumber(12) -5);
        if (atWorldEdge)
        turn(4);

    }
    
    public void fire()
    {
       
    }
    
    public void destroy()
    {
        
    }
    
    public void atWorldEdge()
    {
        
    }
}


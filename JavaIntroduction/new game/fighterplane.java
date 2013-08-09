import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fighterplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fighterplane extends Actor
{
    /**
     * Act - do whatever the fighterplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkKeys();
    } 
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("up"))
        move(3);
        
        if (Greenfoot.isKeyDown("right"))
        turn(3);
        
        if (Greenfoot.isKeyDown("left"))
        
        turn(-3);
        
        if(Greenfoot.isKeyDown("space"))
        fireShells();
    }
    
    public void fireBomb()
    {
        
    }
    
    public void fireShells()
    {
      projectile proj = new projectile();
        getWorld().addObject(proj, getX(), getY());
        proj.setRotation(getRotation() );
        proj.move(25);  
    }
    
    public void destroy()
    {
        
    }
}

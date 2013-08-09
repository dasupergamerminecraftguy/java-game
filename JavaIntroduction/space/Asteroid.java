import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Asteroid is a moving target in the world that you have to shoot with projectiles
 * from your rocket, and avoid getting hit by.
 * 
 * @author (your name) 
 * @version 1.0
 */
public class Asteroid extends Actor
{
    int speed = Greenfoot.getRandomNumber(6) + 2;
    /**
     * An Asteroid can move around in as simple or as complex a way as you want.
     */
    public void act() 
    {
        move(speed);
        if (atWorldEdge() )
        {
            destroy();
        }
    }

    /**
     * This method takes the image of the Asteroid object, and shrinks it by scaling
     * it down by a certain amount. If the Asteroid is too small to shrink any further, 
     * it should call the destroy() method.
     */
    public void shrink()
    {
        GreenfootImage image = getImage();
        int newWidth = image.getWidth() - 10;
        int newHeight = image.getHeight() - 10;
        if (newWidth > 0 && newHeight > 0) 
        {
            getImage().scale(newWidth, newHeight); 
        }
        else
        {
            destroy();    
        }
    }

    /**
     * Checks if this projectile is at the edge of our world.
     */
    public boolean atWorldEdge()
    {

        if (getY() == 0)
        {
            return true;
        }
        if (getX() == 0 )
        {
            return true;
        }
        if (getY() == 599)
        {
            return true;    
        }
        if (getX() == 599)
        {
            return true;    
        }
        return false;
    }

    /**
     * Destroys this asteroid by removing it from the world.
     */

    public void destroy()
    {
        World space = getWorld();
        space.removeObject(this);
    }
}
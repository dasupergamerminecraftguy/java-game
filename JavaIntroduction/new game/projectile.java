import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectile extends Actor
{
    /**
     * Act - do whatever the projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(9);
        if(atWorldEdge() )
		{
		  Destroy();
		  }
		  else { 
		      checkForBadGuy();
		  }
    }  
    
      public boolean atWorldEdge()
    {
        
        if (getY() < 3)
        {
        return true;
    }
        if (getX() < 5 )
        {
        return true;
    }
    if (getY() > 595)
    {
    return true;    
    }
    if (getX() > 595)
    {
    return true;    
    }
    return false;
}

public void checkForBadGuy()
{
  badguyfighterplanes a = (badguyfighterplanes) getOneObjectAtOffset(10, 10, badguyfighterplanes.class);
        if ( a != null )
        {
          Destroy();

            
        }
}

public void Destroy()
{
    
}

public void shrink()
{
    
}
}


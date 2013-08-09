import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goldenBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goldenBall extends Actor
{
    /**
     * Act - do whatever the goldenBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
    }    
    
    public void checkForRocket()
    {
      goldenBall a = (goldenBall) getOneObjectAtOffset(10, 10, goldenBall.class);
        if ( a != null )
        {
            destroy;
           

        }
    } 
        public void checkLocation()
        {
         move(9);
		if (atWorldEdge() )
		{
		  destroy();
		  }
		  else { 
		      checkForRocket();
		  }
        }
        
        
    }


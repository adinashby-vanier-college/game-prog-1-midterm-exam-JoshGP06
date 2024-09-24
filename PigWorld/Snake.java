// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        Eat();
        if (isGameLost()) {
            transitionToGameLostWorld();
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * The random movements of the Snake
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(20) == 2) {
            turn(Greenfoot.getRandomNumber(100) - 55);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * What happens when the snake comes in contact with the pig (losing condition)
     */
    public void Eat()
    {
        Actor Pig = getOneIntersectingObject(Pig.class);
        if (Pig != null) {
            World world = getWorld();
            world.removeObject(Pig);
        }
        
    }

    /**
     * How the game detects the losing condition
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * What to do when the losing condition is met (go to lose screen
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}

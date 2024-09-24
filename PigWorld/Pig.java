// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        Eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("win.wav");
        }
        
    }

    /**
     * The pig's movement options, WASD is used,
     * Move forward with W
     * Move backwards with S
     * Turn left using A
     * Turn right using D
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * What happens when the pig comes in contact with the burger, (it eats it)
     */
    public void Eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
        
    }

    /**
     * How the game detects the winning condition
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * What to do when the winning condition is met (go to win screen)
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}

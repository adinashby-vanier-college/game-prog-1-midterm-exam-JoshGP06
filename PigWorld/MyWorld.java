// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 487, 267);
        Burger burger2 =  new Burger();
        addObject(burger2, 464, 116);
        Burger burger3 =  new Burger();
        addObject(burger3, 77, 49);
        Burger burger4 =  new Burger();
        addObject(burger4, 215, 185);
        Burger burger5 =  new Burger();
        addObject(burger5, 442, 61);
        Burger burger6 =  new Burger();
        addObject(burger6, 265, 35);
        Snake snake =  new Snake();
        addObject(snake, 502, 347);
        Snake snake2 =  new Snake();
        addObject(snake2, 529, 48);
        removeObject(snake2);
        Burger burger7 =  new Burger();
        addObject(burger7, 317, 134);
        Burger burger8 =  new Burger();
        addObject(burger8, 59, 181);
        Pig pig =  new Pig();
        addObject(pig, 84, 248);
        Burger burger9 =  new Burger();
        addObject(burger9, 268, 363);
        Burger burger10 =  new Burger();
        addObject(burger10, 362, 168);
        Burger burger11 =  new Burger();
        addObject(burger11, 395, 279);
        Burger burger12 =  new Burger();
        addObject(burger12, 521, 201);
        Burger burger13 =  new Burger();
        addObject(burger13, 142, 112);
        pig.setLocation(299, 210);
        burger4.setLocation(88, 291);
        burger7.setLocation(153, 349);
        burger10.setLocation(198, 262);
        pig.setLocation(287, 172);
    }
}

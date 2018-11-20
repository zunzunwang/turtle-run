package com.turtle.run;

import junit.framework.TestCase;
import org.junit.Assert;

public class TurtleRunApplicationTest extends TestCase {

    public void testPositionTurtle()
    {
        TurtleRunApplication turtleRunApplication = new TurtleRunApplication();
        boolean result = turtleRunApplication.setTurtle(1, 2);
        Assert.assertEquals(true, result);
    }

}

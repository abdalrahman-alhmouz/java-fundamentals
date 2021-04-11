/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testReturant(){
        Restaurant resOne=new Restaurant("steakpotato",4,3);
        Restaurant resTow=new Restaurant("KFC ",5,2);
        System.out.println(resOne.getName());
        assertEquals("steakpotato number of stars 4 price category 3",resOne.toString());
        assertEquals("KFC  number of stars 5 price category 2",resTow.toString());
    }
    @Test public void testRivew(){
        Review resOne=new Review("steak","the food was so good","Abdalrahman alhmouz",5);
        Review resTow=new Review("KFC","i do like it  ","rama yaser",4);
        assertEquals("the resturant is :steakname : Abdalrahman alhmouzreview : the food was so good number of stars 5",resOne.toString());
        assertEquals("the resturant is :KFCname : rama yaserreview : i do like it   number of stars 4",resTow.toString());
    }
    @Test public void testAddRivew(){
        Restaurant resOne=new Restaurant("steakpotato",4,3);
        Review resTow=new Review("staeckPotato","i do like it  ","rama yaser",5);
        resOne.addReview(resTow);

        assertEquals("steakpotato number of stars 5 price category 3",resOne.toString());
        assertEquals("the resturant is :steakpotatoname : rama yaserreview : i do like it   number of stars 5",resTow.toString());
    }
}
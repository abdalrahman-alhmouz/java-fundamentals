<<<<<<< HEAD
///*
// * This Java source file was generated by the Gradle 'init' task.
// */
//package inheritance;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class LibraryTest {
//    @Test public void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
//    }
//    @Test public void testReturant(){
//        Restaurant resOne=new Restaurant("steakpotato",4,3);
//        Restaurant resTow=new Restaurant("KFC ",5,2);
//        System.out.println(resOne.getName());
//        assertEquals("steakpotato number of stars 4 price category 3",resOne.toString());
//        assertEquals("KFC  number of stars 5 price category 2",resTow.toString());
//    }
//    @Test public void testRivew(){
//        Review resOne=new Review("steak","the food was so good","Abdalrahman alhmouz",5);
//        Review resTow=new Review("KFC","i do like it  ","rama yaser",4);
//        assertEquals("the resturant is :steakname : Abdalrahman alhmouzreview : the food was so good number of stars 5",resOne.toString());
//        assertEquals("the resturant is :KFCname : rama yaserreview : i do like it   number of stars 4",resTow.toString());
//    }
//    @Test public void testAddRivew(){
//        Restaurant resOne=new Restaurant("steakpotato",4,3);
//        Review resTow=new Review("staeckPotato","i do like it  ","rama yaser",5);
//        resOne.addReview(resTow);
//
//        assertEquals("steakpotato number of stars 5 price category 3",resOne.toString());
//        assertEquals("the resturant is :steakpotatoname : rama yaserreview : i do like it   number of stars 5",resTow.toString());
//    }
//}
=======
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
        Review resOne=new Review("the food was so good","Abdalrahman alhmouz",5);
        Review resTow=new Review("i do like it  ","rama yaser",4);
        assertEquals("Abdalrahman alhmouzreview : the food was so good number of stars 5",resOne.toString());
        assertEquals("rama yaserreview : i do like it   number of stars 4",resTow.toString());
    }
    @Test public void testAddRivew(){
        Restaurant resOne=new Restaurant("steakpotato",4,3);
        Review resTow=new Review("i do like it  ","rama yaser",5);
        resOne.addReview(resTow);

        assertEquals("steakpotato number of stars 5 price category 3",resOne.toString());
        assertEquals("rama yaserreview : i do like it   number of stars 5",resTow.toString());
    }
    @Test public void shopTest(){
        Theater theater=new Theater("hobe");
        Review resTow=new Review("i do like it  ","rama yaser",4);

        Shop shop=new Shop("hopeShop","its a greate shop have evry thing",5);
        shop.addReview(resTow);
        assertEquals("shop Name: hopeShop', description: its a greate shop have evry thing', dolarSign Number :5the review is :[i do like it  ]", shop.toString());
    }
    @Test public void testAddRivewShop(){
        Shop shop=new Shop("hopeShop","its a greate shop have evry thing",5);
        Review resTow=new Review("i do like it  ","rama yaser",4);
        Review resOne=new Review("great shop ","rama yaser",3);
        shop.addReview(resOne);
        shop.addReview(resTow);

        assertEquals("shop Name: hopeShop', description: its a greate shop have evry thing', dolarSign Number :5the review is :[great shop , i do like it  ]",shop.toString());
//        assertEquals("the resturant is :steakpotatoname : rama yaserreview : i do like it   number of stars 5",resTow.toString());
    }
    @Test public void theaterTest(){
        Theater theater=new Theater("onepice");
        assertEquals("the movieName: onepice'the array body is :[][]", theater.toString());
    }
    @Test public void theaterAddMoviesTest(){
        Theater theater=new Theater("onepice");
                theater.addMovie("this Night");
        assertEquals("the movieName: onepice'the array body is :[][]", theater.toString());
    }
    @Test public void theaterRemoveMoviesTest(){
        Theater theater=new Theater("onepice");
        theater.addMovie("this Night");
        theater.addMovie("the MOOn");
        theater.addMovie("One Hour");
        theater.addMovie("One Hour");

        theater.removeMovie("this Night");
        assertEquals("the movieName: onepice'the array body is :[][the MOOn, One Hour]", theater.toString());
    }
    @Test public void theaterReviewTest(){
        Theater theater=new Theater("onepice");
        Review resTo=new Review("i do like it  ","rama yaser",3);
        Review resOne=new Review("great shop ","rama yaser",3);

        theater.addReview(resTo);
        theater.addReview(resOne);

        assertEquals("the movieName: onepice'the array body is :[i do like it  , great shop ][]", theater.toString());
    }
}
>>>>>>> 5c12dae9936921edd8455ad0696e91d5a06a0ebc

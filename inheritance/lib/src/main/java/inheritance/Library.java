/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Review resTo=new Review("i do like it  ","rama yaser",3);
        Theater theater=new Theater("hobe");
        Review resTow=new Review("i do like it  ","rama yaser",4);

        Shop shop=new Shop("hopeShop","its a greate shop have evry thing",5);
        shop.addReview(resTow);
        System.out.println(shop);
//        theater.addReview(resTo);
//        theater.addMovie("hello");
//        System.out.println(theater);
    }


}
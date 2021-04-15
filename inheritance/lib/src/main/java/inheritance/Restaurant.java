package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name  ;
    int starNumber ;
   Review review ;
    int price ;
    ArrayList<Review> reviews=new ArrayList<>();
    public Restaurant(String name,int price){
        this.setName(name);
        this.setPrice(price);
    }

    public void addReview(Review review){
        ArrayList<Review> arrayList=new ArrayList<>();
<<<<<<< HEAD
        this.setStarNumber(review.getStarNum());
=======

//      if(review.getName()!=this.getName() && review!=this.review){
    this.setStarNumber(review.getStarNum());
//      }
//        review.setName(this.getName());
//        review.setPrice(this.getPrice());
>>>>>>> 5c12dae9936921edd8455ad0696e91d5a06a0ebc
        this.review=review;
        arrayList.add(review);
        System.out.println(review);
    }

    public Restaurant(String name){
        this.setName(name);
    }
@Override  public String toString(){//overriding the toString() method
        return name+" number of stars "+starNumber+" price category "+price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStarNumber() {
        return starNumber;
    }

    public void setStarNumber(int starNumber) {
        if(starNumber<=5 &&starNumber>=0)
            this.starNumber = starNumber;
    }
}

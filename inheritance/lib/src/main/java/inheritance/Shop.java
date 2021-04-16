package inheritance;

import java.util.ArrayList;

public class Shop {
    String shopName ,description ;
    int dolarSignNum ;
    Review review ;
    ArrayList<Review> reviews=new ArrayList<>();
    ArrayList<String> reviewBody=new ArrayList<>();

    public Shop(String name, String description, int dolarSignNum){
        this.setShopName(name);
        this.setDescription(description);
        this.setDolarSignNum(dolarSignNum);
    }
    public Shop(){

    }

    public void addReview(Review review){
        this.review=review;
        reviews.add(review);
        reviewBody.add(review.body);
    }

    @Override
    public String toString() {
        return "shop Name: " + shopName + '\'' +
                ", description: " + description + '\'' +
                ", dolarSign Number :" + dolarSignNum +"the review is :"+reviewBody;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDolarSignNum() {
        return dolarSignNum;
    }

    public void setDolarSignNum(int dolarSignNum) {
        this.dolarSignNum = dolarSignNum;
    }

    public void setShopName(String name) {
        this.shopName = name;
    }
    public String getShopName() {
        return shopName ;
    }

}
package inheritance;

public class Review extends Restaurant{
 String body ,auther ;
 int starNum ;
    public Review(String name,String body , String auther , int starNum){
        super(name);
        this.setBody(body);
        this.setAuther(auther);
        this.setStarNum(starNum);

    }
    public Review(String name,int starNumber,int price,String body , String auther , int starNum){
        super(name,starNumber,price);
        this.setBody(body);
        this.setAuther(auther);
        this.setStarNum(starNum);



    }


    public String toString(){
        return "the resturant is :"+ name+"name : "+auther+ "review : "+body+" number of stars "+starNum;
    }
    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        if(starNum<=5 &&starNum>=0)
            this.starNum = starNum;
    }



    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

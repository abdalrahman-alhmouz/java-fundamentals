package inheritance;

public class Review {
 String body ,auther ;
 int starNum ;
    public Review(String body , String auther , int starNum){
        this.setBody(body);
        this.setAuther(auther);
        if(starNum<0){
            starNum=0;
            this.setStarNum(starNum);
        }else if (starNum>5){
            starNum=5;
            this.setStarNum(starNum);
        }else {
            this.setStarNum(starNum);
        }

    }


    @Override public String toString(){
        return auther+ "review : "+body+" number of stars "+starNum;
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

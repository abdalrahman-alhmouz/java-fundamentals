package inheritance;

public class ReviewTheater {
    String body ,auther ,movie ;
    int starNum ;
    public ReviewTheater(){

    }
    public ReviewTheater(String movie,String body , String auther , int starNum){
        this.setMovie(movie);
        this.setBody(body);
        this.setAuther(auther);
        this.setStarNum(starNum);

    }

    @Override
    public String toString() {
        return "ReviewTheater{" +
                "body='" + body + '\'' +
                ", auther='" + auther + '\'' +
                ", movie='" + movie + '\'' +
                ", starNum=" + starNum +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }
}
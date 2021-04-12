package inheritance;

import java.util.ArrayList;

public class Theater {
    ArrayList<String> movies=new ArrayList<>();
    ArrayList<Review> reviews=new ArrayList<>();
    ArrayList<String> reviewBody=new ArrayList<>();


    String theaterName ,movieName ;
    public Theater(String movieName){
        this.setMovieName(movieName);
    }

    public void addReview(Review review){
        reviews.add(review);
        reviewBody.add(review.body);
        System.out.println(review);

    }

    public void addMovie(String movieName){
        if(movies.contains(movieName)){

        }else{
            movies.add(movieName);
        }


    }
    public void removeMovie(String remMovie){
        movies.remove(remMovie)  ;
        System.out.println(movies);
    }

    @Override
    public String toString() {
        return "the movieName: " + movieName + '\''
                + "the array body is :" +reviewBody+movies;
    }



    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}

package Chapter5.questions;

public class Movie extends Cinema{
    public Movie(String movie){
        super(movie);

    }

    public static void main(String[] args) {
        System.out.println(new Movie("Another Trilogy").name);
    }
}

package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/*
* Often used to get unique object
* Concepts:
*       - avoid costly creation
*       - Avoid subclasses
*       - Typically doesn't use new keyword after first creating
*       - Usually utilize with interface
*       - Usually implemented with a Registry
*
* Example:
*   java.lang.Object#clone()
*
* Typically has clone and cloeable
* Although a copy, each instance unique
* Costly construction not handled by client
* Can still utilize parameters for construction
* shallow vs deep copy
*
* Sample below uses Object clone method which does shallow copying
* Deep copy needs more effort and coding to make proper copying process
* */
public class PrototypeMain {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.getRuntime());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getRuntime());

    }


}

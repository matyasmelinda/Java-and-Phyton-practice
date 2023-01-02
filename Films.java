import java.util.*;

public class Films {
    public static void main(String[] args) {
        //list films
        List<String> Films = new ArrayList<>();
        Films.add("Avatar");
        Films.add("Dumb and Dumber");
        Films.add("Titanic");
        Films.add("Pretty Woman");
        Films.add("The Grinch");
        Films.add("Man in black");

        // remove film "Titanic"
        Films.remove("Titanic");

        // add film " The Wolf of Wall Street"
        Films.add("The Wolf of Wall Street");

        // length of list films
        System.out.println(Films.size());

        // the index of "The Grinch" film
        System.out.println(Films.indexOf("The Grinch"));

        if (!Films.isEmpty()) {
            System.out.println("We don't go to cinema");
        }    else {
            System.out.println("We go to cinema");

        }

        // list the elements
        System.out.println(Films);

        // duration of films
        List<Integer> durationFilms = Arrays.asList(new Integer[]{180, 101, 90, 100, 96, 170});
        System.out.println(durationFilms);

        // category of films
        List<String> categoryFilms = new ArrayList<>();
        categoryFilms.add("fantasy");
        categoryFilms.add("comedy");
        categoryFilms.add("romantic");
        categoryFilms.add("animation");
        categoryFilms.add("scifi");
        categoryFilms.add("drama");

        System.out.println(categoryFilms);

        // films and duration
        Map<String,Integer> films = new HashMap<String,Integer>()
        {
            {
                put("Avatar", 180);
                put("Dumb and Dumber", 101);
                put("Pretty Woman", 90);
                put("The Grinch", 100);
                put("Man in black", 96);
                put("The Wolf of Wall Street", 170);


            }};
        System.out.println(films);

        // good or bad film
        boolean good_film = false;
        if (good_film = true);
        {

            System.out.println("We will not watch");
            System.out.println("We will watch");
        }

    }
}

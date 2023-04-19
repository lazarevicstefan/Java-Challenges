import java.util.Random;

public class Domaci01 {
    public static String generisiNasumicanSlogan(){
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.","I can’t live without this product."};
        String[] event = {"Now I feel good.", " I have succeeded with this product.",
                "Makes miracles I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself", "I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Mary", "Linda", "Susan", "Sarah", "Lisa", "Annie", "Emily"};
        String[] cities = {"London", "Rome", "New York", "Paris", "Berlin"};
        Random rand = new Random();
        String randomPhrase = phrases[rand.nextInt(phrases.length)];
        String randomEvent = event[rand.nextInt(event.length)];
        String randomAuthors = authors[rand.nextInt(authors.length)];
        String randomCities = cities[rand.nextInt(cities.length)];
        return  String.format("%s %s %s - %s",randomPhrase,randomEvent,randomAuthors,randomCities);
        }
    public static void main(String[] args) {
        System.out.println(generisiNasumicanSlogan());

    }
}
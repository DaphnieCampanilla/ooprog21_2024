public class MovieQuoteInfo {
    private String quote;
    private String movie;
    private String character;
    private int year;

    public MovieQuoteInfo(String quote, String movie, String character, int year) {
        this.quote = quote;
        this.movie = movie;
        this.character = character;
        this.year = year;
    }

    public void displayQuoteInfo() {
        System.out.println("My Favorite Movie Quote: \"" + quote + "\"");
        System.out.println("Movie From: " + movie);
        System.out.println("Character: " + character);
        System.out.println("Year of the Movie: " + year);
    }

    public static void main(String[] args) {
        MovieQuoteInfo favoriteQuote = new MovieQuoteInfo(
            "I'm not afraid of dying. I'm afraid of not trying.",
            "Five Feet Apart",
            "Stella Grant",
            2019
        );

        
        favoriteQuote.displayQuoteInfo();
    }
}

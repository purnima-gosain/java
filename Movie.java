 class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie");
        System.out.println("Title: " + title);
        System.out.println("Genre: "+ genre);
    }
}

 class MovieTestDrive{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title ="Spiderman";
        one.genre = "Sci-fi";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Spirited away";
        two.genre = "Animation";
        two.rating = 5;

        two.playIt();

        Movie three = new Movie();
        three.title = "Iron man";
        three.genre = "Action";
        three.rating = 3;


    }
}

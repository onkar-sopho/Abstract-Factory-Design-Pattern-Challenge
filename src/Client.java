public class Client {

    public static void main(String[] args) {

        System.out.println("*** Abstract Factory Design Pattern - Challenge exercise ***\n");

        // Creating a bollywood movie factory using the abstract movies factory
        AbstractMovieFactory bollywoodFactory = MovieProducer.getMovieFactory("BOLLYWOOD");

        // Instantiating action and comedy bollywood movies using the bollywood movie factory
        BollywoodMovie actionBollywoodMovie = bollywoodFactory.getBollywoodMovie("action");
        BollywoodMovie comedyBollywoodMovie = bollywoodFactory.getBollywoodMovie("comedy");

        // Printing out the Bollywood action and comedy movie names
        System.out.println(actionBollywoodMovie.getMovieName());
        System.out.println(comedyBollywoodMovie.getMovieName() + "\n");

        /*********************************************************************/

        // Creating a hollywood movie factory using the abstract movies factory
        AbstractMovieFactory hollywoodFactory = MovieProducer.getMovieFactory("HOLLYWOOD");

        // Instantiating action and comedy hollywood movies using the hollywood movie factory
        HollywoodMovie actionHollywoodMovie = hollywoodFactory.getHollywoodMovie("action");
        HollywoodMovie comedyHollywoodMovie = hollywoodFactory.getHollywoodMovie("comedy");

        // Printing out the Hollywood action and comedy movie names
        System.out.println(actionHollywoodMovie.getMovieName());
        System.out.println(comedyHollywoodMovie.getMovieName());
    }

}

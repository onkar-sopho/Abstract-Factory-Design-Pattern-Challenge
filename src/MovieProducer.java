public class MovieProducer {

    public static AbstractMovieFactory getMovieFactory(String movieType) {

        if(movieType.equalsIgnoreCase("hollywood"))
            return new HollywoodMovieFactory();
        else if(movieType.equalsIgnoreCase("bollywood"))
            return new BollywoodMovieFactory();
        return null;
    }

}

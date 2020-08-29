public abstract class AbstractMovieFactory {
    public abstract HollywoodMovie getHollywoodMovie(String genre);
    public abstract BollywoodMovie getBollywoodMovie(String genre);
}

class HollywoodMovieFactory extends AbstractMovieFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String genre) {
        if(genre.equalsIgnoreCase("action"))
            return new ActionHollywoodMovie();
        else if(genre.equalsIgnoreCase("comedy"))
            return new ComedyHollywoodMovie();
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String genre) {
        return null;
    }
}

class BollywoodMovieFactory extends AbstractMovieFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String genre) {
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String genre) {
        if(genre.equalsIgnoreCase("action"))
            return new ActionBollywoodMovie();
        else if(genre.equalsIgnoreCase("comedy"))
            return new ComedyBollywoodMovie();
        return null;
    }
}

public interface BollywoodMovie {
    String getMovieName();
}

class ActionBollywoodMovie implements BollywoodMovie {

    @Override
    public String getMovieName() {
        return "Baaghi 3 is a Bollywood Action Movie";
    }
}

class ComedyBollywoodMovie implements BollywoodMovie {

    @Override
    public String getMovieName() {
        return "Bala is a Bollywodd Comedy Movie";
    }
}

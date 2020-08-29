public interface HollywoodMovie {
    String getMovieName();
}

class ActionHollywoodMovie implements HollywoodMovie {

    @Override
    public String getMovieName() {
        return "Avengers End Game is a Hollywood Action Movie";
    }
}

class ComedyHollywoodMovie implements HollywoodMovie {

    @Override
    public String getMovieName() {
        return "Shazam is a Hollywood Comedy Movie";
    }
}

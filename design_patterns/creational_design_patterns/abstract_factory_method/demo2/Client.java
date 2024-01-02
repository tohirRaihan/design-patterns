package design_patterns.creational_design_patterns.abstract_factory_method.demo2;

class Client {
    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("Action");
        HollyWoodMovieInterface hAction = actionMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bAction = actionMovies.getBollyWoodMovie();

        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());

        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("Comedy");
        HollyWoodMovieInterface hComedy = comedyMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bComedy = comedyMovies.getBollyWoodMovie();

        System.out.println(hComedy.getMovieName());
        System.out.println(bComedy.getMovieName());
    }
}

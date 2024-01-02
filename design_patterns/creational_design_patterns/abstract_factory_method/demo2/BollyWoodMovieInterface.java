package design_patterns.creational_design_patterns.abstract_factory_method.demo2;

interface BollyWoodMovieInterface {
    String getMovieName();
}

class BollyWoodActionMovie implements BollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Bollywood Action Movie";
    }

}

class BollyWoodComedyMovie implements BollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Bollywood Comedy Movie";
    }

}

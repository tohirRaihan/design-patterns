package design_patterns.creational_design_patterns.abstract_factory_method.demo2;

public interface HollyWoodMovieInterface {
    String getMovieName();
}

class HollyWoodActionMovie implements HollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Hollywood Action Movie";
    }

}

class HollyWoodComedyMovie implements HollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Hollywood Comedy Movie";
    }

}
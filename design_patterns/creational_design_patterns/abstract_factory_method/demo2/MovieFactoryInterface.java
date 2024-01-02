package design_patterns.creational_design_patterns.abstract_factory_method.demo2;

interface MovieFactoryInterface {
    HollyWoodMovieInterface getHollyWoodMovie();
    BollyWoodMovieInterface getBollyWoodMovie();
}

class ActionMovieFactory implements MovieFactoryInterface {

    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
    
}

class ComedyMovieFactory implements MovieFactoryInterface {

    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
    
}

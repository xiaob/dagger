package union.com.myapplication.dependency;

import javax.inject.Inject;

public class Car {

    @Inject
    IEngin iEngin;

    @Inject
    Engine engine;

    public Car() {
        DaggerCarComponent.builder().build().inject(this);
    }

    public IEngin getiEngin() {
        return iEngin;
    }

    public Engine getEngine() {
        return engine;
    }

    public static void main(String ... args){
        //TODO:
        Car car = new Car();
        System.out.println(car.getEngine().getName());
       car.getiEngin().show();
    }
}

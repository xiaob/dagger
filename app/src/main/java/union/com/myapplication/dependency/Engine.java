package union.com.myapplication.dependency;

import javax.inject.Inject;

public class Engine {
    private String name;
    @Inject
    public Engine() {
    }

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

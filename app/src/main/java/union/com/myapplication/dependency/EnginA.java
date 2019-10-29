package union.com.myapplication.dependency;

import javax.inject.Inject;

public class EnginA implements IEngin {

    @Inject
    public EnginA() {

    }

    @Override
    public void show() {
        System.out.print("show");
    }
}

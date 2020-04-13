package union.com.myapplication.lesson5.commponent;

import dagger.Component;
import union.com.myapplication.lesson5.User;
import union.com.myapplication.lesson5.module.BuyModule;

@Component(modules = BuyModule.class)
public interface BuyThing {
    User buy();
}

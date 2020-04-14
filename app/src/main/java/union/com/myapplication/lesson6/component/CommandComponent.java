package union.com.myapplication.lesson6.component;

import javax.inject.Singleton;

import dagger.Component;
import union.com.myapplication.lesson6.client.User;
import union.com.myapplication.lesson6.module.CommandModule;



@Component(modules = CommandModule.class)
public interface CommandComponent {
    User getUser();
}

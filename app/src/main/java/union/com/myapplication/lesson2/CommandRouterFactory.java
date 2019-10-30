package union.com.myapplication.lesson2;
import javax.inject.Singleton;

import dagger.Component;
import union.com.myapplication.lesson2.module.CommandsModule;
import union.com.myapplication.lesson2.module.HelloWorldModule;
import union.com.myapplication.lesson2.module.LoginCommandModule;
import union.com.myapplication.lesson2.module.SystemOutModule;


@Component(modules = {CommandsModule.class, SystemOutModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}

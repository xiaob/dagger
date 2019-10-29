package union.com.myapplication.lesson2;
import dagger.Component;
import union.com.myapplication.lesson2.module.HelloWorldModule;
import union.com.myapplication.lesson2.module.SystemOutModule;

@Component(modules = {HelloWorldModule.class, SystemOutModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}

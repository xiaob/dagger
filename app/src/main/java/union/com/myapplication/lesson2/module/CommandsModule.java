package union.com.myapplication.lesson2.module;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import union.com.myapplication.lesson2.Command;
import union.com.myapplication.lesson2.HelloWorldCommand;
import union.com.myapplication.lesson2.LoginCommand;

@Module
public interface CommandsModule {

    @Binds
    @IntoMap
    @StringKey("hello")
    Command helloWorld(HelloWorldCommand command);

    @Binds
    @IntoMap
    @StringKey("login")
    Command login(LoginCommand command);

}

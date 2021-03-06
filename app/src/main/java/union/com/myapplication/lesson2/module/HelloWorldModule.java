package union.com.myapplication.lesson2.module;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import union.com.myapplication.lesson2.Command;
import union.com.myapplication.lesson2.HelloWorldCommand;

@Module
public abstract class HelloWorldModule {
    @Binds
    @IntoMap
    @StringKey("hello")
    abstract Command helloWorldCommand(HelloWorldCommand command);
}

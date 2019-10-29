package union.com.myapplication.lesson2.module;

import dagger.Binds;
import dagger.Module;
import union.com.myapplication.lesson2.Command;
import union.com.myapplication.lesson2.HelloWorldCommand;

@Module
public abstract class HelloWorldModule {
    @Binds
    abstract Command helloWorldCommand(HelloWorldCommand command);
}

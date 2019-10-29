package union.com.myapplication.dependency;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MarkCarModule {


    @Binds
    abstract IEngin bind(EnginA EnginA);


    @Provides
    static Engine providerEngine(){
        return new Engine("1232132");
    }


    @Provides
    static Test providerTest(){
        return new Test();
    }
}

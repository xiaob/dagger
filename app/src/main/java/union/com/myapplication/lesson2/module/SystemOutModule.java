package union.com.myapplication.lesson2.module;

import dagger.Module;
import dagger.Provides;
import union.com.myapplication.lesson2.Outputter;

@Module
public abstract class SystemOutModule {
    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }
}

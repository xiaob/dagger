package union.com.myapplication.lesson2.module;

import android.util.Log;

import java.util.logging.Logger;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.StringKey;
import union.com.myapplication.lesson2.Outputter;

@Module
public abstract class SystemOutModule {
    @Provides
    static Outputter textOutputter() {
        return output -> Log.i("grage",output);
    }
}

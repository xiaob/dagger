package union.com.myapplication.dependency;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = MarkCarModule.class)
public interface CarComponent {
    void inject(Car car);

     Test test();
}

package union.com.myapplication.lesson2.module;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import union.com.myapplication.lesson2.Command;
import union.com.myapplication.lesson2.LoginCommand;
import union.com.myapplication.lesson2.SingleArgCommand;

@Module
public abstract class LoginCommandModule {
    @Binds
    @IntoMap
    @StringKey("login")
    abstract Command createCommand(LoginCommand loginCommand);
}

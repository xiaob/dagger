package union.com.myapplication.lesson6.module;

import android.util.Log;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import union.com.myapplication.lesson6.service.ICommand;
import union.com.myapplication.lesson6.service.LoginCommand;


@Module
public  abstract  class CommandModule {

    @Binds
    abstract ICommand getCommand(LoginCommand loginCommand);
}

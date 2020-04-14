package union.com.myapplication.lesson6.service;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;



public class LoginCommand implements ICommand {

    @Inject
    public LoginCommand() {
    }


    @Override
    public void setName(String name) {
        Log.i("grage",name);
    }
}

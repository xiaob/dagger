package union.com.myapplication.lesson6.client;

import javax.inject.Inject;
import javax.inject.Singleton;

import union.com.myapplication.lesson6.service.ICommand;


@Singleton
public class User {

    ICommand iCommand;

    @Inject
    public User(ICommand command) {
        this.iCommand = command;
    }


    public void executeor(String name){
        iCommand.setName(name);
    }

    public ICommand getiCommand() {
        return iCommand;
    }
}

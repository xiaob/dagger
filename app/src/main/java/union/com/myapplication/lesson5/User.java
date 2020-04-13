package union.com.myapplication.lesson5;

import java.util.Map;

import javax.inject.Inject;

import union.com.myapplication.lesson5.service.IBuy;

public class User {

    Map<String, IBuy> buyMap;

    @Inject
    public User(Map<String, IBuy> buyMap) {
        this.buyMap = buyMap;
    }

    public Map<String, IBuy> getBuyMap() {
        return buyMap;
    }
}

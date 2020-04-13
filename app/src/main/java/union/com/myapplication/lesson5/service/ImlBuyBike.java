package union.com.myapplication.lesson5.service;

import android.util.Log;

import javax.inject.Inject;

public class ImlBuyBike implements IBuy {

    @Inject
    public ImlBuyBike() {
    }

    @Override
    public void buy() {
        Log.i("grage","购买了一辆自行车");
    }
}

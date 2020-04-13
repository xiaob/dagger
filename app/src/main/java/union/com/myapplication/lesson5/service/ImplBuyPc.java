package union.com.myapplication.lesson5.service;

import android.util.Log;

import javax.inject.Inject;

public class ImplBuyPc implements IBuy {
    @Inject
    public ImplBuyPc() {
    }

    @Override
    public void buy() {
        Log.i("grage","购买了一台电脑");
    }
}

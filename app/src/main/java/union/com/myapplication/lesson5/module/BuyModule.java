package union.com.myapplication.lesson5.module;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import union.com.myapplication.lesson5.service.IBuy;
import union.com.myapplication.lesson5.service.ImlBuyBike;
import union.com.myapplication.lesson5.service.ImplBuyPc;

@Module
public abstract class BuyModule {

    @Binds
    @IntoMap
    @StringKey(value = "bike")
    abstract IBuy buyBike(ImlBuyBike buyBike);

    @Binds
    @IntoMap
    @StringKey("pc")
    abstract IBuy buyPc(ImplBuyPc buPc);
}

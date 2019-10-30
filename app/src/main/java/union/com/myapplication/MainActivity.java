package union.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import union.com.myapplication.lesson2.CommandRouter;
import union.com.myapplication.lesson2.DaggerCommandRouterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommandRouter router = DaggerCommandRouterFactory.create().router();
        router.route("deposit colin 2");
        router.route("login colin");

    }
}

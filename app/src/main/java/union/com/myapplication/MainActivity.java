package union.com.myapplication;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Map;

import javax.inject.Singleton;

import union.com.myapplication.lesson5.service.IBuy;
import union.com.myapplication.lesson5.commponent.DaggerBuyThing;
import union.com.myapplication.lesson6.client.User;
import union.com.myapplication.lesson6.component.CommandComponent;
import union.com.myapplication.lesson6.component.DaggerCommandComponent;



public class MainActivity extends AppCompatActivity {

    WebView webView;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // lesson5 调用示例
//        User user = DaggerBuyThing.create().buy();
//        Map<String, IBuy> buyMap = user.getBuyMap();

        //lesson6 调用示例
        CommandComponent factort = DaggerCommandComponent.create();
        User user1 = factort.getUser();
        User user2 = factort.getUser();
        Log.i("grade","user1 = "+user1);
        Log.i("grade","user2 = "+user2);

    }

    @SuppressLint("JavascriptInterface")
    private void initView() {
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavaScriptinterface(), "android");
        webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl("file:///android_asset/test.html");

        
    }



    private class JavaScriptinterface {

        @JavascriptInterface
        public String MakingCall(String str){
//            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:13709201950"));
//            startActivity(intent);
            return str;
        }
    }

    private class MyWebViewClient extends WebViewClient {
    }
}

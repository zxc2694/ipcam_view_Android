package sample.ipcamview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myURL = "http://82.188.208.242/cgi-bin/mjpg/video.cgi";
        WebView myBrowser=(WebView)findViewById(R.id.mybrowser);

        WebSettings websettings = myBrowser.getSettings();
        websettings.setSupportZoom(true);
        websettings.setBuiltInZoomControls(true);
        websettings.setJavaScriptEnabled(true);

        myBrowser.setWebViewClient(new WebViewClient());

        myBrowser.loadUrl(myURL);
    }
}

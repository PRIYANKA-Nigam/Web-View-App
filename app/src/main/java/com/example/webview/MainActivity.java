package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static Button b;
private static EditText e;
private static WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openURL();
    }
    public void openURL(){
        b=(Button)findViewById(R.id.button);
        e=(EditText) findViewById(R.id.editTextTextPersonName);
        w=(WebView) findViewById(R.id.ww);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=e.getText().toString();
                w.getSettings().setLoadsImagesAutomatically(true);
                w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                w.setScrollBarStyle(v.SCROLLBARS_INSIDE_OVERLAY);
                w.loadUrl(url);
            }
        });
    }
}
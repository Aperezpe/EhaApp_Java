package com.example.abraham.ehaapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class book extends AppCompatActivity {

    private WebView ebook;
    String url = "http://192.168.254.122:8888/first/get_book.php";
    //String url ="https://www.google.com";
    //String pdf = "https://freekidsbooks.org/wp-content/uploads/2018/08/zandi-and-birdy-monster_en_20180508.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }
}

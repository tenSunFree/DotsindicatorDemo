package com.example.administrator.dotsindicatordemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main2);
    WormDotsIndicator wormDotsIndicator = findViewById(R.id.worm_dots_indicator);
    ViewPager viewPager = findViewById(R.id.view_pager);
    DotIndicatorPagerAdapter adapter = new DotIndicatorPagerAdapter();
    viewPager.setAdapter(adapter);
    viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    wormDotsIndicator.setViewPager(viewPager);
  }
}

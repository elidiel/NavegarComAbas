package com.levirchianca.navegarcomabas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.i("Banana",""+getSupportFragmentManager());

        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(getSupportFragmentManager());

        vp.setAdapter(pa);

        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);


        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);


        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        Log.i("pipoca",""+position);
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        break;

                    case 1:

                        Log.i("pipoca",""+position);
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_on);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        break;

                    case 2:
                        Log.i("pipoca",""+position);
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_on);
                        break;
                    default:
                            return;

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}

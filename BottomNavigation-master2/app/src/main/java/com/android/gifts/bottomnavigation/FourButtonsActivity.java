package com.android.gifts.bottomnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.android.gifts.bottomnavigation.fragments.About;
import com.android.gifts.bottomnavigation.fragments.events;
import com.android.gifts.bottomnavigation.fragments.information;
import com.android.gifts.bottomnavigation.fragments.others;
import com.android.gifts.bottomnavigation.fragments.scores;
import com.android.gifts.bottomnavigation.fragments.services;
import com.android.gifts.bottomnavigation.fragments.tornament;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.BottomBarFragment;
import com.roughike.bottombar.OnTabSelectedListener;

public class FourButtonsActivity extends AppCompatActivity {
    private BottomBar bottomBar;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_buttons);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomBar = BottomBar.attach(this, savedInstanceState);

//        bottomBar.useFixedMode();

        bottomBar.setFragmentItems(getSupportFragmentManager(), R.id.fragmentContainer,
                new BottomBarFragment(new About(), R.drawable.ic_update_white_24dp, "Menu"),
                new BottomBarFragment(new information(), R.drawable.ic_update_white_24dp, "Information"),
                new BottomBarFragment(new tornament(), R.drawable.ic_update_white_24dp, "Timetable"),
                new BottomBarFragment(new scores(), R.drawable.ic_update_white_24dp, "Scores")
                );

        // Setting colors for different tabs when there's more than three of them.
        bottomBar.mapColorForTab(0, "#FFFF8000");
        bottomBar.mapColorForTab(1, "#FFFF4000");
        bottomBar.mapColorForTab(2, "#FFFF8000");
        bottomBar.mapColorForTab(3, "#FFFF4000");


        bottomBar.setOnItemSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                switch (position) {
                    case 0:

                        // Item 1 Selected
                }
            }
        });

        // Make a Badge for the first tab, with red background color and a value of "4".
        BottomBarBadge unreadMessages = bottomBar.makeBadgeForTabAt(1, "#E91E63", 4);



        // Control the badge's visibility
        //unreadMessages.show();
        //unreadMessages.hide();

        // Change the displayed count for this badge.
        //unreadMessages.setCount(4);


        // Change the show / hide animation duration.
       // unreadMessages.setAnimationDuration(200);

        // If you want the badge be shown always after unselecting the tab that contains it.
        //unreadMessages.setAutoShowAfterUnSelection(true);
    }
}
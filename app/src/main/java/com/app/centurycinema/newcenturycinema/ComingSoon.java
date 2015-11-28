package com.app.centurycinema.newcenturycinema;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Arnold on 11/25/15.
 */
public class ComingSoon extends ActionBarActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coming_soon);

        imageButton = (ImageButton) findViewById(R.id.trailer_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtubeLink = new Intent(Intent.ACTION_VIEW);
                youtubeLink.setData(Uri.parse("https://www.youtube.com/watch?v=7GqClqvlObY"));
                startActivity(youtubeLink);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffa500")));

    }
}

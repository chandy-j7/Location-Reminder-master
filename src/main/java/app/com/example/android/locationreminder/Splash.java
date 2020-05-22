package app.com.example.android.locationreminder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
public class Splash extends AppCompatActivity {

	private final int SPLASH_DISPLAY_LENGTH = 1000;
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		getSupportActionBar().hide();
		setContentView(R.layout.activity_splash);


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
                /* Create an Intent that will start the Menu-Activity. */
				Intent mainIntent = new Intent(Splash.this, MainActivity.class);
				Splash.this.startActivity(mainIntent);
				Splash.this.finish();
			}
		}, 3000);

	}
}

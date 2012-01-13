package org.androidconnect.videoplayer;


import org.androidconnect.videoplayer.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class VideoPlayerActivity extends Activity {
	
	private static final String MEDIA = "media";
	private static final String URL = "url";

	private TextView txt;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		txt = (TextView) findViewById(id.url);
		txt.setText("http://daily3gp.com/vids/747.3gp");
        Log.d("VideoPlayerActivity	", "Created");
        
        Button btnvideo = (Button) findViewById(R.id.btnPlayer);
        btnvideo.setOnClickListener(new clickVideo() );
    }
	
	private class clickVideo implements OnClickListener{

		public void onClick(View v) {
			Intent intent = new Intent( v.getContext() , Player.class);
			intent.putExtra(MEDIA, 4);
			TextView txt = (TextView) findViewById(id.url);
			String url = (String) txt.getText().toString() ;
			intent.putExtra	(URL, url);
			startActivity(intent);
		}
		
	}
}
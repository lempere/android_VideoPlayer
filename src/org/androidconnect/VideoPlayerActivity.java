package org.androidconnect;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class VideoPlayerActivity extends Activity implements OnClickListener {
	
	private static final String MEDIA = "media";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("VideoPlayerActivity	", "Created");
        Button btnvideo = (Button) findViewById(R.id.btnPlayer);
        btnvideo.setOnClickListener(new clickVideo() );
    }

	public void onClick(View v) {

//		if( v.getId() == R.id.btnPlayer ){
            Toast.makeText(VideoPlayerActivity.this,
                    "Click ",
                    Toast.LENGTH_LONG).show();
            Log.d("VideoPlayerActivity	", "surfaceDestroyed called");

			Intent intent = new Intent(this, Player.class);
				startActivity(intent);
					
//		}
				if (v.getId() == R.id.btnInit)
	            {
		            Log.d("VideoPlayerActivity	", "surfaceDestroyed called");

	            }	
	}
	
	private class clickVideo implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent( v.getContext() , Player.class);
			intent.putExtra(MEDIA, 4);
			startActivity(intent);
		}
		
	}
}
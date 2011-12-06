package com.modeveast.hack;

import com.socialize.ui.SocializeUI;
import com.socialize.ui.actionbar.ActionBarListener;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FriendsWPlansActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		final String entityKey = "http://com.modeveast.hack";

		// Wrap your existing view with the action bar.
		// your_layout refers to the resource ID of your current layout.
		View actionBarWrapped = SocializeUI.getInstance().showActionBar(this, R.layout.main, entityKey);
		setContentView(actionBarWrapped);		 
		Button bt1 = (Button)findViewById(R.id.button1);
		bt1.setOnClickListener(mCorkyListener);
    }
    
    private OnClickListener mCorkyListener = new OnClickListener() {
        public void onClick(View v) {
          // do something when the button is clicked
        	EditText tv = (EditText)findViewById(R.id.editText1);
        	String eventName = tv.getEditableText().toString();
        	if (eventName == null || eventName == "")
        		return;

    		SocializeUI.getInstance().showCommentView(FriendsWPlansActivity.this, eventName);
    		}
    };
}
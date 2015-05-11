package skrapdeals.scrapcrow;

import com.shail.skrapdeals.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/*
 * A placeholder main activity for this Android App
 * After splash screen is displayed this main acitivity
 * will be shown.
 */
public class AppMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.app_main, menu);
		return true;
	}

}

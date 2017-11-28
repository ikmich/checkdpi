package lab.ikmich.checkdpi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgDpi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        imgDpi = (ImageView) findViewById(R.id.img_dpi);

		showDpiImage(this);
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.menu_main, menu);
//		return true;
//	}

	public void showDpiImage(Activity a) {
//		if (a == null) {
//			return;
//		}
//
//		final FrameLayout root = (FrameLayout) a.findViewById(android.R.id.content);
//		if (root == null) {
//			return;
//		}
//
//		final ImageView iv = new ImageView(a);
//		iv.setImageResource(R.drawable.check_dpi);
//
//		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
//                FrameLayout.LayoutParams.WRAP_CONTENT);
//		lp.gravity = Gravity.CENTER;
//
//		root.addView(iv, lp);

	}
}

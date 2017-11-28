package lab.ikmich.checkdpi;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    private final static String NL = "\n";
    private final static String BR = "<br/>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        setInfo();
    }

    void setupUI() {
        tvInfo = (TextView) findViewById(R.id.tv_info);
    }

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.menu_main, menu);
//		return true;
//	}

    void setInfo() {
        // Display info
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        float density = dm.density;
        int densityDpi = dm.densityDpi;
        int widthPixels = dm.widthPixels;
        int heightPixels = dm.heightPixels;
        float scaledDensity = dm.scaledDensity;
        float xdpi = dm.xdpi;
        float ydpi = dm.ydpi;

        StringBuilder sb = new StringBuilder();
        sb.append("<b>density</b>: ").append(density).append(BR);
        sb.append("<b>scaledDensity</b>: ").append(scaledDensity).append(BR);
        sb.append("<b>xdpi</b>: ").append(xdpi).append(BR);
        sb.append("<b>ydpi</b>: ").append(ydpi).append(BR);
        sb.append("<b>densityDpi</b>: ").append(densityDpi).append(BR);
        sb.append("<b>widthPixels</b>: ").append(widthPixels).append(BR);
        sb.append("<b>heightPixels</b>: ").append(heightPixels).append(BR);

        // Screen info
        Configuration configuration = getResources().getConfiguration();
        int screenWidthDp = configuration.screenWidthDp;
        int screenHeightDp = configuration.screenHeightDp;

        String screenType;

        switch (configuration.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) {
            case (Configuration.SCREENLAYOUT_SIZE_SMALL):
                screenType = "SMALL";
                break;
            case (Configuration.SCREENLAYOUT_SIZE_NORMAL):
                screenType = "NORMAL";
                break;
            case (Configuration.SCREENLAYOUT_SIZE_LARGE):
                screenType = "LARGE";
                break;
            case (Configuration.SCREENLAYOUT_SIZE_XLARGE):
                screenType = "XLARGE";
                break;
            default:
                screenType = "UNKNOWN";
                break;
        }

        sb.append("<b>screenWidthDp</b>: ").append(screenWidthDp).append(BR);
        sb.append("<b>screenHeightDp</b>: ").append(screenHeightDp).append(BR);
        sb.append("<b>screenType</b>: ").append(screenType).append(BR);

        tvInfo.setText(Html.fromHtml(sb.toString()));
    }

}


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;



public class Version extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version);

    }

    public void update (View view){
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                
                // Update app URL
                Uri.parse("https://play.google.com/store/apps/details?id=com.lavanda"));
        startActivity(browserIntent);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

}

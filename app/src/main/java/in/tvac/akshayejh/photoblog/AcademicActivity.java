package in.tvac.akshayejh.photoblog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AcademicActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button btn_cse;
    private Button btn_ce;
    private Button btn_me;
    private Button btn_ee;
    private Button btn_ec;
    private Button btn_ei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);
        mAuth = FirebaseAuth.getInstance();
        btn_cse= findViewById(R.id.btn_cse);
        btn_ce= findViewById(R.id.btn_ce);
        btn_me= findViewById(R.id.btn_me);
        btn_ee=findViewById(R.id.btn_ee);
        btn_ec=findViewById(R.id.btn_ec);
        btn_ei=findViewById(R.id.btn_ei);


        btn_cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1C9ixYizR9oE8eOMbySt_1dj7EcexdEYj"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1EKkiTc-S7baqcekmVRl6Ly8oZDGLnAV8"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1CZsiB6vIU-qula0Vd1lsJNcNLQITeHro"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1iWq8wASaJ-cEU7I-kZMpJ5fHM39yHYGV"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1eCf8lP9ngTJMSzmXG2A7YPsCGbNybzgB"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn_ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=148pAHAJhyrJcEe1zYBXMyIB71Vihg6km"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_logout_btn:
                logOut();
                return true;

            case R.id.action_settings_btn:

                Intent settingsIntent = new Intent(AcademicActivity.this, SetupActivity.class);
                startActivity(settingsIntent);

                return true;

            case R.id.action_reminder:

                Intent remindIntent = new Intent(AcademicActivity.this, Main2Activity.class);
                startActivity(remindIntent);

            default:
                return false;


        }

    }

    private void logOut() {


        mAuth.signOut();
        sendToLogin();
    }

    private void sendToLogin() {

        Intent loginIntent = new Intent(AcademicActivity.this, LoginActivity.class);
        startActivity(loginIntent);

    }
}
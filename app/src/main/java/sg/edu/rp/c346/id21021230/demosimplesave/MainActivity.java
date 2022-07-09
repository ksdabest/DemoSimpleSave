package sg.edu.rp.c346.id21021230.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // obtain the SharedPreferences instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        // create a SharedPreferences Editor by calling edit();
        SharedPreferences.Editor prefEdit = prefs.edit();
        //set a key-value pair in the editor
        prefEdit.putString("greetings", "Hello!");
        // call commit() to save changes made to SharedPreferences
        prefEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

//        String msg = "No greetings!";
//        Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
//        toast.show();
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        String msg = prefs.getString("greetings", "No greetings name");
        Toast.makeText( MainActivity.this, msg, Toast.LENGTH_LONG);
//        toast.show();


    }
}
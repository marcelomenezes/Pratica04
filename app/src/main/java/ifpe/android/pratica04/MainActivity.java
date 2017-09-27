package ifpe.android.pratica04;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonInsertClick(View view){

        String name = ((EditText) findViewById(R.id.edit_name)).getText().toString();
        String grade = ((EditText) findViewById(R.id.edit_grade)).getText().toString();
        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit(); editor.putString(name, grade);
        editor.apply();
        Toast.makeText(this, "Salvo: " + name, Toast.LENGTH_SHORT).show();

    }

}

package nyc.amy_rivera_devoloper.whatismyaddress;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText email;
    private Button button1;
    private Button button2;
    private static final String SHARED_PREFS_KEY = "address_shared_preferences";
    private SharedPreferences save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = (EditText) findViewById(R.id.editText);
        Button button1 = (Button) findViewById(R.id.Button01);
        Button button2 = (Button) findViewById(R.id.Button02);

        save = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, Integer.parseInt(editText.toString()));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}







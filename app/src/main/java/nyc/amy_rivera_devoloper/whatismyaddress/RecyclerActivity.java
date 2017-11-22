package nyc.amy_rivera_devoloper.whatismyaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecyclerActivity extends AppCompatActivity {

    private Button button2;
    private static final String SHARED_PREFS_KEY = "address_shared_preferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        Button button2 = (Button) findViewById(R.id.Button02);


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){


                    Intent explicitIntent = new Intent(this, RecyclerActivity.class);

                    explicitIntent.putExtra("sharedpref", SHARED_PREFS_KEY);
                    startActivity(explicitIntent);

                }


                });






        }
    }
}



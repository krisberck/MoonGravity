package bg.pcgear.moongravity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView moon;
    EditText earth;
    Double teglo, zemq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        earth = (EditText) findViewById(R.id.earth);
        final Button button = (Button)findViewById(R.id.button);
        moon=(TextView )findViewById(R.id.moon);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zemq = Double.parseDouble(earth.getText().toString());
                teglo = zemq/1.16;
                moon.setText(teglo.toString());
            }
        });
    }
}

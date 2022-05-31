package sg.edu.rp.c346.id21040411.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDBS, tvOCBC, tvUOB;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDBS = findViewById(R.id.tvDBS);
        tvOCBC = findViewById(R.id.tvOCBC);
        tvUOB = findViewById(R.id.tvUOB);

        registerForContextMenu(tvDBS);
        registerForContextMenu(tvOCBC);
        registerForContextMenu(tvUOB);

    }

    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
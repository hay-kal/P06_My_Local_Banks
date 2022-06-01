package sg.edu.rp.c346.id21040411.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v == tvDBS) {
            wordClicked = "dbs";
        } else if (v == tvOCBC) {
            wordClicked = "ocbc";
        } else if (v == tvUOB) {
            wordClicked = "uob";
        }

        getMenuInflater().inflate(R.menu.menu2, menu);

    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(wordClicked.equalsIgnoreCase("dbs")){
            if (id == R.id.website) {
                Intent intentCall = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.contact) {
                Intent intentCall = new Intent (Intent.ACTION_DIAL, Uri.parse("tel: +1800-111-1111"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }

        if(wordClicked.equalsIgnoreCase("ocbc")){
            if (id == R.id.website) {
                Intent intentCall = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.ocbc.com"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.contact) {
                Intent intentCall = new Intent (Intent.ACTION_DIAL, Uri.parse("tel: +1800-363-3333"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }

        if(wordClicked.equalsIgnoreCase("uob")){
            if (id == R.id.website) {
                Intent intentCall = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.uob.com.sg"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.contact) {
                Intent intentCall = new Intent (Intent.ACTION_DIAL, Uri.parse("tel: +1800-222-2121"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }


        return super.onContextItemSelected(item);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvDBS.setText(R.string.dbs);
            tvOCBC.setText(R.string.ocbc);
            tvUOB.setText(R.string.uob);
            return true;
        } else if (id == R.id.chineseSelection) {
            tvDBS.setText(R.string.dbs2);
            tvOCBC.setText(R.string.ocbc2);
            tvUOB.setText(R.string.uob2);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
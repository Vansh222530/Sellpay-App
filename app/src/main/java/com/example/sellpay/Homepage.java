package com.example.sellpay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

    }



    public void btnqrscan(View view) {
        Intent intent = new Intent(this, scannercam.class);
        startActivity(intent);
        Toast.makeText(this,"Scan", Toast.LENGTH_SHORT).show();
    }
    public void btnpc(View view) {
        Intent intent = new Intent(this, paycontacts.class);
        startActivity(intent);
        Toast.makeText(this,"Sync Contacts", Toast.LENGTH_SHORT).show();
    }
    public void btnpn(View view) {
        Intent intent = new Intent(this, paypn.class);
        startActivity(intent);
        Toast.makeText(this,"Enter Contact Number", Toast.LENGTH_SHORT).show();
    }
    public void btnbt(View view) {
        Intent intent = new Intent(this, btnbtr.class);
        startActivity(intent);
        Toast.makeText(this,"Bank Transfer", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_1:
                Intent intent = new Intent(this, profile.class);
                startActivity(intent);
                // Do something for item 1
                return true;
            case R.id.menu_item_2:
                Intent s = new Intent(this, stockwatch.class);
                startActivity(s);
                // Do something for item 2
                return true;
            case R.id.menu_item_3:
                Intent a = new Intent(this, About.class);
                startActivity(a);
                // Do something for item 3
                return true;
            case R.id.menu_item_4:
                Intent p = new Intent(this, privacy_security.class);
                startActivity(p);
                // Do something for item 3
                return true;
            case R.id.menu_item_5:
                Intent e = new Intent(this, settings.class);
                startActivity(e);
                // Do something for item 3
                return true;
            case R.id.menu_item_6:
                Intent h = new Intent(this, helpfeedback.class);
                startActivity(h);
                // Do something for item 3
                return true;
            case R.id.menu_item_7:
                // First, create an AlertDialog builder
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setMessage("Are you sure you want to log out?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent y = new Intent(Homepage.this, MainActivity.class);
                        startActivity(y);

                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cancel the dialog
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
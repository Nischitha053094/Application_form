package com.example.nischitha.application_form;


import android.app.Activity;
import android.location.Address;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Display extends Activity {

    TextView Cname;
    TextView CDOB;
    TextView Caddress;
    TextView Cgender;
    TextView cp,ce,cm,co;

    String name;
    String dob;
    String address;
    String dropDown;
    String p,e,m,o;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Cname=(TextView) findViewById(R.id.collect_name);
        CDOB=(TextView) findViewById(R.id.collect_DOB);
        Caddress=(TextView) findViewById(R.id.collect_Address);
        Cgender=(TextView) findViewById(R.id.collect_Gender);
        cp=(TextView) findViewById(R.id.cp);
        ce=(TextView)findViewById(R.id.ce);
        cm=(TextView) findViewById(R.id.cm);
        co=(TextView) findViewById(R.id.co);


        name = getIntent().getStringExtra("Name");
        Cname.setText(name);
        address=getIntent().getStringExtra("Address");
        dob=getIntent().getStringExtra("DOB");
        CDOB.setText(dob);
        Caddress.setText(address);
        dropDown=getIntent().getStringExtra("Gender");
        Cgender.setText(dropDown);
        p=getIntent().getStringExtra("Pharmasist");
        cp.setText(p);
        e=getIntent().getStringExtra("Equipments");
        ce.setText(e);
        m=getIntent().getStringExtra("Medicines");
        cm.setText(m);
        o=getIntent().getStringExtra("Others");
        co.setText(o);





    }
}
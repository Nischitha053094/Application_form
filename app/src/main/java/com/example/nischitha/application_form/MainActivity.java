package com.example.nischitha.application_form;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Name;
    EditText DOB;
   // RadioButton Female, Male;
    EditText Address;
    RadioGroup radioGroup;
    CheckBox Pharmasist, Equipments, Medicines, Others;
    Button Submit, Reset;
    Spinner spin;
    String date;

    //Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilizeViews();
        Submit.setOnClickListener(this);
        Reset.setOnClickListener(this);
        DOB.setOnClickListener(this);
        //showDatePickerDialog();
       // setOnClickListnerForDOB();
      //  inililizeListeners();

    }

    private void initilizeViews() {
        Name = (EditText) findViewById(R.id.etName);
        DOB=(EditText)findViewById(R.id.etDOB);
        Address = (EditText) findViewById(R.id.etAddress);
        Pharmasist = (CheckBox) findViewById(R.id.cbPharmasist);
        Equipments = (CheckBox) findViewById(R.id.cbEquiments);
        Medicines = (CheckBox) findViewById(R.id.cbMedicines);
        Others = (CheckBox) findViewById(R.id.cbOthers);
        Submit = (Button) findViewById(R.id.bSubmit);
        spin=(Spinner)findViewById(R.id.spinGender);
        Reset=(Button)findViewById(R.id.bReset);
    }

//    private void inililizeListeners() {
//        Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this, Display.class);
//                intent.putExtra("Name", Name.getText().toString());
//                intent.putExtra("Address", Address.getText().toString());
//
//
//
//                int selectedId = radioGroup.getCheckedRadioButtonId();
//
//                if (selectedId == Female.getId()) {
//                    intent.putExtra("SelectedId", Female.getText().toString());
//                } else if(selectedId == Male.getId()){
//                    intent.putExtra("SelectedId", Male.getText().toString());
//                } else {
//
//                }
//
//
//                if(Pharmasist.isChecked()){
//                    intent.putExtra("Pharmasist", Pharmasist.getText().toString());
//                }
//                if (Equipments.isChecked()){
//                    intent.putExtra("Equipments", Equipments.getText().toString());
//                }
//                if(Medicines.isChecked()) {
//                    intent.putExtra("Medicines", Medicines.getText().toString());
//                }
//                if(Others.isChecked()) {
//                    intent.putExtra("Others", Others.getText().toString());
//                }
//                startActivity(intent);
//
//
//            }
//        });
//
//    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.bSubmit:
                Intent intent = new Intent(MainActivity.this, Display.class);
                intent.putExtra("Name", Name.getText().toString());
                intent.putExtra("DOB", DOB.getText().toString());
                intent.putExtra("Address", Address.getText().toString());
                intent.putExtra("Gender", spin.getSelectedItem().toString());

                        if(Pharmasist.isChecked()) {
                            intent.putExtra("Pharmasist", Pharmasist.getText().toString());
                        }
                        if(Equipments.isChecked()) {
                            intent.putExtra("Equipments", Equipments.getText().toString());
                        }
                        if(Medicines.isChecked()) {
                            intent.putExtra("Medicines", Medicines.getText().toString());
                        }
                        if(Others.isChecked()) {
                            intent.putExtra("Others", Others.getText().toString());
                        }

                this.startActivity(intent);
                break;

            case R.id.bReset:
                Name.setText("");
                Address.setText("");
                DOB.setText("");
                spin.setPrompt("");

                if(Pharmasist.isChecked()) {
                    Pharmasist.setChecked(false);
                }

                if(Equipments.isChecked()) {
                    Equipments.setChecked(false);
                }

                if(Medicines.isChecked()) {
                    Medicines.setChecked(false);
                }

                if(Others.isChecked()) {
                    Others.setChecked(false);
                }
                break;

            default:
                break;



        }

switch(v.getId()){
    case R.id.etDOB:
        DialogFragment d=new DatePickerFragment();
        d.show(getFragmentManager(),"Date Picker");
        break;
    default:break;


        }

    }


//public void showDatePickerDialog(){
//
//    DialogFragment d=new DatePickerFragment();
//    d.show(getFragmentManager(),"Date Picker");
//
//    }

}

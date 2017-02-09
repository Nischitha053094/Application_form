package com.example.nischitha.application_form;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by nischitha on 9/2/17.
 */

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar c= Calendar.getInstance();
        int year =c.get(Calendar.YEAR);
        int month =c.get(Calendar.MONTH);
        int day =c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this,year,month,day);
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        TextView date=(TextView)getActivity().findViewById(R.id.etDOB);
        date.setText(view.getYear()+"/"+view.getMonth()+"/"+view.getDayOfMonth());
    }
}

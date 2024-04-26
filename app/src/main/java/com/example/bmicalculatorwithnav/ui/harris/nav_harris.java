package com.example.bmicalculatorwithnav.ui.harris;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bmicalculatorwithnav.R;

import java.text.DecimalFormat;


public class nav_harris extends Fragment {

    private String genderValue = "";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_harris, container, false);
        RadioButton femaleRadioButton = view.findViewById(R.id.Female);
        RadioButton maleRadioButton = view.findViewById(R.id.Male);
        TextView result = view.findViewById(R.id.result_bmr);
        // Set OnClickListener for each radio button
        femaleRadioButton.setOnClickListener(this::onRadioButtonClicked);
        maleRadioButton.setOnClickListener(this::onRadioButtonClicked);

        EditText weight = view.findViewById(R.id.weight_bmr);
        EditText height = view.findViewById(R.id.height_bmr);
        EditText age = view.findViewById(R.id.age_bmr);
        Button calculateBtn = view.findViewById(R.id.harris_button);
        calculateBtn.setOnClickListener(v -> {
            String weightText = weight.getText().toString();
            String heightText = height.getText().toString();
            String ageText = age.getText().toString();
            if (weightText.isEmpty() || heightText.isEmpty() || ageText.isEmpty() || genderValue.equals("")) {
                return;
            }
            float weightValue = Float.parseFloat(weightText);
            float heightValue = Float.parseFloat(heightText);
            float ageValue = Float.parseFloat(ageText);
            float bmr = calculateBMR(weightValue, heightValue, ageValue,genderValue);
            DecimalFormat df = new DecimalFormat("#");
            String resultText = df.format(bmr) + " kcal/day";
            result.setText(resultText);
        });
        return view;
    }

     float calculateBMR(float weightValue, float heightValue, float ageValue, String genderValue) {
        if (genderValue.equals("")) {
            return 0;
        }
        if (genderValue.equals("F")) {
            return 655.1f + (9.567f * weightValue) + (1.850f * heightValue) - (4.68f * ageValue);
        } else {
            return 66.47f + (13.75f * weightValue) + (5.003f * heightValue) - (6.75f * ageValue);
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String gender = "";

        if (view.getId() == R.id.Female) {
            if (checked) {
                gender = "F";
            }
        } else if (view.getId() == R.id.Male) {
            if (checked) {
                gender = "M";
            }
        }
        genderValue = gender;
    }
}






package com.example.bmicalculatorwithnav.ui.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bmicalculatorwithnav.R;

import java.util.Map;
import java.util.TreeMap;

public class bmi_calculator extends Fragment {
    Map<Float,String> bmiLabels = new TreeMap<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bmi_calculator, container, false);
        initializeBMILabels();
        EditText heightField = view.findViewById(R.id.height);
        EditText weightField = view.findViewById(R.id.weight);
        Button calculateBtn = view.findViewById(R.id.button);
        TextView result = view.findViewById(R.id.calculate_result);
        TextView label = view.findViewById(R.id.title);
        calculateBtn.setOnClickListener(v -> {
            String heightText = heightField.getText().toString();
            String weightText = weightField.getText().toString();

            if (heightText.isEmpty() || weightText.isEmpty()) {
                return;
            }

            float height = Float.parseFloat(heightText) / 100;
            float weight = Float.parseFloat(weightText);
            float bmi = calculateBMI(height, weight);
            label.setText(getBMILabel(bmi));
            result.setText(String.format("%.2f", bmi));
        });

        return view;
    }

    float calculateBMI (float height, float weight){
        return weight / (height * height);
    }
    private void initializeBMILabels() {
        bmiLabels.put(16.0f, "wygłodzenie");
        bmiLabels.put(16.99f, "wychudzenie");
        bmiLabels.put(18.49f, "niedowaga");
        bmiLabels.put(24.99f, "wartość prawidłowa");
        bmiLabels.put(29.99f, "nadwaga");
        bmiLabels.put(34.99f, "otyłość I stopnia");
        bmiLabels.put(39.99f, "otyłość II stopnia");
        bmiLabels.put(Float.MAX_VALUE, "otyłość III stopnia");
    }

    public String getBMILabel(double bmi) {
        for (Map.Entry<Float, String> entry : bmiLabels.entrySet()) {
            if (bmi <= entry.getKey()) {
                return entry.getValue();
            }
        }
        return "";
    }


}
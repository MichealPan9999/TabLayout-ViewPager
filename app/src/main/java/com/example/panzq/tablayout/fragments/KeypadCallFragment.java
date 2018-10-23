package com.example.panzq.tablayout.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.panzq.tablayout.R;

import java.sql.Array;
import java.util.ArrayList;

public class KeypadCallFragment extends Fragment {
    public KeypadCallFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_keypad_call, container, false);

        EditText editText = view.findViewById(R.id.editText);
        MaterialButton materialButton1 = view.findViewById(R.id.number1);
        MaterialButton materialButton2 = view.findViewById(R.id.number2);
        MaterialButton materialButton3 = view.findViewById(R.id.number3);
        MaterialButton materialButton4 = view.findViewById(R.id.number4);
        MaterialButton materialButton5 = view.findViewById(R.id.number5);
        MaterialButton materialButton6 = view.findViewById(R.id.number6);
        MaterialButton materialButton7 = view.findViewById(R.id.number7);
        MaterialButton materialButton8 = view.findViewById(R.id.number8);
        MaterialButton materialButton9 = view.findViewById(R.id.number9);
        MaterialButton materialButton0 = view.findViewById(R.id.number0);
        TextView star = view.findViewById(R.id.star);
        TextView square = view.findViewById(R.id.square);

        final Editable editable = editText.getText();

        ImageView imageView = view.findViewById(R.id.backspace);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editable.length() > 0)
                editable.delete(editable.length()-1, editable.length());
            }
        });

        materialButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("0");
            }
        });
        materialButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("1");
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("2");
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("3");
            }
        });
        materialButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("4");
            }
        });
        materialButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("5");
            }
        });
        materialButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("6");
            }
        });
        materialButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("7");
            }
        });
        materialButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("8");
            }
        });
        materialButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("9");
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("*");
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editable.append("#");
            }
        });

        return view;
    }
}

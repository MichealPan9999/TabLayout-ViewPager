package com.example.panzq.tablayout.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.panzq.tablayout.R;

public class VoicemailCallFragment extends Fragment {
    private boolean state = true;
    private boolean muteState = true;
    private boolean speakerState = true;
    public VoicemailCallFragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_voicemail_call, container, false);
        final TextView calling = view.findViewById(R.id.calling);
        final MaterialButton mute = view.findViewById(R.id.mute);
        final MaterialButton speaker = view.findViewById(R.id.speaker);
        final FloatingActionButton fab = view.findViewById(R.id.fab);
        MaterialButton contacts = view.findViewById(R.id.contacts);

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity =(AppCompatActivity)view.getContext();
                ContactCallFragment contactCallFragment = new ContactCallFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.constraint, contactCallFragment, "contactFragment").addToBackStack(null).commit();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state) {
                    calling.setText(R.string.call_ended);
                    fab.setImageResource(R.drawable.ic_call_end_black_24dp);
                    state = false;
                }
                else {
                    calling.setText(R.string.calling);
                    fab.setImageResource(R.drawable.ic_call_white_24dp);
                    state = true;
                }
            }
        });

        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (muteState) {
                    mute.setIcon(getResources().getDrawable( R.drawable.ic_mic_off_black_24dp, view.getContext().getTheme()));
                    muteState = false;
                }
                else {
                    mute.setIcon(getResources().getDrawable( R.drawable.ic_mic_black_24dp, view.getContext().getTheme()));
                    muteState = true;
                }
            }
        });

        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (speakerState) {
                    speaker.setIcon(getResources().getDrawable(R.drawable.ic_volume_off_black_24dp, view.getContext().getTheme()));
                    speakerState = false;
                }
                else {
                    speaker.setIcon(getResources().getDrawable(R.drawable.ic_volume_up_black_24dp, view.getContext().getTheme()));
                    speakerState = true;
                }
            }
        });
        return view;
    }
}

package com.example.panzq.tablayout.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.panzq.tablayout.R;
import com.example.panzq.tablayout.adapters.ContactAdapter;
import com.example.panzq.tablayout.bean.Contact;

import java.util.ArrayList;

public class ContactCallFragment extends Fragment {
    public ContactCallFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact_call_list, container, false);

        final AutoCompleteTextView autoCompleteTextView = view.findViewById(R.id.auto_complete);
        String[] nameList = getResources().getStringArray(R.array.contact_name);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1, nameList);
        autoCompleteTextView.setAdapter(adapter);

        final RecyclerView recyclerView = view.findViewById(R.id.recyclerContacts);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        final ArrayList<Contact> contactArrayList = new ArrayList<>();
        Contact contact = new Contact("Abuzettin Nereleregittin", "464864548", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Ahmet Kuskus", "65465468", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Buse Yogi", "65465468", R.drawable.girl);
        contactArrayList.add(contact);
        contact = new Contact("Cafer Dayakçıoğlu", "65465468", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Cafer Palamutsever", "65465468", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Cenk Tosun", "23 mins", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Dilara Rotbalansçıgil", "65465468", R.drawable.girl);
        contactArrayList.add(contact);
        contact = new Contact("DilaraSu Domates", "65465468", R.drawable.girl);
        contactArrayList.add(contact);
        contact = new Contact("Gürkan Palamutsever", "65465468", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Hasan Avludayatar", "54654654649", R.drawable.man);
        contactArrayList.add(contact);
        contact = new Contact("Muzaffer Bostancıgil", "65465468", R.drawable.man);
        contactArrayList.add(contact);


        ContactAdapter contactAdapter = new ContactAdapter(contactArrayList, view.getContext());
        recyclerView.setAdapter(contactAdapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i;
                for ( i = 0; i<contactArrayList.size(); i++) {
                    if (contactArrayList.get(i).getmName().equals(adapter.getItem(position))) {
                        break;
                    }
                }
                autoCompleteTextView.setText("");
                recyclerView.scrollToPosition(i);
            }
        });
        return view;
    }
}

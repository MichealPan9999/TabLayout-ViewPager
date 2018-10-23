package com.example.panzq.tablayout.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.panzq.tablayout.R;
import com.example.panzq.tablayout.bean.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private ArrayList<Contact> contactArrayList;
    private Context context;

    public ContactAdapter(ArrayList<Contact> contactArrayList, Context context) {
        this.contactArrayList = contactArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_contact_call_list_item, viewGroup, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        Contact contact = contactArrayList.get(i);
        contactViewHolder.nameOfPerson.setText(contact.getmName());
        contactViewHolder.phoneNumber.setText(contact.getmPhone());
        contactViewHolder.imageView.setImageResource(contact.getmPicture());
    }

    @Override
    public int getItemCount() {
        return contactArrayList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nameOfPerson;
        TextView phoneNumber;

        ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.picture);
            nameOfPerson = itemView.findViewById(R.id.nameOfPerson);
            phoneNumber = itemView.findViewById(R.id.phoneNumber);
        }
    }
}

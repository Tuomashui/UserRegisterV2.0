package com.example.userregister;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserlistAdapter extends RecyclerView.Adapter<UserView> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserlistAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserView(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull UserView holder, int position) {
        holder.user_name.setText(users.get(position).getFirstname() + " " + users.get(position).getLastname());
        holder.user_degr.setText(users.get(position).getDegree());
        holder.user_email.setText(users.get(position).getEmail());
        holder.photos.setImageResource(users.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {return users.size();}
}

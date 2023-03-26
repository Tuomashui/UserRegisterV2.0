package com.example.userregister;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserView extends RecyclerView.ViewHolder {
    ImageView photos;
    TextView user_name, user_degr, user_email;

    public UserView(@NonNull View itemView) {
        super(itemView);
        photos = itemView.findViewById(R.id.photos);
        user_name =  itemView.findViewById(R.id.user_name);
        user_degr = itemView.findViewById(R.id.user_degr);
        user_email = itemView.findViewById(R.id.user_email);
    }
}

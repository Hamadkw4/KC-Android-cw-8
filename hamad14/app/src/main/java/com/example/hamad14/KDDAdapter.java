package com.example.hamad14;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class KDDAdapter extends ArrayAdapter {
    List<KDD>KDDList;
     public KDDAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        KDDList= objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false );
        KDD currentKDD=KDDList.get(position);
        TextView itemneme=view.findViewById(R.id.textView4);
        TextView itemBrand=view.findViewById(R.id.textView5);
        ImageView itemphoto=view.findViewById(R.id.imageView4);

        itemneme.setText(currentKDD.getItemName());
        itemBrand.setText(currentKDD.getItemBrand());
        itemphoto.setImageResource(currentKDD.getItemImage());

        ImageView DBd12=view.findViewById(R.id.imageView13);

            DBd12.setOnClickListener(new View.OnClickListener() {
                KDD rKDD=KDDList.get(position);
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder= new AlertDialog.Builder(getContext()).setMessage("Are you sure ? ")
                            .setTitle("confirmation ").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    KDDList.remove(position);
                                    notifyDataSetChanged();
                                }
                            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            });


                    builder.show();
                }
            });




                    return view;


    }

}

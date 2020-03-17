package com.example.notas.adpater;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.notas.R;
import com.example.notas.entities.Notes;

import java.util.ArrayList;


public class AdapterNote extends ArrayAdapter<Notes>{
    public AdapterNote(@NonNull Context context, ArrayList<Notes> notes) {
        super(context, 0, notes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Notes n = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_linha, parent, false);

        }
        ((TextView) convertView.findViewById(R.id.titulo)).setText(n.getTitulo());
        ((TextView) convertView.findViewById(R.id.descricao)).setText(n.getDescricao());
        ((TextView) convertView.findViewById(R.id.data)).setText(""+n.getData());

        return convertView;

    }


}



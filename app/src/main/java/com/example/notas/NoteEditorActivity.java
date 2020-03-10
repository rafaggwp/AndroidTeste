package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.notas.db.Contrato;
import com.example.notas.db.DB;

public class NoteEditorActivity extends AppCompatActivity {


    DB mDbHelper;
    SQLiteDatabase db;
    Cursor c, c_Notas;
    ListView lista;
    SimpleCursorAdapter adapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        mDbHelper = new DB(this);
        db = mDbHelper.getReadableDatabase();

        lista = (ListView) findViewById(R.id.listView);
        registerForContextMenu(lista);
        preencheLista();
        //preencheSpinner();
    }


    public void preencheLista(){
        //c = db.query(false, Contrato.Nota.TABLE_NAME, Contrato.Nota.PROJECTION, null, null);

        adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
                c,
                new String[] {Contrato.Nota.COLUMN_TITULO, Contrato.Nota.COLUMN_DESCRICAO, Contrato.Nota.COLUMN_DATA,
                        Contrato.Nota.COLUMN_HORA},
                new int[] {android.R.id.text1,android.R.id.text2},
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        lista.setAdapter(adapter);

    }







}

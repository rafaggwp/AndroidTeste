package com.example.notas.db;

import android.provider.BaseColumns;

public class Contrato {

    private static final String TEXT_TYPE = "TEXT";
    private static final String INT_TYPE = "INTEGER";


    public Contrato() {
    }
        public static abstract class Nota implements BaseColumns{
            public static final String TABLE_NAME = "nota";
            public static final String COLUMN_ID =" id_nota";
            public static final String COLUMN_TITULO = "titulo";
            public static final String COLUMN_DESCRICAO = "descricao";

            public static final String[] PROJECTION = {Nota.COLUMN_ID, Nota.COLUMN_TITULO, Nota.COLUMN_DESCRICAO};

            public static final String SQL_CREATE_ENTRIES =
                    "CREATE TABLE" + Nota.TABLE_NAME + "(" +
                            Nota._ID + INT_TYPE + "PRIMARY KEY, " +
                            Nota.COLUMN_TITULO + TEXT_TYPE + "," +
                            Nota.COLUMN_DESCRICAO + TEXT_TYPE;

            public static final String SQL_DROP_ENTRIES =
                    "DROP_TABLE" + Nota.TABLE_NAME +";";
        }



    }





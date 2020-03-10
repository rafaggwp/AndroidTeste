package com.example.notas.db;

import android.provider.BaseColumns;

public class Contrato {

    private static final String TEXT_TYPE = "TEXT";
    private static final String INT_TYPE = "INTEGER";
    private static final String DATE_TYPE ="DATE";


    public Contrato() {
    }
        public static abstract class Nota implements BaseColumns{
            public static final String TABLE_NAME = "nota";
            public static final String COLUMN_ID =" id_nota";
            public static final String COLUMN_TITULO = "titulo";
            public static final String COLUMN_DESCRICAO = "descricao";
            public static final String COLUMN_DATA = "data";
            public static final String COLUMN_HORA = "hora";


            public static final String[] PROJECTION = {Nota.COLUMN_ID, Nota.COLUMN_TITULO,
                    Nota.COLUMN_DESCRICAO, Nota.COLUMN_DATA, Nota.COLUMN_HORA};

            public static final String SQL_CREATE_ENTRIES =
                    "CREATE TABLE" + Nota.TABLE_NAME + "(" +
                            Nota._ID + INT_TYPE + "PRIMARY KEY, " +
                            Nota.COLUMN_TITULO + TEXT_TYPE + "," +
                            Nota.COLUMN_DESCRICAO + TEXT_TYPE + "," +
                            Nota.COLUMN_DATA + DATE_TYPE + "," +
                            Nota.COLUMN_HORA + DATE_TYPE;



            public static final String SQL_DROP_ENTRIES =
                    "DROP_TABLE" + Nota.TABLE_NAME +";";
        }




    }





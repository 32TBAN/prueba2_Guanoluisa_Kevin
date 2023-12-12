package esteban.g.doodleapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseManager extends SQLiteOpenHelper {

    final String CREATE_CLIENTS = "CREATE TABLE USERS (Code INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, " +
            "PASSWORD TEXT)";
    final String DROP_TABLE = "DROP TABLE IF EXISTS USERS";
    public DataBaseManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // sql para definir la estructura de la BD.
        db.execSQL(CREATE_CLIENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // sql para realizar cambios en la estructura de la base datos
        db.execSQL(DROP_TABLE);
        db.execSQL(CREATE_CLIENTS);
    }
}

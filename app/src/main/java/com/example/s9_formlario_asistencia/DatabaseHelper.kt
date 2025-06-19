package com.example.s9_formlario_asistencia

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// Clase DatabaseHelper para crear y gestionar la base de datos
class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "form_data.db"
        private const val DATABASE_VERSION = 1
        const val TABLE_NAME = "user_data"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_SURNAME = "surname"
        const val COLUMN_CODE = "code"
        const val COLUMN_DNI = "dni"
        const val COLUMN_EMAIL = "email"
        const val COLUMN_PHONE = "phone"
    }

    // Crear tabla de base de datos
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY = ("CREATE TABLE $TABLE_NAME ("
                + "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "$COLUMN_NAME TEXT, "
                + "$COLUMN_SURNAME TEXT, "
                + "$COLUMN_CODE TEXT, "
                + "$COLUMN_DNI TEXT, "
                + "$COLUMN_EMAIL TEXT, "
                + "$COLUMN_PHONE TEXT)")
        db?.execSQL(CREATE_TABLE_QUERY)
    }

    // Actualización de base de datos (si se actualiza la versión)
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // Método para insertar datos en la base de datos
    fun insertData(name: String, surname: String, code: String, dni: String, email: String, phone: String): Long {
        val db = this.writableDatabase

        val values = ContentValues().apply {
            put(COLUMN_NAME, name)
            put(COLUMN_SURNAME, surname)
            put(COLUMN_CODE, code)
            put(COLUMN_DNI, dni)
            put(COLUMN_EMAIL, email)
            put(COLUMN_PHONE, phone)
        }

        // Insertar los datos en la tabla
        val id = db.insert(TABLE_NAME, null, values)
        db.close()  // Cerrar la base de datos después de la inserción
        return id
    }
}

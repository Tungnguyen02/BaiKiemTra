package com.example.kiemtra.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context, "QLSanPham", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Product(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "TenSP TEXT, GiaTien TEXT, Image TEXT)";
        String data = "INSERT INTO SanPham VALUES(1, 'Bò né', 50000, 'https://static.vinwonders.com/2022/10/bo-ne-da-nang-01.jpg')," +
                "(2, 'Phở', 50000, 'https://cdn.tgdd.vn/Files/2022/01/25/1412805/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg')," +
                "(3, 'Hủ tiếu ', 50000, 'https://mekongrestaurant.vn/wp-content/uploads/2023/07/Hu-tieu-Mekong-1.png')," +
                "(4, 'Bún chả ', 50000, 'https://static.vinwonders.com/production/bun-cha-cau-giay-1.jpg')";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}

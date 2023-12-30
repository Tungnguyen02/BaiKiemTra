package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kiemtra.adapter.SanPhamAdapter;
import com.example.kiemtra.dao.SanPhamDAO;
import com.example.kiemtra.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SanPhamAdapter sanPhamAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnDelete = findViewById(R.id.btnDelete);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện thêm sản phẩm ở đây
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện xóa sản phẩm ở đây
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện thêm sản phẩm ở đây
                Toast.makeText(MainActivity.this, "Thêm sản phẩm", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SanPhamDAO sanPhamDAO = new SanPhamDAO(this);
        ArrayList<SanPham> listSanPham = sanPhamDAO.getListSanPham();
        sanPhamAdapter = new SanPhamAdapter(this, listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }
}

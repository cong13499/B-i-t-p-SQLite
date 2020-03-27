package com.example.a27320;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtHoTen, edtNS, edtTruong;
    RadioButton rdNam, rdNu;
    CheckBox cbTheThao, cbDuLich, cbDocSach;
    Button btNhap, btNhapLai;
    SinhVienDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHoTen = findViewById(R.id.edtHoTen);
        edtNS = findViewById(R.id.edtNS);
        edtTruong = findViewById(R.id.edtTruong);

        rdNam = findViewById(R.id.rdNam);
        rdNu = findViewById(R.id.rdNu);

        cbTheThao = findViewById(R.id.cbTheThao);
        cbDuLich = findViewById(R.id.cbDuLich   );
        cbDocSach = findViewById(R.id.cbDocSach);

        btNhap = findViewById(R.id.btNhap);
        btNhapLai = findViewById(R.id.btNhapLai);

        db = new SinhVienDataBase(this);

    btNhapLai.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edtHoTen.setText("");
            edtNS.setText("");
            edtTruong.setText("");

            rdNam.setChecked(true);

            cbTheThao.setChecked(false);
            cbDuLich.setChecked(false);
            cbDocSach.setChecked(false);

        }
    });
    btNhap.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int gt = 0;

            String hoTen = edtHoTen.getText().toString();
            String namSinh = edtNS.getText().toString();
            String truong = edtTruong.getText().toString();
            String sothich = "";

            if(rdNu.isChecked()){
                gt = 1;
            }

            if(cbTheThao.isChecked()){
                sothich +=","+ cbTheThao.getText().toString();
            }if(cbDuLich.isChecked()){
                sothich +=","+ cbDuLich.getText().toString();
            } if(cbDocSach.isChecked()){
                sothich +=","+ cbDocSach.getText().toString();
            }
            SinhVienModel svThem = new SinhVienModel(hoTen, namSinh, truong, sothich,gt);
            if (svThem!=null){
                db.ThemSinhVien(svThem);
                Toast.makeText(MainActivity.this, "Bạn đã thêm thành công!",Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
}

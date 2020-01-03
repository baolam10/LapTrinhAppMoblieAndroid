package com.dotranbaolam.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.LinkedList;

public class DangKyTaiKhoan extends AppCompatActivity {

    private EditText mTenDangNhapEdit, mEmailEdit, mMatKhauEdit, mResMatKhau;
    private NguoiChoiDBHelper ncDBHelper;
    private NguoiChoiEnTry ncEnTry;
    private final LinkedList<String> mWordList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_tai_khoan);

        mTenDangNhapEdit = findViewById(R.id.editText_uername);
        mEmailEdit = findViewById(R.id.editText_Email);
        mMatKhauEdit = findViewById(R.id.editText_Pass);
        mResMatKhau = findViewById(R.id.editText_Respass);

        ncDBHelper = new NguoiChoiDBHelper(this);
        for(int i=0;i<20;i++){
            mWordList.addLast("NguoiChoi"+i);
        }

    }
}

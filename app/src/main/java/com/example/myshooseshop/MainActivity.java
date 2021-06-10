package com.example.myshooseshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img_product_main;
    EditText edit_count;
    TextView txt_total, txt_delivery, txt_pay;
    RadioButton radio1,radio2,radio3,radio4;
    RadioButton radio_kids , radio_adult;


    int danga; //단가
    int count; //수량
    int val_price  = 30000 ; // 선택한 제품의 단가 * 수량
    int val_delivery ; //배송비
    int option; //
    int val_pay ;        // 결제 금액 : 단가 * 수량  +

    CheckBox chk_agree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        img_product_main = findViewById(R.id.img_product_main);
        edit_count = findViewById(R.id.edit_count);
        txt_total = findViewById(R.id.txt_total);

        txt_pay = findViewById(R.id.txt_pay);
        chk_agree = findViewById(R.id.chk_agree);
        chk_agree = findViewById(R.id.chk_agree);
        chk_agree = findViewById(R.id.chk_agree);
        chk_agree = findViewById(R.id.chk_agree);
        chk_agree = findViewById(R.id.chk_agree);
        chk_agree = findViewById(R.id.chk_agree);

        findViewById(R.id.radio1).setOnClickListener(this);
        findViewById(R.id.radio2).setOnClickListener(this);
        findViewById(R.id.radio3).setOnClickListener(this);
        findViewById(R.id.radio3).setOnClickListener(this);
        findViewById(R.id.btn_minus).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_pay).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }

}
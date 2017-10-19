package test.gamelofd.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtTen;
    private EditText edtTuoi;
    private EditText edtDiaChi;
    private ListView lvThongTin;
    private Button btnAdd;
    private ArrayAdapter<String> mAdapter;
    private ArrayList<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTen = (EditText) findViewById(R.id.edt_ten);
        edtTuoi = (EditText) findViewById(R.id.edt_tuoi);
        edtDiaChi = (EditText) findViewById(R.id.edt_diachi);
        lvThongTin = (ListView) findViewById(R.id.lv_thongtin);
        mList = new ArrayList<>();
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, mList);
        lvThongTin.setAdapter(mAdapter);
    }


    public void btn_add(View view) {
        String strA = edtTen.getText().toString();
        String strB = edtTuoi.getText().toString();
        String strC = edtDiaChi.getText().toString();


        if (!edtTen.getText().toString().isEmpty() && !edtDiaChi.getText().toString().isEmpty() && !edtTuoi.getText().toString().isEmpty()) {
            int tuoi= Integer.parseInt(edtTuoi.getText().toString());
            if (tuoi<=99 && tuoi >=1) {
                String strAdd = strA + "\nTuổi:" + strB + "\nĐịa Chỉ" + strC;
                mList.add(strAdd);
                //refresh list and data
                mAdapter.notifyDataSetChanged();
            }
            else Toast.makeText(MainActivity.this, "Vui lòng nhập tuổi lại hợp lệ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Vui lòng nhập lại hợp lệ", Toast.LENGTH_SHORT).show();


        }

    }
}

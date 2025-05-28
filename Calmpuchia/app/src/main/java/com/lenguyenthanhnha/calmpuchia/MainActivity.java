package com.lenguyenthanhnha.calmpuchia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtTextSearch;
    Button btnSearch;
    TextView txtViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextSearch = findViewById(R.id.edtTextSearch);
        btnSearch = findViewById(R.id.btnSearch);
        txtViewResult = findViewById(R.id.txtViewResult);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = edtTextSearch.getText().toString().trim();
                if (!query.isEmpty()) {
                    // Thực hiện tìm kiếm ở đây (hiển thị giả lập)
                    txtViewResult.setText("You searched for: " + query);
                } else {
                    txtViewResult.setText("Please enter a keyword.");
                }
            }
        });
    }
}

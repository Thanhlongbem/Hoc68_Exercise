package banh.along.hoc68_exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button btn_start_10;
    Button btn_start_11;
    Button btn_start_12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initView();
        initClick();


    }

    public void initView(){

        btn_start_10 = findViewById(R.id.btn_start_10);
        btn_start_11 = findViewById(R.id.btn_start_11);
        btn_start_12 = findViewById(R.id.btn_start_12);


    }

    public void initClick(){
        btn_start_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubjectActivity.class);
                intent.putExtra("TEN_LOP", 10);
                startActivity(intent);
            }
        });

        btn_start_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubjectActivity.class);
                intent.putExtra("TEN_LOP", 11);
                startActivity(intent);
            }
        });

        btn_start_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubjectActivity.class);
                intent.putExtra("TEN_LOP", 12);
                startActivity(intent);
            }
        });
    }
}

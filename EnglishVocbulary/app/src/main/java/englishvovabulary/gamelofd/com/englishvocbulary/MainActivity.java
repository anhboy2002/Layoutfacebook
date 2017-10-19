package englishvovabulary.gamelofd.com.englishvocbulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import englishvovabulary.gamelofd.com.englishvocbulary.controllers.TopicManager;

public class MainActivity extends AppCompatActivity {
private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_vocabulary);
       btnlogin= (Button) findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }


}

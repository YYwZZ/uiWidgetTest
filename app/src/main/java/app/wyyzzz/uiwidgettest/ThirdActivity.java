package app.wyyzzz.uiwidgettest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
    }

    public void btn3(View v){
        Intent intent = new Intent(ThirdActivity.this,RelativeLayoutActivity.class);
        startActivity(intent);
    }
}

package app.wyyzzz.uiwidgettest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View v){

        //EditText test
        editText = (EditText)findViewById(R.id.Edit_text);
        String InputText = editText.getText().toString();
        Toast.makeText(MainActivity.this,InputText,Toast.LENGTH_SHORT).show();

        /*//ImageView test
        imageView = (ImageView)findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.img_2);

        //ProgressBar test
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        if(progressBar.getVisibility() == View.GONE){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }*/

        //AlertDialog test
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("This is a Dialog");
        dialog.setMessage("Something important");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){}
        });

        dialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){}
        });
        dialog.show();

    }

}

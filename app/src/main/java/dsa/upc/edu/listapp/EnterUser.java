package dsa.upc.edu.listapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class EnterUser extends AppCompatActivity {
    Button btn_senduser;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_user);
        btn_senduser = findViewById(R.id.sendUser_btn);
        user = String.valueOf(findViewById(R.id.user_txt));



    }
    public void sendUserClick (android.view.View v){
        Intent intent = new Intent(this, ReposActivity.class);
        intent.putExtra("lauraaf", user.toString()); // Aquí pasas los datos
        startActivity(intent);

    }
}

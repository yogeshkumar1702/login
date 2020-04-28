package com.example.login;

import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

   private EditText Name;
   private EditText Password;
   private Button Login;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Name = (EditText)findViewById(R.id.etName);
      Password = (EditText)findViewById(R.id.et_password);
      Login = (Button)findViewById(R.id.bt_login);



      Login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            validate(Name.getText().toString(), Password.getText().toString());
         }
      });
   }

   private void validate(String userName, String userPassword){
      if((userName.equals("yogesh")) && (userPassword.equals("1702"))){
         AlertDialog.Builder builder = new AlertDialog.Builder(
                 MainActivity.this
         );
         builder.setIcon(R.drawable.ic_check);
         builder.setTitle("Login Successfully");

         builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();

            }
         });
         AlertDialog alertDialog = builder.create();
         alertDialog.show();

      }else{
         Toast.makeText(getApplicationContext(),
                 "Invalid username & password", Toast.LENGTH_SHORT) .show();


      }
   }

}
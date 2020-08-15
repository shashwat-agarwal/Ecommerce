package agarwal.shashwat.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNo;
    private Button otpOnSMS, otpOnWhatsApp;

  /*  @Override
    protected void onStart() {
        super.onStart();
        if (FirebaseAuth.getInstance().getCurrentUser()!=null){
            Intent intent=new Intent(this,MapsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        otpOnSMS = findViewById(R.id.otpSMS);
        otpOnWhatsApp = findViewById(R.id.otpWHATSAPP);
        phoneNo = findViewById(R.id.phoneNumberEditText);

        phoneNo.setText("+91");
        Selection.setSelection(phoneNo.getText(), phoneNo.getText().length());


        phoneNo.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.toString().startsWith("+91")){
                    phoneNo.setText("+91");
                    Selection.setSelection(phoneNo.getText(), phoneNo.getText().length());

                }

            }
        });


        otpOnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number=phoneNo.getText().toString().trim();

                if (number.isEmpty() || number.length()<10){
                    phoneNo.setError("Valid Number is required");
                    phoneNo.requestFocus();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), verifyPhone.class);
                intent.putExtra("phoneNo", phoneNo.getText().toString().trim());
                startActivity(intent);
            }
        });
        otpOnWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Will soon work !!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}

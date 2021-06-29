package com.example.sleepo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.hanks.passcodeview.PasscodeView;

public class MainActivity extends AppCompatActivity {
    PasscodeView passcodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passcodeView=findViewById(R.id.passcodeView);
        passcodeView.setPasscodeLength(5)
                .setLocalPasscode("11223")
                .setListener(new PasscodeView.PasscodeViewListener() {
                    @Override
                    public void onFail() {
                        Toast.makeText(MainActivity.this, "Wrong passcode", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(String number) {

                        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                });


}
}
package com.example.sum;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    EditText etxt1,etxt2;
    TextView ans;
    int n1,n2;
    String temp1,temp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("activity Created");
        ans=findViewById(R.id.ans);
        etxt1=findViewById(R.id.etxt1);
        etxt2=findViewById(R.id.etxt2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);


        etxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    String str1=charSequence.toString();
                    String str2=etxt2.getText().toString();
                    if(str2.isEmpty())
                    {
                        n2=0;
                        etxt2.setError("Must Not Empty");
                    }
                    else
                    {
                        n2=Integer.parseInt(etxt2.getText().toString());
                    }
                    if(str1.isEmpty())
                    {
                        n1=0;
                        etxt1.setError("Must Not Empty");
                    }
                    else
                    {
                        n1=Integer.parseInt(etxt1.getText().toString());
                    }
                    int sum=n1+n2;
                    ans.setText(""+sum);

                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(str1.length()>0)
                            {
                                temp1 = str1.substring(0,str1.length()-1);
                                etxt1.setText(temp1);
                            }
                            else
                            {
                                etxt1.setText("");
                            }
                        }
                    });

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etxt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String str2=charSequence.toString();
                String str1=etxt1.getText().toString();
                if(str1.isEmpty())
                {
                    n1=0;
                    etxt1.setError("Must Not Empty");
                }
                else
                {
                    n1=Integer.parseInt(etxt1.getText().toString());
                }
                if(str2.isEmpty())
                {
                    n2=0;
                    etxt2.setError("Must Not Empty");
                }
                else
                {
                    n2=Integer.parseInt(etxt2.getText().toString());
                }
                int sum=n1+n2;
                ans.setText(""+sum);

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(str2.length()>0)
                        {
                            temp2 = str2.substring(0,str2.length()-1);
                            etxt2.setText(temp2);
                        }
                        else
                        {
                            etxt2.setText("");
                        }
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
package com.example.festival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HmeActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hme);

        t1= (TextView) findViewById(R.id.one);
        t2= (TextView) findViewById(R.id.two);
        t3= (TextView) findViewById(R.id.three);
        t4= (TextView) findViewById(R.id.four);
        t5= (TextView) findViewById(R.id.five);
        t6= (TextView) findViewById(R.id.six);
        t7= (TextView) findViewById(R.id.seven);
        t9= (TextView) findViewById(R.id.nine);
        t10= (TextView) findViewById(R.id.ten);
        t11= (TextView) findViewById(R.id.eleven);
        t12= (TextView) findViewById(R.id.twelve);
        t13= (TextView) findViewById(R.id.thirteen);
        t14= (TextView) findViewById(R.id.fourteen);
        t15= (TextView) findViewById(R.id.fifteen);
        t16= (TextView) findViewById(R.id.sixteen);
        t17= (TextView) findViewById(R.id.seventeen);
        t18= (TextView) findViewById(R.id.eighteen);
        t19= (TextView) findViewById(R.id.nineteen);
        t20= (TextView) findViewById(R.id.twenty);
        t21= (TextView) findViewById(R.id.twentyone);
        t22= (TextView) findViewById(R.id.twentytwo);
        t23= (TextView) findViewById(R.id.twentythree);
        t24= (TextView) findViewById(R.id.twentyfour);
        t25= (TextView) findViewById(R.id.twentyfive);
        t26= (TextView) findViewById(R.id.twentysix);
        t27= (TextView) findViewById(R.id.twentyseven);
        t28= (TextView) findViewById(R.id.twentyeight);
        t29= (TextView) findViewById(R.id.twentynine);
        t30= (TextView) findViewById(R.id.thirty);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,OneActivity.class));
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwoActivity.class));
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,ThreeActivity.class));
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,FourActivity.class));
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,FiveActivity.class));
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,SixActivity.class));
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,SevenActivity.class));
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,NineActivity.class));
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TenActivity.class));
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,ElevenActivity.class));
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwelveActivity.class));
            }
        });

        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,ThirteenActivity.class));
            }
        });

        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,FourteenActivity.class));
            }
        });

        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,FifteenActivity.class));
            }
        });

        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,SixteenActivity.class));
            }
        });

        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,SeventeenActivity.class));
            }
        });

        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,EighteenActivity.class));
            }
        });

        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,NineteenActivity.class));
            }
        });

        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentyActivity.class));
            }
        });

        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentyoneActivity.class));
            }
        });

        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentytwoActivity.class));
            }
        });

        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentythreeActivity.class));
            }
        });

        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentyfourActivity.class));
            }
        });

        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentyfiveActivity.class));
            }
        });

        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentysixActivity.class));
            }
        });

        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentysevenActivity.class));
            }
        });

        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentyeightActivity.class));
            }
        });

        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,TwentynineActivity.class));
            }
        });

        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,ThirtyActivity.class));
            }
        });
    }
}
package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent it = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);

    }
}

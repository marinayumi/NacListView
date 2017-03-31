package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {
    ImageView imgPizza;
    TextView txtSabor;
    TextView txtIngredientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizza pizza = (Pizza) getIntent().getExtras().get("pizzas");

        /*
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(pizza.getSabor());
        */

        imgPizza = (ImageView)findViewById(R.id.imgpizza);
        txtSabor = (TextView)findViewById(R.id.txtSabor);
        txtSabor = (TextView)findViewById(R.id.txtIngredientes);

        imgPizza.setImageResource(pizza.getImagem());
        txtSabor.setText(pizza.getSabor());
        txtIngredientes.setText(pizza.getIngredientes());

    }
}

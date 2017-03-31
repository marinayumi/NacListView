package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstPizzas;
    List<Pizza> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzas = GeraPizza.listaPizzas();
        final PizzaAdapter pizzaAdapter = new PizzaAdapter(this, pizzas);
        lstPizzas = (ListView)findViewById(R.id.lstPizzas);
        lstPizzas.setAdapter(pizzaAdapter);

        lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pizza pizza = pizzas.get(position);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizzas", pizza);
                startActivity(it);
            }
        });

/*
            lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pizzas pizza = pizzas.get(position);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });
 */
    }
}

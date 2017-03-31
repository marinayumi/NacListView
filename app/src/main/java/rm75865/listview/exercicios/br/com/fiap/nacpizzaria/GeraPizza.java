package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 31/03/2017.
 */

public class GeraPizza {

    public static List<Pizza> listaPizzas(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Mussarela", "40.00", R.drawable.mussarela, "mussarela", 10.00));
        pizzas.add(new Pizza("Calabresa", "40.00", R.drawable.calabresa, "calabresa", 10.00));
        pizzas.add(new Pizza("Portuguesa", "40.00", R.drawable.portuguesa, "mussarela", 10.00));
        pizzas.add(new Pizza("Pepperoni", "40.00", R.drawable.pepperoni, "mussarela", 10.00));
        pizzas.add(new Pizza("Brócolis", "40.00", R.drawable.brocolis, "mussarela", 10.00));
        pizzas.add(new Pizza("Frango com catupiry", "40.00", R.drawable.frango, "mussarela", 10.00));

        return pizzas;
    }

}

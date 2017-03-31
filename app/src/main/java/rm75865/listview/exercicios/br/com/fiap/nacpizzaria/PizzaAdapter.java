package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 31/03/2017.
 */

public class PizzaAdapter extends BaseAdapter {
    private Context context;
    private List<Pizza> pizzas;

    public PizzaAdapter(Context context, List<Pizza> pizzas) {
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount() {
        return this.pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return (Object) this.pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Pizza pizza = this.pizzas.get(position);
        View v = layoutInflater.inflate(R.layout.pizza_listview, null);
        ImageView imgPizza = (ImageView) v.findViewById(R.id.imgpizza);
        TextView txtSabor = (TextView) v.findViewById(R.id.txtSabor);
        TextView txtValor = (TextView) v.findViewById(R.id.txtValor);

        imgPizza.setImageResource(pizza.getImagem());
        txtSabor.setText(pizza.getSabor());
        txtValor.setText(pizza.getValor());

        return v;



    }
}

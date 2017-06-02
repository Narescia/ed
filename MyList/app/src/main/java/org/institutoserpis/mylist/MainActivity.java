package org.institutoserpis.mylist;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    private ListView listView;

    private String libros[]=new String[]{"22/11/63","Jane Eyre","Los Miserables","Oliver Twist",
            "Hamlet","Emma","Anna Karenina","Expiación","Matar a un ruiseñor","David Copperfield","Crimen y castigo",
            "Un mundo feliz","El Gran Gatsby","El psicoanalista"};
    private String[] color= { "#FFEBEE", "#CFD8DC", "#E1BEE7", "#C8E6C9",
            "#C5CAE9", "#FFF59D", "#B3E5FC", "#FFAB91" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.miLista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_expandable_list_item_1, libros);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemSeleccionado = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), "El libro seleccionado es: " +
                        itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });


    }


}
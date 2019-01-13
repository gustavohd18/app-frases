package com.example.gustavo.quoteoftheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newQuote(View view){
        txtQuote = findViewById(R.id.txt_quote);
        ArrayList<String> quote = new ArrayList<>();
        Random radom = new Random();


        quote.add("Hoje será um dia incrivel para caminhar");
        quote.add("O ser humano quando está em paz não quer guerra com ninguem");
        quote.add("Diga a alguem o quanto ela é importante para você");
        quote.add("Assista um filme totalmente inesperado");
        quote.add("Convide alguem para tomar um café");
        quote.add("Convide alguem para jantar com você");
        quote.add("Convide alguem para almoçar com você");
        quote.add("Ligue para alguem e diga algo inesperado");

        int value = radom.nextInt(quote.size()+1);

        txtQuote.setText("A frase do dia é: "+ quote.get(value));

    }
}

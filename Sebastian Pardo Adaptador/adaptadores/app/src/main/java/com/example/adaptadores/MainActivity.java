package com.example.adaptadores;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadores.Adaptadores.Personaje_Adaptador;
import com.example.adaptadores.Clases.Personaje;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView Personajes;
    List<Personaje>  listPersonajes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Personajes = findViewById(R.id.Personajes);

        Personaje per1 = new Personaje("https://i.pinimg.com/1200x/e4/5c/70/e45c7011ab069ad9943295e0b59e8aaf.jpg","Audi A8","modelo unico");
        Personaje per2 = new Personaje("https://i.pinimg.com/736x/37/38/8f/37388f39fadae7a8c4e594687457db98.jpg","Lamborghini Urus","Urus");
        Personaje per3 = new Personaje("https://i.pinimg.com/1200x/d6/2b/c6/d62bc60c4881c50ccf46c4bbd01cdb42.jpg","Lexus LS","LS 500");
        Personaje per4 = new Personaje("https://i.pinimg.com/1200x/8e/7b/de/8e7bdec3caa39dc3ae4797d8ab175e30.jpg","Aston Martin DB11","DB11 V8");
        Personaje per5 = new Personaje("https://i.pinimg.com/736x/de/e9/5f/dee95f30f9d15d03438cd3d73d28dbc6.jpg","Porsche Cayenne","Cayenne (E1)");
        Personaje per6 = new Personaje("https://i.pinimg.com/736x/82/5a/c5/825ac54eabdaa54bb1de6baecbfa18ae.jpg","Ferrari SF90 Stradale","modelo base");

        listPersonajes.add(per1);
        listPersonajes.add(per2);
        listPersonajes.add(per3);
        listPersonajes.add(per4);
        listPersonajes.add(per5);
        listPersonajes.add(per6);


        Personajes.setLayoutManager(new LinearLayoutManager(this));
        Personajes.setAdapter(new Personaje_Adaptador(listPersonajes));

        }
    }

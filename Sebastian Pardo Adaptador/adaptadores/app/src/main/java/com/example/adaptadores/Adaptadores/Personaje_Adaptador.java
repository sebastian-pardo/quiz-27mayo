package com.example.adaptadores.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadores.Clases.Personaje;
import com.example.adaptadores.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Personaje_Adaptador extends RecyclerView.Adapter<Personaje_Adaptador.ViewHolder> {

    private List<Personaje> datos;

    public Personaje_Adaptador(List<Personaje> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public Personaje_Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Personaje_Adaptador.ViewHolder holder, int position) {
        Personaje dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPersonaje;
        TextView txtNombre, txtModelo;


        public ViewHolder(@NonNull View itemView){
            super((itemView));


            imgPersonaje = itemView.findViewById(R.id.imgPersonaje);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtModelo = itemView.findViewById(R.id.txtmodelo);

        }
        public void bind(Personaje dato){
            txtNombre.setText(dato.getNombre());
            txtModelo.setText(dato.getEdad());
            Picasso.get().load(dato.getImagen()).into(imgPersonaje);
    }



    }


}

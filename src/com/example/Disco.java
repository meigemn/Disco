package com.example;


public class Disco {
    private String nombre;
    private String autor;
    private enum TipoDisco{ESTUDIO,DIRECTO,RECOPILACION};
    private TipoDisco tipo;
    private int duracion;
    private int anyo;
    private double calificacion;
    
    private static int contador;

    public Disco(String nombre, String autor, TipoDisco tipo, int duracion, int anyo, double calificacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.duracion = duracion;
        this.anyo = anyo;
        this.calificacion = calificacion;
    }
    
    public static void main(String[] args) {
        System.out.println("Inicio de aplicacion");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Josefa
 */
public class Cliente {
    private String nombre;
    private Plan plan;
    private int minutos;
    private int total;

    public Cliente(String nombre, int minutos, int minutos1, double total1) {
        this.nombre = nombre;
        this.plan = plan;
        this.minutos = minutos;
        this.total = calcularTotal();
    }

    public final int calcularTotal() {
        return this.plan.getMantencion() + (this.minutos * this.plan.getMinuto());
    }

    @Override
    public String toString() {
        return "El cliente " + this.nombre + " con el plan " + this.plan.getNombreP() + " debe pagar un total de $" + this.total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        this.total = calcularTotal();
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getTotal() {
        return this.total;
    }
}
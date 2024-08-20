/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import static Tickets.EnumTipo.Plataforma;

/**
 *
 * @author Student
 */
public class Ticket {
    
    private int numero;
    private EnumTipo tipo;

    public int getNumero() {
        return numero;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    public Ticket(int numero, EnumTipo tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Ticket() {
        this(0, Plataforma);
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }

}

package ListaTickets;

import Tickets.EnumTipo;
import static Tickets.EnumTipo.Plataforma;
import Tickets.Ticket;
import java.util.ArrayList;

public class ListaTicket {

    private ArrayList<Ticket> listaTickets;

    public static ListaTicket instance;

    int contA;
    int contB;
    int contC;

    public ListaTicket() {
        this.listaTickets = new ArrayList<>();
    }

    public static ListaTicket getInstance() {
        if (instance == null) {
            instance = new ListaTicket();
        }
        return instance;
    }

    public void agregar(EnumTipo tipo) {

        switch (tipo) {
            case Plataforma:
                Ticket ticket = new Ticket(contA++, tipo);
                listaTickets.add(ticket);
                break;

            case Cajas:
                Ticket ticket2 = new Ticket(contB++, tipo);
                listaTickets.add(ticket2);
                break;

            case Preferencial:
                Ticket ticket3 = new Ticket(contC++, tipo);
                listaTickets.add(ticket3);
                break;
        }

    }

    public void eliminar(int numero) {

        for (Ticket ticket : listaTickets) {
            if (ticket.getNumero() == numero) {
                listaTickets.remove(ticket);
            }
        }
    }

    public void eliminarPosicion(int pos) {

        listaTickets.remove(pos);

    }

    public Ticket buscar(Ticket tipo) { // Recibe un ticket pero busca por tipo

        for (Ticket ticket : listaTickets) {
            if (ticket.getTipo().equals(tipo.getTipo())){
                return ticket;
            }
        }
        return null;
    }
    
    public Ticket buscarYElimina(Ticket tipo) { // Recibe un ticket pero busca por tipo y luego lo elimina de la lista

        for (Ticket ticket : listaTickets) {
            if (ticket.getTipo().equals(tipo.getTipo())){
                listaTickets.remove(ticket);
                return ticket;
                
            }
        }
        return null;
    }

}

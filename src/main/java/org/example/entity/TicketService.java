package org.example.entity;

public class TicketService {
    private TicketDao ticketDao = new TicketDao();

    public void saveTicket(Ticket ticket) {
        ticketDao.save(ticket);
    }

    public Ticket findTicketById(int id) {
        return ticketDao.findById(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketDao.update(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}

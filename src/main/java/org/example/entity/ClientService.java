package org.example.entity;

public class ClientService {
    private ClientDAO clientDao = new ClientDAO();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById( int id) {
        return clientDao.findById(id);
    }

    public void updateClient (Client client) {
        clientDao.update(client);
    }

    public void deleteClient (Client client) {
        clientDao.delete(client);
    }
}

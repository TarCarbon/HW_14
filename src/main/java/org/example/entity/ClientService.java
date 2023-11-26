package org.example.entity;

public class ClientService {
    private ClientDao clientDao = new ClientDao();

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

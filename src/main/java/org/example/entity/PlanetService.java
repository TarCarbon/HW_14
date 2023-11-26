package org.example.entity;

public class PlanetService {
    private PlanetDao planetDAO = new PlanetDao();

    public void savePlanet(Planet planet) {
        planetDAO.save(planet);
    }

    public Planet findPlanetById(String id) {
        return planetDAO.findById(id);
    }

    public void updatePlanet(Planet planet) {
        planetDAO.update(planet);
    }

    public void deletePlanet(Planet planet) {
        planetDAO.delete(planet);
    }
}

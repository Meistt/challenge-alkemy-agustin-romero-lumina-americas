package com.alkemy.agustin.romero.repository;

import com.alkemy.agustin.romero.models.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class RepositorioPersonajeImpl implements RepositorioPersonaje{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Personaje buscarPersonaje(Long id) {
        return null;
    }

    @Override
    public void crearPersonaje(Personaje nuevo) {
        entityManager.merge(nuevo);
    }

    @Override
    public void actualizarPersonaje(Personaje editado) {

    }

    @Override
    public void eliminarPersonaje(Long id) {
        Personaje personaje = buscarPersonaje(id);
        entityManager.remove(personaje);
    }

    @Override
    @Transactional
    public List<Personaje> getPersonajesList() {
        String query = "FROM Personaje";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Personaje> buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public List<Personaje> buscarPorEdad(Integer edad) {
        return null;
    }

    @Override
    public List<Personaje> buscarPeliculasDondeApareceElPersonaje() {
        return null;
    }
}


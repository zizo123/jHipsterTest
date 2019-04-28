package com.sid.service;

import com.sid.domain.ClientEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing ClientEntity.
 */
public interface ClientEntityService {

    /**
     * Save a clientEntity.
     *
     * @param clientEntity the entity to save
     * @return the persisted entity
     */
    ClientEntity save(ClientEntity clientEntity);

    /**
     * Get all the clientEntities.
     *
     * @return the list of entities
     */
    List<ClientEntity> findAll();


    /**
     * Get the "id" clientEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ClientEntity> findOne(Long id);

    /**
     * Delete the "id" clientEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

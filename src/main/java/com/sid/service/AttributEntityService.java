package com.sid.service;

import com.sid.domain.AttributEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing AttributEntity.
 */
public interface AttributEntityService {

    /**
     * Save a attributEntity.
     *
     * @param attributEntity the entity to save
     * @return the persisted entity
     */
    AttributEntity save(AttributEntity attributEntity);

    /**
     * Get all the attributEntities.
     *
     * @return the list of entities
     */
    List<AttributEntity> findAll();


    /**
     * Get the "id" attributEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<AttributEntity> findOne(Long id);

    /**
     * Delete the "id" attributEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

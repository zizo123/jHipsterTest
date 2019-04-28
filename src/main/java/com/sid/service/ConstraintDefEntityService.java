package com.sid.service;

import com.sid.domain.ConstraintDefEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing ConstraintDefEntity.
 */
public interface ConstraintDefEntityService {

    /**
     * Save a constraintDefEntity.
     *
     * @param constraintDefEntity the entity to save
     * @return the persisted entity
     */
    ConstraintDefEntity save(ConstraintDefEntity constraintDefEntity);

    /**
     * Get all the constraintDefEntities.
     *
     * @return the list of entities
     */
    List<ConstraintDefEntity> findAll();


    /**
     * Get the "id" constraintDefEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ConstraintDefEntity> findOne(Long id);

    /**
     * Delete the "id" constraintDefEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

package com.sid.service;

import com.sid.domain.ConstraintEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing ConstraintEntity.
 */
public interface ConstraintEntityService {

    /**
     * Save a constraintEntity.
     *
     * @param constraintEntity the entity to save
     * @return the persisted entity
     */
    ConstraintEntity save(ConstraintEntity constraintEntity);

    /**
     * Get all the constraintEntities.
     *
     * @return the list of entities
     */
    List<ConstraintEntity> findAll();


    /**
     * Get the "id" constraintEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ConstraintEntity> findOne(Long id);

    /**
     * Delete the "id" constraintEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

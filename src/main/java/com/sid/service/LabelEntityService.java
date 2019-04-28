package com.sid.service;

import com.sid.domain.LabelEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing LabelEntity.
 */
public interface LabelEntityService {

    /**
     * Save a labelEntity.
     *
     * @param labelEntity the entity to save
     * @return the persisted entity
     */
    LabelEntity save(LabelEntity labelEntity);

    /**
     * Get all the labelEntities.
     *
     * @return the list of entities
     */
    List<LabelEntity> findAll();


    /**
     * Get the "id" labelEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<LabelEntity> findOne(Long id);

    /**
     * Delete the "id" labelEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

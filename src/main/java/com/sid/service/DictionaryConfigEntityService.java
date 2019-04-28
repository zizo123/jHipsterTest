package com.sid.service;

import com.sid.domain.DictionaryConfigEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing DictionaryConfigEntity.
 */
public interface DictionaryConfigEntityService {

    /**
     * Save a dictionaryConfigEntity.
     *
     * @param dictionaryConfigEntity the entity to save
     * @return the persisted entity
     */
    DictionaryConfigEntity save(DictionaryConfigEntity dictionaryConfigEntity);

    /**
     * Get all the dictionaryConfigEntities.
     *
     * @return the list of entities
     */
    List<DictionaryConfigEntity> findAll();


    /**
     * Get the "id" dictionaryConfigEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DictionaryConfigEntity> findOne(Long id);

    /**
     * Delete the "id" dictionaryConfigEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

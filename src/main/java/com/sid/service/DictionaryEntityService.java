package com.sid.service;

import com.sid.domain.DictionaryEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing DictionaryEntity.
 */
public interface DictionaryEntityService {

    /**
     * Save a dictionaryEntity.
     *
     * @param dictionaryEntity the entity to save
     * @return the persisted entity
     */
    DictionaryEntity save(DictionaryEntity dictionaryEntity);

    /**
     * Get all the dictionaryEntities.
     *
     * @return the list of entities
     */
    List<DictionaryEntity> findAll();


    /**
     * Get the "id" dictionaryEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DictionaryEntity> findOne(Long id);

    /**
     * Delete the "id" dictionaryEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

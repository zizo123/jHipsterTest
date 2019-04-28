package com.sid.service;

import com.sid.domain.MessageEntity;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing MessageEntity.
 */
public interface MessageEntityService {

    /**
     * Save a messageEntity.
     *
     * @param messageEntity the entity to save
     * @return the persisted entity
     */
    MessageEntity save(MessageEntity messageEntity);

    /**
     * Get all the messageEntities.
     *
     * @return the list of entities
     */
    List<MessageEntity> findAll();


    /**
     * Get the "id" messageEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<MessageEntity> findOne(Long id);

    /**
     * Delete the "id" messageEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

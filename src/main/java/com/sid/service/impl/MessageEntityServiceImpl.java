package com.sid.service.impl;

import com.sid.service.MessageEntityService;
import com.sid.domain.MessageEntity;
import com.sid.repository.MessageEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing MessageEntity.
 */
@Service
@Transactional
public class MessageEntityServiceImpl implements MessageEntityService {

    private final Logger log = LoggerFactory.getLogger(MessageEntityServiceImpl.class);

    private final MessageEntityRepository messageEntityRepository;

    public MessageEntityServiceImpl(MessageEntityRepository messageEntityRepository) {
        this.messageEntityRepository = messageEntityRepository;
    }

    /**
     * Save a messageEntity.
     *
     * @param messageEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public MessageEntity save(MessageEntity messageEntity) {
        log.debug("Request to save MessageEntity : {}", messageEntity);
        return messageEntityRepository.save(messageEntity);
    }

    /**
     * Get all the messageEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<MessageEntity> findAll() {
        log.debug("Request to get all MessageEntities");
        return messageEntityRepository.findAll();
    }


    /**
     * Get one messageEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<MessageEntity> findOne(Long id) {
        log.debug("Request to get MessageEntity : {}", id);
        return messageEntityRepository.findById(id);
    }

    /**
     * Delete the messageEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete MessageEntity : {}", id);
        messageEntityRepository.deleteById(id);
    }
}

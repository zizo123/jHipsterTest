package com.sid.service.impl;

import com.sid.service.AttributEntityService;
import com.sid.domain.AttributEntity;
import com.sid.repository.AttributEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing AttributEntity.
 */
@Service
@Transactional
public class AttributEntityServiceImpl implements AttributEntityService {

    private final Logger log = LoggerFactory.getLogger(AttributEntityServiceImpl.class);

    private final AttributEntityRepository attributEntityRepository;

    public AttributEntityServiceImpl(AttributEntityRepository attributEntityRepository) {
        this.attributEntityRepository = attributEntityRepository;
    }

    /**
     * Save a attributEntity.
     *
     * @param attributEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public AttributEntity save(AttributEntity attributEntity) {
        log.debug("Request to save AttributEntity : {}", attributEntity);
        return attributEntityRepository.save(attributEntity);
    }

    /**
     * Get all the attributEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<AttributEntity> findAll() {
        log.debug("Request to get all AttributEntities");
        return attributEntityRepository.findAll();
    }


    /**
     * Get one attributEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<AttributEntity> findOne(Long id) {
        log.debug("Request to get AttributEntity : {}", id);
        return attributEntityRepository.findById(id);
    }

    /**
     * Delete the attributEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete AttributEntity : {}", id);
        attributEntityRepository.deleteById(id);
    }
}

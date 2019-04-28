package com.sid.service.impl;

import com.sid.service.DictionaryConfigEntityService;
import com.sid.domain.DictionaryConfigEntity;
import com.sid.repository.DictionaryConfigEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing DictionaryConfigEntity.
 */
@Service
@Transactional
public class DictionaryConfigEntityServiceImpl implements DictionaryConfigEntityService {

    private final Logger log = LoggerFactory.getLogger(DictionaryConfigEntityServiceImpl.class);

    private final DictionaryConfigEntityRepository dictionaryConfigEntityRepository;

    public DictionaryConfigEntityServiceImpl(DictionaryConfigEntityRepository dictionaryConfigEntityRepository) {
        this.dictionaryConfigEntityRepository = dictionaryConfigEntityRepository;
    }

    /**
     * Save a dictionaryConfigEntity.
     *
     * @param dictionaryConfigEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public DictionaryConfigEntity save(DictionaryConfigEntity dictionaryConfigEntity) {
        log.debug("Request to save DictionaryConfigEntity : {}", dictionaryConfigEntity);
        return dictionaryConfigEntityRepository.save(dictionaryConfigEntity);
    }

    /**
     * Get all the dictionaryConfigEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<DictionaryConfigEntity> findAll() {
        log.debug("Request to get all DictionaryConfigEntities");
        return dictionaryConfigEntityRepository.findAll();
    }


    /**
     * Get one dictionaryConfigEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<DictionaryConfigEntity> findOne(Long id) {
        log.debug("Request to get DictionaryConfigEntity : {}", id);
        return dictionaryConfigEntityRepository.findById(id);
    }

    /**
     * Delete the dictionaryConfigEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete DictionaryConfigEntity : {}", id);
        dictionaryConfigEntityRepository.deleteById(id);
    }
}

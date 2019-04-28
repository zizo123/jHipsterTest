package com.sid.service.impl;

import com.sid.service.ClientEntityService;
import com.sid.domain.ClientEntity;
import com.sid.repository.ClientEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing ClientEntity.
 */
@Service
@Transactional
public class ClientEntityServiceImpl implements ClientEntityService {

    private final Logger log = LoggerFactory.getLogger(ClientEntityServiceImpl.class);

    private final ClientEntityRepository clientEntityRepository;

    public ClientEntityServiceImpl(ClientEntityRepository clientEntityRepository) {
        this.clientEntityRepository = clientEntityRepository;
    }

    /**
     * Save a clientEntity.
     *
     * @param clientEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public ClientEntity save(ClientEntity clientEntity) {
        log.debug("Request to save ClientEntity : {}", clientEntity);
        return clientEntityRepository.save(clientEntity);
    }

    /**
     * Get all the clientEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<ClientEntity> findAll() {
        log.debug("Request to get all ClientEntities");
        return clientEntityRepository.findAll();
    }


    /**
     * Get one clientEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ClientEntity> findOne(Long id) {
        log.debug("Request to get ClientEntity : {}", id);
        return clientEntityRepository.findById(id);
    }

    /**
     * Delete the clientEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ClientEntity : {}", id);
        clientEntityRepository.deleteById(id);
    }
}

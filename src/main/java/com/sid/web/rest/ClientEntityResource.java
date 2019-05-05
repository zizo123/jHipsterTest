package com.sid.web.rest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.domain.ClientEntity;
import com.sid.service.ClientEntityService;
import com.sid.web.rest.errors.BadRequestAlertException;
import com.sid.web.rest.util.HeaderUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * REST controller for managing ClientEntity.
 */
@Api("This is my Client Controller")
@RestController
@RequestMapping("/api")
public class ClientEntityResource {

    private final Logger log = LoggerFactory.getLogger(ClientEntityResource.class);

    private static final String ENTITY_NAME = "clientEntity";

    private final ClientEntityService clientEntityService;

    public ClientEntityResource(ClientEntityService clientEntityService) {
        this.clientEntityService = clientEntityService;
    }

    /**
     * POST  /client-entities : Create a new clientEntity.
     *
     * @param clientEntity the clientEntity to create
     * @return the ResponseEntity with status 201 (Created) and with body the new clientEntity, or with status 400 (Bad Request) if the clientEntity has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/client-entities")
    public ResponseEntity<ClientEntity> createClientEntity(@RequestBody ClientEntity clientEntity) throws URISyntaxException {
        log.debug("REST request to save ClientEntity : {}", clientEntity);
        if (clientEntity.getId() != null) {
            throw new BadRequestAlertException("A new clientEntity cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ClientEntity result = clientEntityService.save(clientEntity);
        return ResponseEntity.created(new URI("/api/client-entities/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /client-entities : Updates an existing clientEntity.
     *
     * @param clientEntity the clientEntity to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated clientEntity,
     * or with status 400 (Bad Request) if the clientEntity is not valid,
     * or with status 500 (Internal Server Error) if the clientEntity couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/client-entities")
    public ResponseEntity<ClientEntity> updateClientEntity(@RequestBody ClientEntity clientEntity) throws URISyntaxException {
        log.debug("REST request to update ClientEntity : {}", clientEntity);
        if (clientEntity.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ClientEntity result = clientEntityService.save(clientEntity);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, clientEntity.getId().toString()))
            .body(result);
    }

    /**
     * GET  /client-entities : get all the clientEntities.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of clientEntities in body
     */
    @ApiOperation(value = "This will get a list of clients.", notes = "These are my notes about the API.")
    @GetMapping("/client-entities")
    public List<ClientEntity> getAllClientEntities() {
        log.debug("REST request to get all ClientEntities");
        return clientEntityService.findAll();
    }

    /**
     * GET  /client-entities/:id : get the "id" clientEntity.
     *
     * @param id the id of the clientEntity to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the clientEntity, or with status 404 (Not Found)
     */
    @GetMapping("/client-entities/{id}")
    public ResponseEntity<ClientEntity> getClientEntity(@PathVariable Long id) {
        log.debug("REST request to get ClientEntity : {}", id);
        Optional<ClientEntity> clientEntity = clientEntityService.findOne(id);
        return ResponseUtil.wrapOrNotFound(clientEntity);
    }

    /**
     * DELETE  /client-entities/:id : delete the "id" clientEntity.
     *
     * @param id the id of the clientEntity to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/client-entities/{id}")
    public ResponseEntity<Void> deleteClientEntity(@PathVariable Long id) {
        log.debug("REST request to delete ClientEntity : {}", id);
        clientEntityService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

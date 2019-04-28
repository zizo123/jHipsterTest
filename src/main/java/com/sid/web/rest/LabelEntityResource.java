package com.sid.web.rest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.domain.LabelEntity;
import com.sid.service.LabelEntityService;
import com.sid.web.rest.errors.BadRequestAlertException;
import com.sid.web.rest.util.HeaderUtil;

/**
 * REST controller for managing LabelEntity.
 */
@RestController
@RequestMapping("/api")
public class LabelEntityResource {

    private final Logger log = LoggerFactory.getLogger(LabelEntityResource.class);

    private static final String ENTITY_NAME = "labelEntity";

    private final LabelEntityService labelEntityService;

    public LabelEntityResource(LabelEntityService labelEntityService) {
        this.labelEntityService = labelEntityService;
    }

    /**
     * POST  /label-entities : Create a new labelEntity.
     *
     * @param labelEntity the labelEntity to create
     * @return the ResponseEntity with status 201 (Created) and with body the new labelEntity, or with status 400 (Bad Request) if the labelEntity has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/label-entities")
    public ResponseEntity<LabelEntity> createLabelEntity(@RequestBody LabelEntity labelEntity) throws URISyntaxException {
        log.debug("REST request to save LabelEntity : {}", labelEntity);
        if (labelEntity.getId() != null) {
            throw new BadRequestAlertException("A new labelEntity cannot already have an ID", ENTITY_NAME, "idexists");
        }
        LabelEntity result = labelEntityService.save(labelEntity);
        return ResponseEntity.created(new URI("/api/label-entities/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /label-entities : Updates an existing labelEntity.
     *
     * @param labelEntity the labelEntity to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated labelEntity,
     * or with status 400 (Bad Request) if the labelEntity is not valid,
     * or with status 500 (Internal Server Error) if the labelEntity couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/label-entities")
    public ResponseEntity<LabelEntity> updateLabelEntity(@RequestBody LabelEntity labelEntity) throws URISyntaxException {
        log.debug("REST request to update LabelEntity : {}", labelEntity);
        if (labelEntity.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        LabelEntity result = labelEntityService.save(labelEntity);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, labelEntity.getId().toString()))
            .body(result);
    }

    /**
     * GET  /label-entities : get all the labelEntities.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of labelEntities in body
     */
    @GetMapping("/label-entities")
    public List<LabelEntity> getAllLabelEntities() {
        log.debug("REST request to get all LabelEntities");
        return labelEntityService.findAll();
    }

    /**
     * GET  /label-entities/:id : get the "id" labelEntity.
     *
     * @param id the id of the labelEntity to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the labelEntity, or with status 404 (Not Found)
     */
    @GetMapping("/label-entities/{id}")
    public ResponseEntity<LabelEntity> getLabelEntity(@PathVariable Long id) {
        log.debug("REST request to get LabelEntity : {}", id);
        Optional<LabelEntity> labelEntity = labelEntityService.findOne(id);
        return wrapOrNotFound(labelEntity);
    }

    private ResponseEntity<LabelEntity> wrapOrNotFound(Optional<LabelEntity> labelEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * DELETE  /label-entities/:id : delete the "id" labelEntity.
     *
     * @param id the id of the labelEntity to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/label-entities/{id}")
    public ResponseEntity<Void> deleteLabelEntity(@PathVariable Long id) {
        log.debug("REST request to delete LabelEntity : {}", id);
        labelEntityService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
    
    static  ResponseEntity<LabelEntity> wrapOrNotFound(Optional<LabelEntity> maybeResponse, HttpHeaders header) {
        return maybeResponse.map(response -> ResponseEntity.ok().headers(header).body(response))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

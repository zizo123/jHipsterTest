package com.sid.repository;

import com.sid.domain.PropertyEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PropertyEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PropertyEntityRepository extends JpaRepository<PropertyEntity, Long> {

}

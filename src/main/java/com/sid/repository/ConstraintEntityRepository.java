package com.sid.repository;

import com.sid.domain.ConstraintEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ConstraintEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConstraintEntityRepository extends JpaRepository<ConstraintEntity, Long> {

}

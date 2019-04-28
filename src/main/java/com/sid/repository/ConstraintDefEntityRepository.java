package com.sid.repository;

import com.sid.domain.ConstraintDefEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ConstraintDefEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConstraintDefEntityRepository extends JpaRepository<ConstraintDefEntity, Long> {

}

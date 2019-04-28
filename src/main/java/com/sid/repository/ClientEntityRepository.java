package com.sid.repository;

import com.sid.domain.ClientEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ClientEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientEntityRepository extends JpaRepository<ClientEntity, Long> {

}

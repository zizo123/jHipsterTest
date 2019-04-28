package com.sid.repository;

import com.sid.domain.MessageEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MessageEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MessageEntityRepository extends JpaRepository<MessageEntity, Long> {

}

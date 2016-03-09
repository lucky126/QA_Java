package com.lucky.repository;

import com.lucky.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lucky on 2016/3/7.
 */
@Repository // 添加注解
public interface BoardRepository extends JpaRepository<BoardEntity, Integer>{
}

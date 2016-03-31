package com.lucky.repository;

import com.lucky.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by lucky on 2016/3/7.
 */
@Repository // 添加注解
public interface BoardRepository extends JpaRepository<BoardEntity, Integer>{

    @Query("SELECT b FROM BoardEntity b WHERE b.parentId =0")
    public List<BoardEntity> GetParentBoards();

    @Query("SELECT b FROM BoardEntity b WHERE b.parentId =0 AND b.isPublic = 1")
    public List<BoardEntity> GetParentPublicBoards();

    @Query("SELECT b FROM BoardEntity b WHERE b.parentId =?1")
    public List<BoardEntity> GetBoardsByParentID(Integer id);
}

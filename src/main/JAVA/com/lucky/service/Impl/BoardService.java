package com.lucky.service.Impl;

import com.lucky.model.BoardEntity;
import com.lucky.repository.BoardRepository;
import com.lucky.service.IBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Administrator on 2016/3/7.
 */
@Service
public class BoardService implements IBoardService {
    // 自动装配
    @Autowired
    private BoardRepository boardRepository;

    @PersistenceContext
    private EntityManager em;

    public List<BoardEntity> getParentBoards(boolean isLgoin)
    {
        List<BoardEntity> list;

        if(isLgoin)
            list = boardRepository.GetParentBoards();
        else
            list = boardRepository.GetParentPublicBoards();

        return list;
    }

    public List<BoardEntity> getBoardsByParentID(Integer id)
    {
        return  boardRepository.GetBoardsByParentID(id);
    }
}

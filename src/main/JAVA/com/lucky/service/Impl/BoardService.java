package com.lucky.service.Impl;

import com.lucky.model.BoardEntity;
import com.lucky.repository.BoardRepository;
import com.lucky.service.IBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/3/7.
 */
@Service
public class BoardService implements IBoardService {
    // 自动装配
    @Autowired
    private BoardRepository boardRepository;

    public List<BoardEntity> getBoard()
    {
        List<BoardEntity> list = boardRepository.findAll();

        return list;
    }
}

package com.lucky.service;

import com.lucky.model.BoardEntity;

import java.util.List;

/**
 * Created by lucky on 2016/3/7.
 */

public interface IBoardService {

    public List<BoardEntity> getParentBoards(boolean isLogin);

    public List<BoardEntity> getBoardsByParentID(Integer id);
}

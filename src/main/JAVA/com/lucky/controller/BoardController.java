package com.lucky.controller;

import com.lucky.model.BoardEntity;
import com.lucky.service.Impl.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Created by lucky on 2016/3/7.
 */
@RestController
public class BoardController extends BaseController {

    // 自动装配
    @Autowired
    private BoardService boardService;

    // 首页
    @RequestMapping(value = "/board/", method = RequestMethod.GET)
    public @ResponseBody List<BoardEntity> getParentBoards() {

        List<BoardEntity> list = boardService.getParentBoards(false);

        return list;
    }

    // 版区列表
    @RequestMapping(value = "/board/{bid}", method = RequestMethod.GET)
    public @ResponseBody List<BoardEntity> getBoards(@RequestBody @PathVariable("bid") Integer bid){

        List<BoardEntity> list = boardService.getBoardsByParentID(bid);

        return list;
    }

}
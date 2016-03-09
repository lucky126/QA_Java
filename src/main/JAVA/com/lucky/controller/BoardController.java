package com.lucky.controller;

import com.lucky.model.BoardEntity;
import com.lucky.service.Impl.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value = "/board/{id}", method = RequestMethod.GET)
    public @ResponseBody List<BoardEntity> getBoard(@RequestBody @PathVariable("id") int id) {

        List<BoardEntity> list = boardService.getBoard();

        return list;
    }
/*
    // 版区列表
    @RequestMapping(value = "/board/{bid}", method = RequestMethod.GET)
    public String board(@PathVariable("bid") Integer bid, ModelMap modelMap){

        return "board";
    }
*/
}
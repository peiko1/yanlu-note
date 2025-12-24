package com.peikol.xiaohashu.search.controller;

import com.peikol.framework.biz.operationlog.aspect.ApiOperationLog;
import com.peikol.framework.common.response.PageResponse;
import com.peikol.xiaohashu.search.model.vo.SearchNoteReqVO;
import com.peikol.xiaohashu.search.model.vo.SearchNoteRspVO;
import com.peikol.xiaohashu.search.service.NoteService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@Slf4j
public class NoteController {

    @Resource
    private NoteService noteService;

    @PostMapping("/note")
    @ApiOperationLog(description = "搜索笔记")
    public PageResponse<SearchNoteRspVO> searchNote(@RequestBody @Validated SearchNoteReqVO searchNoteReqVO) {
        return noteService.searchNote(searchNoteReqVO);
    }

}

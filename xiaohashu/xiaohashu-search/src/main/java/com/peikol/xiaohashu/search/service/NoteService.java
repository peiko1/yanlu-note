package com.peikol.xiaohashu.search.service;

import com.peikol.framework.common.response.PageResponse;
import com.peikol.xiaohashu.search.model.vo.SearchNoteReqVO;
import com.peikol.xiaohashu.search.model.vo.SearchNoteRspVO;

public interface NoteService {

    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);
}

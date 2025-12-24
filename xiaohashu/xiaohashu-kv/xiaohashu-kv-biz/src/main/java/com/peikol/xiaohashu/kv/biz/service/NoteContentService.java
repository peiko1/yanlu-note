package com.peikol.xiaohashu.kv.biz.service;

import com.peikol.framework.common.response.Response;
import com.peikol.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import com.peikol.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import com.peikol.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import com.peikol.xiaohashu.kv.dto.rsp.FindNoteContentRspDTO;


public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);


    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);


    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}

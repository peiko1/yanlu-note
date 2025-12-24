package com.peikol.xiaohashu.kv.biz.service;

import com.peikol.framework.common.response.Response;
import com.peikol.xiaohashu.kv.dto.req.BatchAddCommentContentReqDTO;
import com.peikol.xiaohashu.kv.dto.req.BatchFindCommentContentReqDTO;

public interface CommentContentService {


    /**
     * 批量添加评论内容
     * @param batchAddCommentContentReqDTO
     * @return
     */
    Response<?> batchAddCommentContent(BatchAddCommentContentReqDTO batchAddCommentContentReqDTO);

    /**
     * 批量查询评论内容
     * @param batchFindCommentContentReqDTO
     * @return
     */
    Response<?> batchFindCommentContent(BatchFindCommentContentReqDTO batchFindCommentContentReqDTO);
}

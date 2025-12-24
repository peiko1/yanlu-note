package com.peikol.xiaohashu.search.service;

import com.peikol.framework.common.response.PageResponse;
import com.peikol.xiaohashu.search.model.vo.SearchUserReqVO;
import com.peikol.xiaohashu.search.model.vo.SearchUserRspVO;

public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);
}

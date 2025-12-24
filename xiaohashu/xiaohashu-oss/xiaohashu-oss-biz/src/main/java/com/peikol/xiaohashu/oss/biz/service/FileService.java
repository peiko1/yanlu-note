package com.peikol.xiaohashu.oss.biz.service;

import com.peikol.framework.common.response.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: peiko1
 * @date: 2025/11/30 17:12
 * @version: v1.0.0
 * @description: TODO
 **/
public interface FileService {

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    Response<?> uploadFile(MultipartFile file);
}

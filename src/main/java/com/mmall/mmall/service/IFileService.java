package com.mmall.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/3
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}

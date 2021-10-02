package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/3
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}

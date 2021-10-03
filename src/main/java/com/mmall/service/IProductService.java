package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/3
 */
public interface IProductService {

    ServerResponse saveORUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}

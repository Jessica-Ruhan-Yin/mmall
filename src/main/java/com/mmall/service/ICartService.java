package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/4
 */
public interface ICartService {

    ServerResponse<CartVo> add(Integer userId, Integer count, Integer productId);
}

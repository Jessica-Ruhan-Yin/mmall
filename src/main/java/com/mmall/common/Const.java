package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/2
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface ProductListOrderBy {
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "proce_asc");
    }

    public interface Cart {
        int CHECKED = 1;//购物车中选中状态
        int UN_CHEKED = 0;//购物车中未被选中的状态

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; //管理员
    }

    public enum ProductStatusEnum {
        ON_SALE(1, "在线");

        private int code;
        private String value;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

}

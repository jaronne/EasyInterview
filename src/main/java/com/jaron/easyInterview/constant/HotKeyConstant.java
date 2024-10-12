package com.jaron.easyInterview.constant;

/**
 * HotKey 常量
 */
public interface HotKeyConstant {

    /**
     * 用户签到记录的 HotKey 前缀
     */
    String Hot_KEY_PREFIX = "bank_detail_";

    /**
     * 获取 HotKey
     * @param id
     * @return
     */
    static String getHotKey(long id) {
        return Hot_KEY_PREFIX + id;
    }
}

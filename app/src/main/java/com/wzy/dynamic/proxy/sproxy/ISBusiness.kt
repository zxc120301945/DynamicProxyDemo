package com.wzy.dynamic.proxy.sproxy

/**
 * @author WZY
 * @since 1
 * @date 2020/03/25
 * 业务接口
 */
interface ISBusiness {

    /**
     * 买mac
     */
    fun buyMac(name:String)

    /**
     * 买水果
     */
    fun buyFruit(name:String,fruit: String)
}
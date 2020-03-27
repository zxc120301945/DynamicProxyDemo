package com.wzy.dynamic.proxy.sproxy

/**
 * @author WZY
 * @since 1
 * @date 2020/03/25
 */
class SBusiness : ISBusiness {
    override fun buyFruit(name: String,fruit: String) {
        println("帮${name}买了一斤$fruit")
    }

    override fun buyMac(name: String) {
        println("帮${name}去买了一台mac")
    }
}
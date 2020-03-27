package com.wzy.dynamic.proxy.sproxy

/**
 * @author WZY
 * @since 1
 * @date 2020/03/25
 */
class SProxy :ISBusiness{
    override fun buyFruit(name: String,fruit: String) {
        //真实做事情的对象
        val business = SBusiness()
        business.buyFruit(name,fruit)
        //代理对象做额外的操作
        fruitWrap()
    }

    override fun buyMac(name:String) {
        //真实做事情的对象
        val business = SBusiness()
        business.buyMac(name)
        //代理对象做额外的操作
        giftWrap()
    }

    private fun giftWrap() {
        println("商品包装")
    }

    private fun fruitWrap() {
        println("水果打包")
    }
}
package com.kotlin.demo.P.base

//presenter的上层接口
interface IBasePersenter {
    //试图离开之后，做view和model层的一些重置、销毁处理
    fun unAttachView()
}
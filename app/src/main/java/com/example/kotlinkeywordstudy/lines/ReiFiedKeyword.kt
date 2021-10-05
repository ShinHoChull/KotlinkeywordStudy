package com.example.kotlinkeywordstudy.lines

import android.view.View


class ReiFiedKeyword(view : View) {

    init {
        view.clickT {
            println("Hello Reified~")
        }
    }

    /**
        view를 T로 캐스팅하려고 할 때 발생하는 경고 메시지이다.
        이는 inline 함수에서 특정 타입을 가졌는지 판단할 수 없기 때문이다.
        이럴 때 reified 키워드를 사용한다.
     */
    inline fun <T : View> T.click(crossinline block: (T) -> UInt) {
        setOnClickListener {
            block(it as T)
        }
    }


    private inline fun <reified T: View> T.clickT(crossinline block: (T) -> Unit) {
        setOnClickListener { view ->
            block(view as T)
        }
    }




}
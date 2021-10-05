package com.example.kotlinkeywordstudy.lines

import android.view.View

class CrossLineKeyword(view : View) {

    init {
        view.click {
            println("hello world~")
        }
    }

    /*
    * 아래의 코드는 View의 클릭 이벤트를 보다 쉽게 연결해주기 위한 확장 함수다.
    * error
    */

//    inline fun View.click(block : (View) -> UInt) {
//        setOnClickListener {
//
//            //block(it)
//        }
//    }

    /**
     * 함수를 인자로 받아 setOnClickListener 내부에서 호출해야 하는데 위의 코드는 동작하지 않는다.
     * inline 함수는 인자로 받은 함수를 다른 실행 컨텍스트를 통해 호출할 때는 함수 안에서 비-로컬 흐름을 제어할 수 없다.
     * 이럴 때 사용하는 것이 cross inline 키워드다.
     */
    private inline fun View.click(crossinline block: (View) -> Unit) {
        setOnClickListener { view ->
            block(view)
        }
    }


}
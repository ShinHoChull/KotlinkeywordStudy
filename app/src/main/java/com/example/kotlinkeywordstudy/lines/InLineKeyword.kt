package com.example.kotlinkeywordstudy.lines

/**
 *  inline 함수는 일반 함수보다 성능이 좋다.
 *  하지만 inline 함수는 내부적으로 코드를 복사하기 때문에,
 *  인자로 전달받은 함수는 다른 함수로 전달되거나 참조할 수 없다.
 */
class InLineKeyword {

    init {
        callFunc()
        doSomething({ println("1") }, { println("2") })
    }

   // O
    private inline fun doSomething(action: () -> Unit) {
        action()
    }

    // X
    private inline fun doSomething(action: () -> Unit, action2: () -> Unit) {
        action()

        //전달 X ->error
        //anotherFunc(action2)
    }

    fun anotherFunc(action: () -> Unit) {
        action()
    }


    private fun callFunc() {
        doSomething {
            println("문자열 출력!")
        }
    }
}




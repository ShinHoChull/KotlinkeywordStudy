package com.example.kotlinkeywordstudy.lines

/**
 * 인자 앞에 noinline 키워드를 붙이면 해당 인자는 inline에서 제외된다.
 * 따라서 noinline 키워드가 붙은 인자는 다른 함수의 인자로 전달하는 것이 가능하다.
 */
class NoInLineKeyword {

    init {
        doSomething(
            { println("fun1")}
            ,{ println("fun2")}
        )
    }

    private inline fun doSomething(action1: () -> Unit
                           , noinline action2: () -> Unit) {
        action1()

        //인자전달 O
        anotherFunc(action2)
    }

    //인자 전달 받은 후 출력 O
    fun anotherFunc(action: () -> Unit) = action()

}
package com.example.kotlinkeywordstudy

class Other {

    //클래스를 상속하는 객체 .

    init {
        dump()
    }

    private fun dump () {

        val obj : DumpClass = object : DumpClass(19, "신용철" , "불광동 326-14") {
            override fun print() {
                //부모 함수에있는 값을 사용.
                super.print()
            }
        }
        obj.print()
    }
}

//open키워드로 붙여 해주어야지 상속 가능.
open class DumpClass (val age : Int, val add : String, val name : String){
    open fun print() {
        println("나의 이름은 $name($age 세) 이고 사는 곳 은 $add 이다.")
    }

}
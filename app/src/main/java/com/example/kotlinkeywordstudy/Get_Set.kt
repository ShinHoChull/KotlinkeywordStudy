package com.example.kotlinkeywordstudy

class Get_Set {

    var a: String = ""
        set(value) {
            field = value

            if (field.length > 3) {
                field = value + "abc"
            }
        }


    init {
        a = "~~~"
        println(a)
        a = "Hello world~"
        println(a)
    }


}
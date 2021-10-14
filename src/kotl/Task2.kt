package kotl

import com.sun.tools.attach.AgentInitializationException

fun main() {

    val person = Person()
    val person1 = Person("Tetiana", 23)

    person1.move()
    person1.talk()

    println(person)
    println("${person1.fullName} ${person1.age}")
}

open class Person{
    val fullName: String
    val age: Int

    constructor(fullName: String, age: Int){
        this.fullName = fullName
        this.age = age
    }

    constructor(){
        this.fullName = ""
        this.age = 0
    }

    fun move(){
        println("$fullName говорит привет")
    }

    fun talk(){
        println("$fullName говорит пока")
    }

}
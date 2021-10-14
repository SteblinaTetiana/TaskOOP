package kotl

fun main() {
    val phone = Phone(380635478, "samsung", 156)
    val phone1 = Phone(38068547, "nokia", 185)
    val phone2 = Phone(38096547, "lg", 214)

    println("${phone.number}  ${phone.model}  ${phone.weight}")
    println("${phone1.number}  ${phone1.model}  ${phone1.weight}")
    println("${phone2.number}  ${phone2.model}  ${phone2.weight}")

    println(phone.receiveCall("Маша"))
    println(phone1.receiveCall("Саша"))
    println(phone2.receiveCall("Ваня"))

    println(phone.receiveCall("Влад", 25458))
    println(phone1.receiveCall("Таня", 4522.0))
   
}
class Phone {
    var number: Int
    var model: String
    var weight: Int

    constructor(number: Int, model: String, weight:Int): this(number, model)  {

    }

    constructor(number: Int, model: String)  {
        this.number = number
        this.model = model
        this.weight = 0
    }

    constructor(){
        this.number = 0
        this.model = " "
        this.weight = 0
    }

    fun receiveCall(name: String){
        println("Звонит $name номер $number")
    }

    fun receiveCall(name: String, number: Int){
        println("Звонит $name номер $number")
    }

    fun receiveCall(name: String, number: Double){
        println("Звонит $name номер $number")
    }
}

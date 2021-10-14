package kotl

fun main() {
    val dog = Dog("собака","м'ясо", "Черкасах", "Овчарка")
    val cat = Cat("кіт","рибу", "Києві", "Общительные и компанийские")
    val horse = Horse("кінь","моркву", "Одесі", "Домашний" )

    val animals = arrayOf(dog, cat, horse)

    val veterinarian = Veterinarian("ветеренара Стаса")

    for (a in animals){
        println("Відвідавши ${veterinarian.name}")
       veterinarian.treatAnimal(a)

    }
}

open class Animal{
    val name: String
    val food: String
    val location: String

    constructor(name: String, food: String, location: String){
        this.food = food
        this.location = location
        this.name = name
    }

    open fun makeNoise(){
        println("Такое-то животное спит")
    }

    open fun eat(){

    }

    fun sleep(){

    }
}

class Dog:Animal{

     val breed:String
    constructor(name: String, food: String, location: String, breed:String) : super(food,location, name) {
     this.breed = breed
    }

    override fun makeNoise(){
        println("Такое-то животное спит")
    }

    override fun eat(){

    }

}

class Cat:Animal{
    val character: String
    constructor(name: String, food: String, location: String,  character: String) : super(food,location,name) {
     this.character=character
    }

    override fun makeNoise(){
        println("Такое-то животное спит")
    }

    override fun eat(){

    }
}

class Horse:Animal{

    val view:String
    constructor(name: String, food: String, location: String, view:String) : super(food,location, name) {
     this.view = view
    }

    override fun makeNoise(){
        println("Такое-то животное спит")
    }

    override fun eat(){

    }

}

class Veterinarian(val name: String){


    fun treatAnimal(animal: Animal){
        println("Отримав в ${animal.food} ${animal.location} ${animal.name}")
    }
}
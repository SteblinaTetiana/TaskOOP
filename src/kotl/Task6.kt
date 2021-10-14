package kotl


fun main() {
    val student = Student("Иван", "Сидоров", "7-Б", 5.0)
    val aspirant = Aspirant("Петр", "Иванов", "6-А", 4.5, "Научная работа")
    val aspirant1:Student = Aspirant("Антон", "Петров", "5-Г", 5.0, "Научная работа 2")

    val students = arrayOf(student, aspirant, aspirant1)
    for (s:Student in students){
        s.scholarship()
    }
}

open class Student{
    val firstName:String
    val lastName:String
    val group:String
    val averageMark:Double

    constructor(firstName: String,lastName: String,group: String, averageMark: Double){
        this.firstName = firstName
        this.lastName = lastName
        this.group = group
        this.averageMark = averageMark
    }

    open fun scholarship(){
        if (averageMark==5.0){
            println("Сума 100 грн")
        }else{
            println("Сума 80 грн")
        }
    }

}

class Aspirant : Student{
    val scientificWork:String

    constructor(firstName: String,lastName: String,group: String, averageMark: Double, scientificWork:String) :
            super(firstName,lastName, group, averageMark) {
        this.scientificWork = scientificWork
    }

    override fun scholarship(){
        if (averageMark==5.0){
            println("Сума 200 грн")
        }else{
            println("Сума 180 грн")
        }
    }


}
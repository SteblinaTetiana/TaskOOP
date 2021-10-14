package kotl


fun main() {
    val toyDriver = Driver("Иванов В.М.", 15)
    val toyEngine = Engine("60", "Toyota")
    val car = Car("Toyota", "C", 4500.00, toyDriver, toyEngine)

    val lorryDriver = Driver("Петров В.В.", 20)
    val lorryEngine = Engine("30", "LorryEngine")
    val lorry = Lorry(", Грузовик", "D", 8000.0, lorryDriver, lorryEngine, 70.0)

    val sportDriver = Driver("Сидоров В.В.", 25)
    val sportEngine = Engine("80", "SportEngine")
    val sportCar = SportCar(", SportCar", "C", 3500.0, sportDriver, sportEngine, 200.0)

    println(car)
    println(lorry)
    println(sportCar)
}

open class Car{
    val brand: String
    val classCar: String
    val weight: Double
    val driver: Driver
    val engine: Engine

    constructor(brand:String, classCar: String, weight: Double, driver: Driver, engine: Engine){
        this.brand = brand
        this.classCar = classCar
        this.weight = weight
        this.driver = driver
        this.engine = engine
    }

    fun start(){
        println("Поехали")
    }

    fun stop(){
        println("Останавливаемся")
    }

    fun turnRight(){
        println("Поворот направо")
    }

    fun turnLeft(){
        println("Поворот налево")
    }

    override fun toString(): String {
        return "$brand, $classCar, $weight, $driver, $engine"
    }

}

class Engine{
    val power: String
    val manufacturer: String

    constructor(power:String, manufacturer: String){
        this.power = power
        this.manufacturer = manufacturer
    }

    override fun toString(): String {
        return "$power, $manufacturer"
    }
}


class Driver: Person{
    val experience: Int
    constructor(fullName: String, experience: Int){
        this.experience = experience
    }

    override fun toString(): String {
        return "$experience"
    }
}

class Lorry: Car{
    val carryingCapacity: Double
    constructor(brand:String, classCar: String, weight: Double, driver: Driver, engine: Engine, carryingCapacity: Double) :
            super(brand, classCar, weight, driver, engine) {
     this.carryingCapacity = carryingCapacity
    }

    override fun toString(): String {
        return "$carryingCapacity" + super.toString()
    }
}

class SportCar : Car{
    val speed: Double
    constructor(brand:String, classCar: String, weight: Double, driver: Driver, engine: Engine, speed: Double) :
            super(brand, classCar, weight, driver, engine) {
        this.speed = speed
   }

    override fun toString(): String {
        return "$speed" + super.toString()
    }
}
package kotl

fun main() {

    val circle = Circle("Коло","Blue", 12.0)
    val rectangle = Rectangle("Прямокутник","Black", 25.0)

    circle.draw()
    rectangle.draw()

    val shape = arrayOf(circle, rectangle)
    for (figure in shape) {
        figure.draw()
        println("$shape намальовано")
    }
}

abstract class Shape(val color:String){

   abstract fun draw()

    open fun equals(){
    }
}

class Circle(name:String, color: String, coordinates:Double): Shape(color){
    override fun draw() {
    }

    override fun equals(){
    }
}

class Rectangle(name:String, color: String, coordinates:Double):Shape(color){
    override fun draw() {
    }

    override fun equals(){
    }
}
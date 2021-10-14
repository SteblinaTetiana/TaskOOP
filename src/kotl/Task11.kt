package kotl

fun main() {

    val circle = Circle("Blue", 12.0)
    val rectangle = Rectangle("Black", 25.0)

    circle.draw()
    rectangle.draw()

    val shape = arrayOf(circle, rectangle)
    for (figure in shape) {
        figure.draw()
    }
}

abstract class Shape(val color:String){

   abstract fun draw()

    open fun equals(){
    }
}

class Circle(color: String, coordinates:Double): Shape(color){
    override fun draw() {
    }

    override fun equals(){
    }
}

class Rectangle(color: String, coordinates:Double):Shape(color){
    override fun draw() {
    }

    override fun equals(){
    }
}
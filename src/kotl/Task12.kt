package kotl

fun main() {

    val category3 = Category("Категория3")
    val category1 = Category("Категория1")
    val category2 = Category("Категория2")

    val user = User("t.steb", "gfdtws2345")



}

class Products{
    val name:String
    val price: Int
    val rating: Double

    constructor(name: String, price:Int, rating:Double){
        this.name = name
        this.price = price
        this.rating = rating
    }

    override fun toString(): String {
        return "[name=$name, price=$price]"
    }

}

class Category{
    val name:String
    var arrayProd = arrayOf<Products>()

    constructor(name: String){
        this.name = name
    }
}

class Basket{

    var buyProd = mutableListOf<Products>()


}

class User{
    private var login:String
    private var pasword: String
    val basket = Basket()

    constructor(login:String, pasword: String){
        this.login = login
        this.pasword = pasword
    }
}



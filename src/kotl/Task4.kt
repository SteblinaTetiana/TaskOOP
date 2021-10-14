package kotl

fun main() {

    val reader1 = Reader("Петров В.В.", 1, "Економика", "16.10.1997", "+380635748659")
    val reader2 = Reader("Иванов В.В.", 2, "Економика", "19.01.1995", "+380505865659")
    val reader3 = Reader("Гриб М.В.", 3, "Економика", "01.01.1998", "+380967448687")
    val readers = arrayOf(reader1, reader2, reader3)

    val book1 = Book("Та що породжує вогонь", "С.Кінг")
    val book2 = Book("Хроніка нарнії", "К.С.Льюїс")
    val book3 = Book("Мандри убивці", "Р.Гобб")
    val books = listOf(book1, book2, book3)




    reader1.takeBook(3)
    reader2.takeBook(books)
    reader3.takeBook(book1, book2, book3)

    reader1.returnBook(1)
    reader2.returnBook(books)
    reader3.returnBook(book3,book1)

}

class Reader{
    val fio: String
    val number: Int
    val faculty: String
    val dob: String
    val phone: String

    constructor(fio: String, number: Int, faculty: String, dob: String, phone: String){
        this.fio = fio
        this.number = number
        this.faculty = faculty
        this.dob = dob
        this.phone = phone
    }

    fun takeBook(number: Int){
        println(fio + " взял " + number + " книги.")
    }

    fun takeBook(books: List<Book>){
        println(fio + " взял следующие книги: ")
        for(book in books){
            println(book.name)
        }
     println()
    }


    fun takeBook(vararg books: Book){
        println(fio + " взял следующие книги: ")
        for(book:kotl.Book in books){
            println(book.name + ", автор - " + book.author)
        }
        println()
    }

    fun returnBook(number: Int){
        println(fio + " вернул " + number + " книги.")
        }

    fun returnBook(books: List<Book>){
        println(fio + " вернул следующие книги: ")
        for(book in books){
            println(book.name)
        }
        println()
    }

    fun returnBook(vararg books: Book){
        println(fio + " вернул следующие книги: ")
        for(book:kotl.Book in books){
            println(book.name + ", автор - " + book.author)
        }
        println()
    }
}

class Book{
    val name: String
    val author: String

    constructor(name: String, author: String){
        this.name = name
        this.author = author
    }

}
package l08_exeptions
// throw - используется для явного создания нами кл исключения.

// Зачем создавать throw?
// У нас есть возможность создавать свои кастомные исключения под нашу конкретную программу
// Например будет проверять номер к вводит пользователь и если этот номер введен неверно, тода б бросать исключение
// Создание исключения: создаем клас и наследуемся от Exception

fun test () {
    val a = 10
    val b = 1

    try {
        println(a / b)
        hellow ()
        sendMessage()
    } catch (e: ArithmeticException) {
        //e.printStackTrace() // показывает как менялся стэк до exception
        println("Деление на ноль")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Наше исключение1")
    } catch (e: CharacterCodingException) {
        println("Наше исключение 2")
    }
   // throw IndexOutOfBoundsException() // для примеры указали этот exception, а так м любой
}

fun hellow(){
    // может содержать потенциально опасные строки кода
    throw ArrayIndexOutOfBoundsException()
}
fun sendMessage(){
    // может содержать потенциально опасные строки кода
    throw CharacterCodingException()
}


fun main() {
    test()
}


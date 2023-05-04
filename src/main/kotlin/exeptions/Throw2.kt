package exeptions
// здесь мы вручную кинули наш кастомный exception и так мы будем знать какая ошибка произошла

fun validate (tel: Long) {
    if (tel < 79_000_000_000) {
        throw Validatation("This is not phone number")
    }
}
fun main() {
    val tel = 79_166_209_645


    try{
        validate(78524567852)
    } catch (e: Validatation) {
        println(e.message)
    }



}
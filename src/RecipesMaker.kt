fun main(args: Array<String>) {
    println(":: Bienvenido a Recipe Maker ::")
    printMenu()
    var response: Int? = readLine()?.toInt() ?: 0

    do
    {
        when(response) {
            1 -> println("Elegiste hacer una receta")
            2 -> println("Elegiste ver recetas")
            3 -> println("Adios")
            else -> println("Debes Seleccionar alguna de las opciones del menu")
        }
        response = readLine()?.toInt() ?: 0
    } while (response != 3)
}

fun printMenu() {
    val options = """
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    println(options)
}
import kotlin.random.Random
fun main() {

    println("Я ЗАГАДАЛ ЧИСЛО ОТ 0 ДО 100")
    println("У ТЕБЯ 7 ПОПЫТОК ЕГО ОТГАДАТЬ")
    println("ПОЕХАЛИ!")

    val randomInteger = Random.nextInt(0,100)
    var ch = randomInteger
    var n = 1
    var a: String


    while (n <= 7) {
        try {
            a = readLine()!!
            ch = a.toInt()

            if (ch !in 0..100) {
                println("ВВЕДЕННОЕ ЧИСЛО НЕ В ДИАПАЗОНЕ ОТ 0 ДО 100")

            } else {
                ch = a.toInt()
                if
                        (ch == randomInteger) {
                    println("ВЫ УГАДАЛИ!")

                    break
                } else if (ch > randomInteger) {
                    n = n + 1
                    println("ВЫ НЕ УГАДАЛИ. ЗАГАДАННОЕ ЧИСЛО МЕНЬШЕ.")
                } else {
                    n = n + 1
                    println("ВЫ НЕ УГАДАЛИ. ЗАГАДАННОЕ ЧИСЛО БОЛЬШЕ.")
                }
            }


        } catch (e: NumberFormatException) {


            println("ВВЕДИТЕ ЦЕЛОЕ ЧИСЛО")

        }

    }


    if (ch != randomInteger)
        println("Я ЗАГАДАЛ ЧИСЛО $randomInteger")

}


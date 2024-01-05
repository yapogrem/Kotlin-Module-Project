import java.util.Scanner


class Navigation {
    fun choice_Menu(): Int {
        var i = 10
        while (i > 2) {
            println("Выберите пункт меню (целое число от 0 до 2)")
            val input = Scanner(System.`in`).nextLine()
            val number = input?.toIntOrNull()
            if (number != null) {
                i = number

                if (i > 2) {
                    println("Введенное число больше 2, повторите ввоод")
                }
            } else {
                println("Ввод не является целым числом")
            }
        }
        return i
    }
}

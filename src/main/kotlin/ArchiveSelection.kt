

class ArchiveSelection() {
    fun showstartMenu() {
        println("Список архивов:")
//        for (name) in Archive()
        println("0. Создать архив")
        println("1. Это мой уже созданный архив")
        println("2. Выход ")

        val input = InputMenu().choice_Menu()
        when (input) {
            0 ->
                CreateArchive().createArchive()
            1 -> println("x=1")
            2 -> println("x=2")
            else -> println("x!=2")
        }
    }
}
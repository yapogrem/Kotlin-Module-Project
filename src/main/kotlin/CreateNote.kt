class CreateNote {
    fun createNotes(inputName: String): Note {
        println("Введите текст заметки:")
        val inputText = CheckInputNote().checkInputNote()
        val note = Note(inputName, inputText)
        println("Создана заметка $inputName")
        return note
    }
}


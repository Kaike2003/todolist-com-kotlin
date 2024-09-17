import java.util.*

fun exibirTarefa(){
    println("Digite o id da tarefa:")
    val id: String = readln().toString()

    for (tarefa in listaTarefas) if (tarefa.id == UUID.fromString(id)) println(listaTarefas)

    menu()
}
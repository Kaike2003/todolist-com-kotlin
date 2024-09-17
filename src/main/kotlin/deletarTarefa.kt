import java.util.*


fun deletarTarefa(){
    println("Digite o id da tarefa")
    val id: String = readln().toString()

    listaTarefas.removeIf{x -> x.id == UUID.fromString(id)}
    println("===[Tarefa deletada]===")
    menu()

}
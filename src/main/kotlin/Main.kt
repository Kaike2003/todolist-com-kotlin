import java.util.UUID

data class Tarefa(
    val id: UUID,
    var nome: String,
    var descricao: String,
    var estado: Int,
)

val listaTarefas: MutableList<Tarefa> = mutableListOf<Tarefa>()

fun main(){
    menu()
}
import java.util.*


fun atualizarTarefa(){
    println("Digite o id da tarefa:")
    val id: String = readln().toString()

    for (tarefa in listaTarefas) if (tarefa.id == UUID.fromString(id)) {
        println("Digite o nome da tarefa:")
        val nome: String = readln().toString()
        println("Digite a descricao da tarefa")
        val descricao: String = readln().toString()
        println("Digite o estado da tarefa:")
        println("1 - COMPLETADO")
        println("2 - NAO COMPLETADO")
        println("3 - POR FAZER")
        val estado : Int = readln().toInt()
        tarefa.nome = nome
        tarefa.estado = estado
        tarefa.descricao = descricao
        println("===[Tarefa atualizada]===")
    }

    menu()
}


fun menu(){
    println("1 - Adicionar tarefa")
    println("2 - Exibir tarefas")
    println("3 - Exibir tarefa")
    println("4 - Atualizar tarefa")
    println("5 - Deletar tarefa")
    val opcao: Int = readln().toInt()

    when(opcao){
        1 -> adicionarTarefa()
        2 -> exibirTarefas()
        3 -> exibirTarefa()
        4 -> atualizarTarefa()
        5 -> deletarTarefa()
        else -> menu()
    }
}

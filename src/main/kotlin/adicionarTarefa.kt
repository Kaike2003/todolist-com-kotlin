import java.util.*


fun adicionarTarefa(){
    println("Digite o nome da tarefa:")
    val nome: String = readln().toString()
    println("Digite a descricao da tarefa:")
    val descricao: String = readln().toString()
    println("Digite o estado da tarefa:")
    println("1 - COMPLETADO")
    println("2 - NAO COMPLETADO")
    println("3 - POR FAZER")
    val estado : Int = readln().toInt()

    listaTarefas.add(Tarefa(id =  UUID.randomUUID(),nome = nome, descricao = descricao, estado = estado))
    println("===[Tarefa adicionada]===")
    menu()
}
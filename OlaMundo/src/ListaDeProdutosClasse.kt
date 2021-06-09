import classes.Produto

fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()) {
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade.")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto("arroz",35.10),
        Produto("feijão",5.50),
        Produto("carne",49.90),
        Produto("suco",1.10),
        Produto("batata",2.70)
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any { argumento -> argumento.equals(produto.nome, ignoreCase = true)}  }

    for(itemSelecionadoDisponivel in itensSelecionadosDisponiveis){
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    val itensSelecionadosNaoDisponiveis = argumentos.filter {
        argumento -> !itensDisponiveis.any { produto -> produto.nome.equals(argumento, ignoreCase = true) }
    }

    itensSelecionadosNaoDisponiveis.forEach { argumento -> println("Este produto nós nao temos: $argumento") }

    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira nossa lista de produtos: ${it.exibirDadosProduto()}") }
}
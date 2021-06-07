fun main(argumentos : Array<String>) {
    //validar se vieram produtos nos argumentos
    if(argumentos.isEmpty()){
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade.")
        return
    }

    //Lista de produtos do mercado
    val produtosDisponiveis = arrayOf("Pão", "Bolacha", "Queijo", "Arroz", "Feijão", "Ovo")

    //Verifica quais dos produtos requisitados estão na disponibilidade do mercado
    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado ->
                                          produtosDisponiveis.contains(produtoRequisitado)}

    //Exibe quais são os produtos disponiveis
    for(produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nós temos: $produtoRequisitadoDisponivel")
    }

    //Verifica quais produtos requisitados não estão na disponibilidade do mercado
    val produtosRequisitadosNaoDisponiveis = argumentos.filter { produtoRequisitado ->
                                            !produtosDisponiveis.contains(produtoRequisitado)}

    //Exibe quais são os produtos indisponiveis.
    for(produtoRequisitadoNaoDisponivel in produtosRequisitadosNaoDisponiveis){
        println("Este produto nós não temos: $produtoRequisitadoNaoDisponivel")
    }
    
    //Ordena os produtos disponiveis e exibe na tela.
    val produtosDisponiveisOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosDisponiveisOrdenados.forEach { produto -> println("Confira nossa lista de produtos disponiveis: $produto") }
}

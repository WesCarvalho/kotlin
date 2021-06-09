import classes.*

fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar os produtos a serem comprados.")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto("Tenis",220.0),
        Produto("Camiseta",39.90)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any { argumento -> it.nome.equals(argumento, ignoreCase = true) }
    }

    if(produtosSelecionados.isEmpty()){
        println("Os produtos selecionados não estão disponiveis.")
        return
    }

    println("Informe a forma de pagamento desejada(Boleto, Pix):")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank()){
        println("Favor informar uma forma de pagamento válida.")
    }

    val formaPagamento : FormaDePagamento = if(formaPagamentoSelecionada == (FormaPagamentoEnum.Pix.toString())){
        FormaPagamentoPix()
    }else if(formaPagamentoSelecionada == (FormaPagamentoEnum.Boleto.toString())){
        FormaPagamentoBoleto()
    }else {
        FormaDePagamento()
    }

    println("Seus produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProduto()) }
    formaPagamento.efetuarPagamento()
}
package classes

open class FormaDePagamento {
    open fun efetuarPagamento(): Unit {
        println("Não foi possivel processar o pagamento com a opção selecionada.")
    }
}

class FormaPagamentoPix: FormaDePagamento(){
    override fun efetuarPagamento() {
        println("Pagamento efetuado via Pix")
    }
}

class FormaPagamentoBoleto: FormaDePagamento(){
    override fun efetuarPagamento() {
        println("Pagamento efetuado via Boleto")
    }
}
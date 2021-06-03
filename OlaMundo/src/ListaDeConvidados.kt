fun main() {

    println("Favor informar o nome do usuário:")
    val nome = readLine()

    /* verifica se o nome informado está vazio, em branco ou nulo*/
    if(nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado não é válido.")
        return
    }

    println("Favor informar a idade do convidado:")
    //o ? serve como um atalho para continuar com a função toIntOrNull só se não retornar nulo.
    //converte o input para int ou null
    val idade = readLine()?.toIntOrNull()

    //validação da idade informada
    if(idade == null || idade <= 0){
        println("A idade informada não é válida.")
        return
    }

    //switch contendo a lista de convidados
    var estaConvidado = false
    when(nome){
        "Weslley" -> estaConvidado = true
        "Ana" -> estaConvidado = true
        "José" -> estaConvidado = true
        else -> estaConvidado = false
    }

    //verificação se o nome está na lista e se idade é maior que 18 anos
    if(estaConvidado && idade >= 18){
        println("Bem vindo à festa!")
    }else if(!estaConvidado){
        println("Você não foi convidado.")
    }else{
        println("Você não tem idade suficiente para entrar na festa.")
    }
}
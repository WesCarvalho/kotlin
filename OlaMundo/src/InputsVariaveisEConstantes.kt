fun main(argumentos : Array<String>) {

    /* validação se argumento foi informado ou não */
    if (argumentos.isEmpty()){
        println("Favor informar um argumento válido!")
        return
    }
    /* verifica se o argumento é um numero*/
    val numero = argumentos[0].toIntOrNull()
    if(numero == null){
        println("O valor informado não é um número válido!")
        return
    }

    println("O numero digitado foi: $numero")

    var soma = 0
    soma = numero + numero
    println("A soma do número + número é de: $soma")
}
import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) : BigDecimal {
    return when(operador){
        "+" -> primeiroNumero + segundoNumero
        "-" -> primeiroNumero - segundoNumero
        "*" -> primeiroNumero * segundoNumero
        "/" -> primeiroNumero / segundoNumero
        "%" -> primeiroNumero % segundoNumero
        else-> BigDecimal.ZERO
    }
}

fun main() {

    println("Digite o primeiro número:")
    val primeiroNumero = readLine()?.toBigDecimal()

    if(primeiroNumero == null){
        println("Primeiro numero informado não é válido")
        return
    }

    println("Digite um operador válido (+,-,*,/,%):")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != null && operador != "+" && operador != "-" && operador != "*"
                && operador != "/" && operador != "%")) {
        println("Operador inválido!")
        return
    }

    println("Digite o segundo número:")
    val segundoNumero = readLine()?.toBigDecimal()

    if(segundoNumero == null){
        println("Segundo numero informado não é válido")
        return
    }
    val resultado = calculaOperacao(primeiroNumero,operador,segundoNumero)
    println("O resultado da sua operação foi: $resultado")
}
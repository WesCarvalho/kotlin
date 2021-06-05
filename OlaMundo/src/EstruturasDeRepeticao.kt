fun main(argumentos : Array<String>) {

    //for subindo
    for(indice in argumentos.indices){
        println("Percorrendo os argumentos posição: $indice e valor ${argumentos[indice]}")
    }

    //for descendo
    for(indiceDescrescente in argumentos.size-1 downTo 0){
        println("Percorrendo os argumentos de forma decrescente: posição: $indiceDescrescente " +
                "e valor ${argumentos[indiceDescrescente]} ")
    }

    //for each
    for(argumento in argumentos){
        println("Percorrendo os argumentos: $argumento")
    }

    //while
    var contadorArgumentosLidos = 0
    while (contadorArgumentosLidos < argumentos.size){
        println("Percorrendo os argumentos lidos com while. Argumentos lidos: ${++contadorArgumentosLidos} e" +
                "valor lido: ${argumentos[contadorArgumentosLidos-1]}")
    }

    //do while
    var contadorLoops = 0
    do{
        println("Percorrendo os argumentos com do while. Total de loops: ${++contadorLoops} " +
                "e valor lido ${argumentos[contadorLoops-1]}")
    }while(contadorLoops < argumentos.size)
}
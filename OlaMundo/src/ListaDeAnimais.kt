import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

fun main() {
    //Ler o animal passado pelo usuario
    println("Favor informar qual animal você quer consultar:")
    val animalInformado = readLine()

    //Validar se o que foi passado está vazio, é nulo ou em branco
    if (animalInformado.isNullOrBlank() || animalInformado.isNullOrEmpty()) {
        println("Animal informado não é válido.")
        return
    }

    //Lista de animais disponiveis
    val listaAnimaisBancoDados = arrayOf(
        Peixe("Tubarão", qtdNadadeiras = 2),
        Mamifero("Leão",4),
        Ave("Gavião",500,true,true),
        Reptil("Serpente",8.0)
    )

    //Identificar o animal informado na base de dados
    val animalSelecionado = listaAnimaisBancoDados.find { it.nome.equals(animalInformado, ignoreCase = true) }
    if(animalSelecionado == null){
        println("Animal informado não está na base. Tente novamente.")
        return
    }

    //Exibir as informaçõesd o animal encontrado de acordo com sua classe.
    when(animalSelecionado){
        is Mamifero -> println("O animla selecionado é um mamifero e tem ${animalSelecionado.qtdMamas} mamas.")
        is Reptil -> println("O animal selecionado é um reptil e tem temperatura corporal = ${animalSelecionado.temperaturaCorporal}.")
        is Ave -> println("O animal selecionado é uma ave e tem ${animalSelecionado.qtdPenas} penas.")
        is Peixe -> println("O animal selecionado é um peixe e tem ${animalSelecionado.qtdNadadeiras} nadadeiras.")
        else -> println("Animal não está na base de dados.")
    }
}
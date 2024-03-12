class Produto{
    var nome: String
    var preco: Double

    constructor(){
        this.nome = "Produto"
        this.preco = 0.0
    }

    constructor(nome : String){
        this.nome = nome
        this.preco = 0.0
    }

    constructor(nome: String, preco: Double){
        this.nome = nome
        this.preco = preco
    }

    override fun toString(): String {
        return "Produto('$nome', R$$preco)"
    }
}

fun main() {
    var produto1 = Produto()
    println(produto1.toString())

    var produto2 = Produto("Geladeira")
    println(produto2.toString())

    var produto3 = Produto("Mesa de jantar", 1500.0)
    println(produto3.toString())
}
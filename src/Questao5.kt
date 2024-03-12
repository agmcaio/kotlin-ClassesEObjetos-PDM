import kotlin.io.path.fileVisitor

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field.replaceFirstChar{it.titlecaseChar()}
        set(value){
            field = value
        }
    var saldo: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                field = 0.0
            }
        }

    override fun toString(): String {
        return "ContaBancaria(numeroConta='$numeroConta', nomeTitular='$nomeTitular', saldo=$saldo)"
    }
    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão

    // Implemente override do setter para o atributo saldo conforme especificado na questão
}

fun main() {
    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
    val conta = ContaBancaria()
    conta.numeroConta = "123"
    conta.nomeTitular = "caio"
    conta.saldo = -100.0
    println(conta.toString())
}
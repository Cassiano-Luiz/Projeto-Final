class Estudantes (var primeiroNome: String?,
    var ultimoNome: String?,
    var ra: Int) {

    var nota = 0.0
    var ano = 0

    constructor(primeiroNome: String?,ultimoNome: String?,
                ra: Int, nota: Double): this (primeiroNome, ultimoNome, ra) {
        this.nota = nota
    }

    constructor(primeiroNome: String?, ultimoNome: String?,
    ra: Int, nota: Double, ano: Int): this(primeiroNome, ultimoNome, ra, nota) {
        this.ano = ano
    }

    fun nomeCompleto() {
    println("$primeiroNome + $ultimoNome")
    }
            val aprovado: Boolean
            get() {
                return nota >= 60
            }
        fun mudarAnoSeAprovado(): Int {
            if(aprovado) {
                ano += 1
                println("Parabéns, você foi aprovado!")
            }else {
                println("Você foi reprovado! E por isso não passará de ano!")
            }
                return 0
        }
    }

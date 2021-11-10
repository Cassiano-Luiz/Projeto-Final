class Curso (val nomeCurso: String?,
    var nomeProfessor: String?,
    var ano: Int) {

    val listaEStudantes = mutableListOf<Estudantes?>()

     fun mostrarEstudantes(){
        for(i in listaEStudantes){
            println(i?.primeiroNome)
        }
    }

    fun cadastrar(Student: Estudantes?) {
     listaEStudantes.add(Student)
    println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(students: Array<Estudantes?>?) {
        if (students != null) {
            for (i in students) {
                listaEStudantes.add(i)
            }
        }
        println("Estudantes cadastrados com sucesso!")
    }
    fun removerEstudante(student: Estudantes?) {
        if (listaEStudantes.contains(student)) {
            listaEStudantes.remove(student)
        println("Estudante foi removido com sucesso!")
    }else{
        println("Esse estudante não existe na lista")
       }
    }
    fun numEstudantesCadastrados(){
            println("O número de estudantes cadastrados no curso é" +
                    "${listaEStudantes.size}")
    }
    fun nota(){
        var nota =listaEStudantes [0]?.nota
        for (i in listaEStudantes){
            if(i?.nota!! > nota!!){
                 nota = i.nota

            }
        }
            println("A melhor nota desse curso é $nota")
     }
}



package model

interface Evaluation {
    fun getAverage() : Double
    fun getApprovedCursos(): List<Course>?
}
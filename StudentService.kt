package service

import model.Course
import model.Student
import java.util.HashMap

class StudentService {
    private val students: MutableMap<String?, Student> = HashMap()
    fun subscribeStudent(student: Student) {
        students[student.id] = student
    }

    fun findStudent(studentId: String?): Student? {
        return if (students.containsKey(studentId)) {
            students[studentId]
        } else null
    }

    fun isSubscribed(studentId: String?): Boolean {
        return studentId.containsKey(studentId)

    }

    fun showSummary() {
        println("Available Students:")
        for (key in students.keys) {
            val student = students[key]
        }

        fun enrollToCourse(studentId: String?, course: Course?) {
            if (students.containsKey(studentId)) {
                students[studentId]!!.enrollToCourse(course)
            }
        }
    }

    fun enrollToCourse(studentId: String?, course: Course) {
        TODO("Not yet implemented")
    }
}

private fun String?.containsKey(studentId: String?): Boolean {
    TODO("Not yet implemented")
}

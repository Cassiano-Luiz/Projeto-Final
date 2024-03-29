import model.Course
import utils.PrinterHelper.showMainMenu
import utils.PrinterHelper.createStudentMenu
import kotlin.Throws
import kotlin.jvm.JvmStatic
import service.StudentService
import service.CourseService
import java.text.ParseException
import java.util.*

object Main {
    @Throws(ParseException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val studentService = StudentService()
        val cursoService = CourseService()
        val scanner = Scanner(System.`in`)
        var option = 0
        do {
            showMainMenu()
            option = scanner.nextInt()
            when (option) {
                1 -> registerStudent(studentService, scanner)
                2 -> findStudent(studentService, scanner)
                3 -> enrollStudentToCourse(studentService, cursoService, scanner)
                4 -> showStudentsSummary(studentService, scanner)
                5 -> showCursosSummary(cursoService, scanner)
            }

        } while (option != 6)
    }

    private fun enrollStudentToCourse(
        studentService: StudentService, courseService: CourseService,
        scanner: Scanner
    ) {
        println("Insert student ID")
        val studentId = scanner.next()
        val student = studentService.findStudent(studentId)
        if (student == null) {
            println("Invalid Student ID")
            return
        }
        println(student)
        println("Insert course ID")
        val courseId = scanner.next()
        val course = courseService.getCourse(courseId)
        if (course == null) {
            println("Invalid Course ID")
            return
        }
        println(course)
        courseService.enrollStudent(courseId, student)
        studentService.enrollToCourse(studentId, course)
        println("Student with ID: $studentId enrolled successfully to $courseId")
    }

    private fun showCursosSummary(courseService: CourseService, scanner: Scanner) {
        courseService.showSummary()
    }

    private fun showStudentsSummary(studentService: StudentService, scanner: Scanner) {
        studentService.showSummary()
    }

    private fun findStudent(studentService: StudentService, scanner: Scanner) {
        println("Enter student ID: ")
        val studentId = scanner.next()
        val student = studentService.findStudent(studentId)
        if (student != null) {
            println("Student Found: ")
            println(student)
        } else {
            println("Student with Id = $studentId not found")
        }
    }

    @Throws(ParseException::class)
    private fun registerStudent(studentService: StudentService, scanner: Scanner) {
        val student = createStudentMenu(scanner)
        studentService.subscribeStudent(student)
    }


}
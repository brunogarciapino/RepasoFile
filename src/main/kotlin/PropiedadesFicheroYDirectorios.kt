import java.io.File
import java.util.*
import kotlin.jvm.JvmStatic

object E03PropiedadesFicheroYDirectorios {
    @JvmStatic
    fun main(args: Array<String>) {
        val documentos = readLine()
        val documento = File (documentos)
        println(documento.absolutePath)

        if (documento.exists()) {
            val milisegundos = documento.lastModified()
            val fecha = Date(milisegundos)
            println("Última modificación (ms)   : $milisegundos")
            println("Última modificación (fecha): $fecha") // lastModified: Dice la fecha en la q se modifico el archivo
            println("Tamaño del archivo: " + documento.length()) // length: Obtiene el tamaño del archivo
        }
        else
            println("No existe el documento.")
    }
}
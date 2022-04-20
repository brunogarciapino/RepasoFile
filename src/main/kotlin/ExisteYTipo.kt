import kotlin.jvm.JvmStatic
import java.io.File

object E01ExisteYTipo {
    @JvmStatic
    fun main(args: Array<String>) {
        val temp = File("./Temp")
        val fotos = File("./Temp/Fotos")
        val document = File("./Temp/Documento.txt")
        if(temp.exists()){
            println("El fichero existe")
        }else println("El fichero no existe")
    }

    }
    // isFile comprueba una ruta y devuelve true si existe
    // isDirectory: funciona como el anterior pero comprueba si es una carpeta
    // exists: devuelve true si existe
    // absolutePath devuelve la ruta absoluta de un archivo
    fun mostrarEstado(f: File) {
        println(f.absolutePath + " ¿archivo? " + f.isFile)
        println(f.absolutePath + " ¿carpeta? " + f.isDirectory)
    }

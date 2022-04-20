import java.io.File
import kotlin.jvm.JvmStatic

object E04CreaBorraDirectorios {
    @JvmStatic
    fun main(args: Array<String>) {
        val fotos = File("./Temp/Fotos")
        val doc = File("C:\\Users\\bruno\\IdeaProjects\\RepasoFile\\src\\main\\kotlin\\asi.txt")
        val mkdirFot: Boolean = fotos.mkdir()
        if (mkdirFot) {
            println("Creada carpeta " + fotos.getName()+ "? " + mkdirFot)
        } else {
            val delCa: Boolean = fotos.delete()
            println("Borrada carpeta " + fotos.getName() + "? " + delCa)
            val delAr: Boolean = doc.mkdir()
            println("Carpeta creado " + doc.getName()+ "? " + delAr)
        }
    }
}
// mkdir: permite crear una carpeta, indicando la ruta junto con el nombre de la carperta
// delete: borra el archivo o carpeta. Se podrá borrar una carpeta si está vacía.
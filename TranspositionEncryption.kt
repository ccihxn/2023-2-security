import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(BufferedWriter(OutputStreamWriter(System.out))) {
    val encKey = intArrayOf ( 2, 4, 5, 1, 3 )
    val decKey = getDecKey(encKey)
    write("암호화 키: " + encKey.contentToString())
    newLine()
    write("복호화 키: " + decKey.contentToString())
    close()
}

fun getDecKey(encKey: IntArray): IntArray {
    val decKey = IntArray (encKey.size)
    for (i in 0 until encKey.size) {
        decKey[ encKey[i] - 1 ] = i + 1
    }
    return decKey;
}

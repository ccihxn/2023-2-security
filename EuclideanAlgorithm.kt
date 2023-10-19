import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (r1, r2) = readLine().split(" ").map { it.toInt() }
    val gcd = gcd(r1, r2)
    w.write(gcd)
    w.close()
}

private fun gcd (a: Int, b: Int): String {
    var r1 = a
    var r2 = b
    var q: Int
    var r: Int
    var s1 = 1
    var s2 = 0
    var s: Int
    var t1 = 0
    var t2 = 1
    var t: Int
    while (r2 != 0) {
        q = r1 / r2
        r = r1 % r2
        s = s1 - (q * s2)
        t = t1 - (q * t2)
        r1 = r2
        r2 = r
        s1 = s2
        s2 = s
        t1 = t2
        t2 = t
    }
    if (r1 == 1) return "It`s haven`t gcd."
    return r1.toString()
}


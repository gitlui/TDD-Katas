import org.junit.Test
import kotlin.test.assertEquals

class PrimeFactorsTest {

    @Test
    fun factorialTests() {
        assertEquals(listOf(1), factorialsOf(1))
        assertEquals(listOf(2), factorialsOf(2))
        assertEquals(listOf(3), factorialsOf(3))
        assertEquals(listOf(2, 2), factorialsOf(4))
        assertEquals(listOf(5), factorialsOf(5))
        assertEquals(listOf(2, 3), factorialsOf(6))
        assertEquals(listOf(2, 2, 2), factorialsOf(8))
        assertEquals(listOf(3, 3), factorialsOf(9))
        assertEquals(listOf(3, 5), factorialsOf(15))
        assertEquals(listOf(3, 3, 3), factorialsOf(27))
        assertEquals(listOf(5, 5), factorialsOf(25))

        assertEquals(listOf(2, 3, 3, 5, 7, 13, 17), factorialsOf(2 * 3 * 3 * 5 * 7 * 13 * 17))
    }

    private fun factorialsOf(n: Int): List<Int> {
        if (n <= 1)
            return listOf(n)

        val factorials = ArrayList<Int>()
        var remaining = n
        for (divisor in 2..remaining)
            while (remaining % divisor == 0) {
                factorials.add(divisor)
                remaining /= divisor
            }

        return factorials
    }
}
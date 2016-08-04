package tests.logic_layer.unit

import game.logic_layer.unit.Nat
import org.junit.Assert.*
import org.junit.Test

/**
 * A test class for the nat class, mainly to test whether
 * the character of being always positive (starting by
 * 0) is always present.
 */
class NatTest {
    @Test(expected = IllegalArgumentException::class)
    fun natN1() {
        Nat(-1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun natNsomething() {
        Nat(-14342)
    }

    @Test
    fun toInt() {
        assertEquals(0, Nat(0).toInt())
        assertEquals(1, Nat(1).toInt())
        assertEquals(1320, Nat(1320.toInt()))
    }

    @Test
    fun toIntFalse() {
        assertNotEquals(12, Nat(123).toInt())
        assertNotEquals(549, Nat(15).toInt())
    }

    @Test
    fun comparance() {
        assertTrue(Nat(1) > Nat(0))
        assertTrue(Nat(0) < Nat(1))
        assertTrue(Nat(0) == Nat(0))
    }

    @Test
    fun comparanceFalse() {
        assertFalse(Nat(100) > Nat(101))
        assertFalse(Nat(15) < Nat(10))
        assertFalse(Nat(33) == Nat(3))
    }
}
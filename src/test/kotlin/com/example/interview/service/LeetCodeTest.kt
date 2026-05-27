package com.example.interview.service

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.LinkedList
import kotlin.test.assertEquals

class LeetCodeTest {
    private var leetCode: LeetCode = LeetCode()

    @Nested
    @DisplayName("addTwoNumbers")
    inner class AddTwoNumbers() {

        @Test
        fun `should return 7,0,8`() {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.
            val l1 = LinkedList<Int>().apply {
                add(2)
                add(4)
                add(3)
            }
            val l2 = LinkedList<Int>().apply {
                add(5)
                add(6)
                add(4)
            }
            val expected = LinkedList<Int>().apply {
                add(7)
                add(0)
                add(8)
            }
            val actual = leetCode.addTwoNumbers(l1, l2)
            assertEquals(expected.toString(), actual.toString())
        }

        @Test
        fun `should return 0`() {
        // Input: l1 = [0], l2 = [0]
        // Output: [0]
            val l1 = LinkedList<Int>().apply {
                add(0)
            }
            val l2 = LinkedList<Int>().apply {
                add(0)
            }
            val expected = LinkedList<Int>().apply {
                add(0)
            }
            val actual = leetCode.addTwoNumbers(l1, l2)
            assertEquals(expected.toString(), actual.toString())
        }

        @Test
        fun `should return 8,9,9,9,0,0,0,1`() {
            // Input: l1 = [0], l2 = [0]
            // Output: [0]
            val l1 = LinkedList<Int>().apply {
                add(9)
                add(9)
                add(9)
                add(9)
                add(9)
                add(9)
                add(9)
            }
            val l2 = LinkedList<Int>().apply {
                add(9)
                add(9)
                add(9)
                add(9)
            }
            // 8,9,9,9,0,0,0,1
            val expected = LinkedList<Int>().apply {
                add(8)
                add(9)
                add(9)
                add(9)
                add(0)
                add(0)
                add(0)
                add(1)
            }
            val actual = leetCode.addTwoNumbers(l1, l2)
            assertEquals(expected.toString(), actual.toString())
        }
    }
}

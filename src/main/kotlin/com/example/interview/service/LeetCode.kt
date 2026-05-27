package com.example.interview.service

import java.util.LinkedList
import kotlin.math.pow

class LeetCode {
    //    You are given two non-empty linked lists representing two non-negative integers.
    //    The digits are stored in reverse order, and each of their nodes contains a single digit.
    //    Add the two numbers and return the sum as a linked list.
    //    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    fun addTwoNumbers(l1: LinkedList<Int>, l2: LinkedList<Int>): LinkedList<Int> {
        // reverse list items
        val multipliedNums1 = multiplyNums(l1)
        val multipliedNums2 =  multiplyNums(l2)

        // sum each lists items
        val sum1 = multipliedNums1.sum()
        val sum2 = multipliedNums2.sum()
        // add sums
        val sum3 = sum1 + sum2
        // convert to string
        val digits = sum3.toString().map { it.digitToInt() }

        // return reverse ints
        return LinkedList<Int>(digits.reversed())
    }

    private fun multiplyNums(nums: LinkedList<Int>): LinkedList<Int> {
        nums.reverse()
        val base = 10.0
        for((index, num) in nums.withIndex()){
            val multiplier = base.pow(index).toInt()
            nums[index] = multiplier * num
        }
        return nums
    }
}

package com.example.authmodule.util

fun String.containsNumbers(): Boolean{
    val  regex = Regex(".*\\d+.*")  //at least one number
    return  regex.matches(this)
}

fun String.containsUpperCase(): Boolean{
    val regex = Regex(".*[A-Z]+.*") //at least one uppercase letter
    return regex.matches(this)
}

fun String.containsSpecialChar(): Boolean{
    val regex = Regex(".*[^A-Za-z\\d]+.*")  //Any character that is NOT a letter and NOT a number
    return regex.matches(this)
}
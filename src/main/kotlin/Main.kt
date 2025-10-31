package com.back

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("== 명언 앱 ==")

    while (true) {
        print("명령) ")
        val input = readln().trim()//readln()은 스캐너 역할, trim은 좌우공백 없애줌

        when(input) {
            "종료" -> {
                break
            }
            "등록" -> {
                print("명언: ")
                val content = readln().trim()
                print("작가: ")
                val author = readln().trim()
            }
        }
    }
}

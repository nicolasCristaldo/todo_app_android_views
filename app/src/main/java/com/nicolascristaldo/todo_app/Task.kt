package com.nicolascristaldo.todo_app

data class Task(
    val name: String,
    val category: TaskCategory,
    var isSelected: Boolean = false
) {
}
package com.main.todoapp.ui.todo_list

import com.main.todoapp.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodo(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
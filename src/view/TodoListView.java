package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        while (true) {
            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("x. Exit");

            var input = InputUtil.input("Select");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                deleteTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Options are not understood");
            }
        }
    }

    public void addTodoList() {
        System.out.println("ADD TODOLIST");

        var todo = InputUtil.input("Todo (x if cancel)");

        if (todo.equals("x")) {
            // batal
        } else {
            todoListService.addTodoList(todo);
        }
    }

    public void deleteTodoList() {
        System.out.println("DELETE TODOLIST");

        var number = InputUtil.input("The number to be deleted (x if cancel)");

        if (number.equals("x")) {
            // batal
        } else {
            todoListService.deleteTodoList(Integer.valueOf(number));
        }
    }

}

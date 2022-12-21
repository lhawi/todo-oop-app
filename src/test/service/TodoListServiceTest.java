package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {

        testDeleteTodoList();

    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Learn Java Fundamental");
        todoListRepository.data[1] = new TodoList("Learn Java OOP");
        todoListRepository.data[3] = new TodoList("Learn Java Generic");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Learn Java Fundamental");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Generic");

        todoListService.showTodoList();
    }

    public static void testDeleteTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Learn Java Fundamental");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Generic");

        todoListService.showTodoList();

        todoListService.deleteTodoList(5);
        todoListService.deleteTodoList(2);
        todoListService.showTodoList();
        todoListService.deleteTodoList(2);
        todoListService.showTodoList();
        todoListService.deleteTodoList(2);
        todoListService.showTodoList();
        todoListService.deleteTodoList(1);
        todoListService.showTodoList();
    }

}

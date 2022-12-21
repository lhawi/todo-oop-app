package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testDeleteTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Java Fundamental");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Generic");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();

        todoListService.showTodoList();

        todoListView.addTodoList();

        todoListService.showTodoList();
    }

    public static void testDeleteTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Java Fundamental");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Generic");

        todoListService.showTodoList();

        todoListView.deleteTodoList();

        todoListService.showTodoList();
    }
}

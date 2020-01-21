package study.mehmet.todoappwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "aaa", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "aaa", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "aaa", "Learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}

}

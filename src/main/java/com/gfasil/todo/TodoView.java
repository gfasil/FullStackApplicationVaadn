package com.gfasil.todo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;



@Route("")
public class TodoView extends VerticalLayout {

    private ToDORepository toDORepository;
    TextField todos = new TextField();
    Button addButton = new Button("Add");
    Button clearButton = new Button("clear");
    VerticalLayout list = new VerticalLayout();

    public TodoView(ToDORepository toDORepository) {
        this.toDORepository = toDORepository;
        add(new H1("hello world"),
                new HorizontalLayout(todos, addButton),
                list,
                clearButton);
        addButton.addClickListener(e->{
            toDORepository.save(new ToDO(todos.getValue()));
            todos.clear();
            todos.focus();
            refreshTodos();
        });
        addButton.addClickListener(e->{
            toDORepository.deleteByIsDone(true);

            refreshTodos();
        });
        refreshTodos();
    }

    private void refreshTodos() {
        list.removeAll();
        toDORepository.findAll().
                stream().
                map(ToDOLayout::new).
                forEach(list::add);
    }


}

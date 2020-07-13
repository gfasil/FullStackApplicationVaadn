package com.gfasil.todo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class TodoView extends VerticalLayout {

    public TodoView(){
        add(new H1("hello world"));
    }
}

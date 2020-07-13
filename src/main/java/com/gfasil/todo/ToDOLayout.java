package com.gfasil.todo;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class ToDOLayout extends HorizontalLayout {
    Checkbox done=new Checkbox();
    TextField task = new TextField();
    private ToDORepository toDORepository;

    public ToDOLayout(ToDO toDO
    ) {

        add(done,task);
        setDefaultVerticalComponentAlignment(Alignment.CENTER);
        Binder<ToDO> binder=  new Binder<>(ToDO.class);
        binder.bindInstanceFields(this);
        binder.setBean(toDO);

        binder.addValueChangeListener(e->{
            toDORepository.save(binder.getBean());
        });
    }
    public ToDOLayout(ToDORepository toDORepository){
        this.toDORepository = toDORepository;
    }
}
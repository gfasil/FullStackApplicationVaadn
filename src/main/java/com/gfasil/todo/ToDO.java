package com.gfasil.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String task;
    private Boolean isDone;
    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }



    public ToDO(String task){
        this.task=task;
    }
    public ToDO( ){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}

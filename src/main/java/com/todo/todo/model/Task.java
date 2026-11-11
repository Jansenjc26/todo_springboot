package com.todo.todo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private boolean completed;

   

    public Task() {
        // this.id=id;
        // this.title=title;
        // this.description=des;
        // this.completed=completed;
         
    }

    //getters------------------------------ 

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return completed;
    }

    



    //setters------------------------------

    // public void setId(long id){
    //     this.id=id;
    // }

    public void setTitle(String title){
        this.title=title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setCompleted(boolean competed){
        this.completed=competed;
    }
   
}

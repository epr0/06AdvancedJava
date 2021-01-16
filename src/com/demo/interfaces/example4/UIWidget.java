package com.demo.interfaces.example4;
//interface segregation principle
//divide to smaller interfaces
public interface UIWidget extends Draggable, Resizable {
    void render();//renderable
}

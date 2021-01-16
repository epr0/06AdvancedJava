package com.demo.interfaces.example4;

public class Dragger {

    void drag(UIWidget widget) {
        widget.drag();
        widget.render();
        widget.resize(5);
    }
}

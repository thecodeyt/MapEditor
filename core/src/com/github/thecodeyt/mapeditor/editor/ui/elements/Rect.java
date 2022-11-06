package com.github.thecodeyt.mapeditor.editor.ui.elements;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import com.github.thecodeyt.mapeditor.editor.ui.UI;

public class Rect extends UIElement {
    public Vector2 position;
    public Vector2 size;
    public Color color;

    public Rect(UI ui, Vector2 position, Vector2 size, Color color) {
        super(ui);
        this.position = position;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw() {
        draw(color);
    }
    public void draw(Color color) {
        if(!isPresent(this.ui.camera.shapeRenderer)) {
            return;
        }

        this.ui.camera.shapeRenderer.setColor(color);
        this.ui.camera.shapeRenderer.rect(position.x, position.y, size.x, size.y);
    }
}

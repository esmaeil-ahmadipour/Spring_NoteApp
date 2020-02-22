package ir.arcademy.notes.modules.note.model;

import ir.arcademy.notes.modules.note.domain.Category;

import java.util.List;

public class CategoryResponse {
    private List<Category> data;

    public CategoryResponse(List<Category> data) {
        this.data = data;
    }

    public List<Category> getData() {
        return data;
    }

    public void setData(List<Category> data) {
        this.data = data;
    }
}

package ir.arcademy.notes.modules.note.model;

import ir.arcademy.notes.modules.note.domain.Note;

import java.util.List;

public class NoteResponse {
    private List<Note> data;

    public NoteResponse(List<Note> data) {
        this.data = data;
    }

    public List<Note> getData() {
        return data;
    }

    public void setData(List<Note> data) {
        this.data = data;
    }
}

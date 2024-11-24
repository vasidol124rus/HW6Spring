package com.example.demo.services;

import com.example.demo.models.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Note note);
    void deleteNote(Long id);
}

package com.example.demo.services;

import com.example.demo.models.Note;
import com.example.demo.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImp implements NoteService{
    private final NoteRepository noteRepository;

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Note updateNote(Note note) {
        Note noteById = getNoteById(note.getId());
        noteById.setTitle(note.getTitle());
        noteById.setContent(note.getContent());
        noteById.setCreatedDate(note.getCreatedDate());
        return noteRepository.save(noteById);
    }

    @Override
    public void deleteNote(Long id) {
        Note noteByID = getNoteById(id);
        noteRepository.delete(noteByID);
    }
}
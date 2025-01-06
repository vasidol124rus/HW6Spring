package com.example.demo.repositories;

import com.example.demo.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с сущностью заметки.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
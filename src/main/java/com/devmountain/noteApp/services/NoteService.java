package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteNyId(Long noteId);

    //Updating a Note
    @Transactional
    void updatedNoteById(NoteDto noteDto);

    //Getting all notes by user
    List<NoteDto> getAllNotesByUserId(Long userId);

    // Getting note by note Id
    Optional<NoteDto> getNoteById(Long noteId);
}

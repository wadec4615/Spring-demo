package com.wade.demo.bootrest.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wade.demo.bootrest.sql.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
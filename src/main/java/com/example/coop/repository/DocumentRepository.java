package com.example.coop.repository;

import com.example.coop.model.DocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentModel,Long> {
}

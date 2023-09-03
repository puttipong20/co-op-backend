package com.example.coop.repository;

import com.example.coop.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyModel,Long> {
}

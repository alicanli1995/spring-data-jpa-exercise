package com.example.singletable.repository;

import com.example.singletable.model.ArtPiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends JpaRepository<ArtPiece, Long> {
}
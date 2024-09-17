package com.practise.local.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.local.model.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

	Optional<ImageData> findByName(String fileName);
}

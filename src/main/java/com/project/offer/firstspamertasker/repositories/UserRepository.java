package com.project.offer.firstspamertasker.repositories;


import com.project.offer.firstspamertasker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

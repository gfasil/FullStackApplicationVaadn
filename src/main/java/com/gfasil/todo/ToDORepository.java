package com.gfasil.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDORepository extends JpaRepository<Long,ToDO> {
}

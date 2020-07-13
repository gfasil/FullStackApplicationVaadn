package com.gfasil.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ToDORepository extends JpaRepository<ToDO,Long> {
    @Transactional
    void deleteByIsDone(boolean b);
}

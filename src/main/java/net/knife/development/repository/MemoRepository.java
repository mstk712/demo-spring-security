package net.knife.development.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.knife.development.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}

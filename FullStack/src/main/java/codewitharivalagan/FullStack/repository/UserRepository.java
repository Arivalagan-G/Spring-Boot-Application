package codewitharivalagan.FullStack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codewitharivalagan.FullStack.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

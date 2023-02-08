package com.jojodu.book.spirngboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    // findByEmail 소셜 로그인으로 반환 값중 이메일을 통해 이미 생성된 사용자인지 첫가입자인지 판단하기 위한 메소드
    Optional<User> findByEmail(String email); 

}

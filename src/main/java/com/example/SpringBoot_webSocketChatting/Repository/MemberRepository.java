package com.example.SpringBoot_webSocketChatting.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_webSocketChatting.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	
	Optional<Member> findById(String id); 
	
}

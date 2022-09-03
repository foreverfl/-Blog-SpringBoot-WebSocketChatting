package com.example.SpringBoot_webSocketChatting.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_webSocketChatting.Entity.Member;
import com.example.SpringBoot_webSocketChatting.Repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	public void save(Member member) {
		memberRepository.save(member);
	}
	
	public Optional<Member> findById(String id) {
		return memberRepository.findById(id);
	}
}

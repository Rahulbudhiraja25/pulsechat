package com.pulsechat.pulseSer.repository;

import com.pulsechat.pulseSer.model.Chat;
import com.pulsechat.pulseSer.model.ChatMember;
import com.pulsechat.pulseSer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChatMemberRepository extends JpaRepository<ChatMember, Long> {

    List<ChatMember> findByUser(User user);

    List<ChatMember> findByChat(Chat chat);

    Optional<ChatMember> findByChatAndUser(Chat chat, User user);

}
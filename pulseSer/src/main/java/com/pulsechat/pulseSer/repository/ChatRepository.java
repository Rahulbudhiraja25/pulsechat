package com.pulsechat.pulseSer.repository;

import com.pulsechat.pulseSer.model.Chat;
import com.pulsechat.pulseSer.model.ChatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat, Long> {

    List<Chat> findByType(ChatType type);

}
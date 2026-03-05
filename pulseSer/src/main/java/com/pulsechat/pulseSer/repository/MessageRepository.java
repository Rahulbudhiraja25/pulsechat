package com.pulsechat.pulseSer.repository;

import com.pulsechat.pulseSer.model.Chat;
import com.pulsechat.pulseSer.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findByChatOrderByCreatedAtAsc(Chat chat);

}
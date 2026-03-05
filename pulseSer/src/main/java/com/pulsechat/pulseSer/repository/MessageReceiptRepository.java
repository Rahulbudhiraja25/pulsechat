package com.pulsechat.pulseSer.repository;

import com.pulsechat.pulseSer.model.Message;
import com.pulsechat.pulseSer.model.MessageReceipt;
import com.pulsechat.pulseSer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageReceiptRepository extends JpaRepository<MessageReceipt, Long> {

    List<MessageReceipt> findByMessage(Message message);

    List<MessageReceipt> findByUser(User user);

}
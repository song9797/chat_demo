package selab.gyuwon.testchat.service;

import lombok.RequiredArgsConstructor;
import selab.gyuwon.testchat.dto.ChatDTO;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RedisPublisher {

    private final RedisTemplate<String, Object> redisTemplate;

    public void publish(ChannelTopic topic, ChatDTO message) {
        redisTemplate.convertAndSend(topic.getTopic(), message);
    }
}
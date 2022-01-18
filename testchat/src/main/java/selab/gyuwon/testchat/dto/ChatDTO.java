package selab.gyuwon.testchat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDTO {
    public enum MessageType{
        ENTER, TALK
    }
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}

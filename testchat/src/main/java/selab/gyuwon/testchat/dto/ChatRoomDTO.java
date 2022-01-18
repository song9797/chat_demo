package selab.gyuwon.testchat.dto;

import java.io.Serializable;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoomDTO implements Serializable {
    private static final long serialVersionUID = 6494678977089006639L;
    private String roomId;
    private String name;

    public static ChatRoomDTO create(String name){
        ChatRoomDTO chatRoomDTO = new ChatRoomDTO();
        chatRoomDTO.roomId = UUID.randomUUID().toString();
        chatRoomDTO.name = name;
        return chatRoomDTO;
    }
}

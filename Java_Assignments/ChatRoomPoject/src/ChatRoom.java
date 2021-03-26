import java.util.ArrayList;

public class ChatRoom {

    private String chatroomName;
    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    private boolean chatRoomStatus;
    private boolean userLoginStatus;

    public boolean isUserLoginStatus() {
        return userLoginStatus;
    }

    public void setUserLoginStatus(boolean userLoginStatus) {
        this.userLoginStatus = userLoginStatus;
    }

    public void login(String name){
        System.out.println(name+" Logged IN !");
    }

    public boolean isChatRoomStatus() {
        return chatRoomStatus;
    }

    public void setChatRoomStatus(boolean chatRoomStatus) {
        this.chatRoomStatus = chatRoomStatus;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public ChatRoom(String chatroomName) {
        this.chatroomName = chatroomName;
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public void setChatroomName(String chatroomName) {
        this.chatroomName = chatroomName;
    }

    @Override
    public String toString() {
        return "ChatRoom{" +
                "users=" + users +
                '}';
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ChatRoomMethods {
    public Scanner sc = new Scanner(System.in);
    //ArrayList<ArrayList> cl = new ArrayList<>();
    ArrayList<ChatRoom> cl = new ArrayList<>();
    //ArrayList<String> users = new ArrayList<>();

    public void createChatRoom() {
        System.out.println("Enter name: ");
        String n = sc.nextLine();
        cl.add(new ChatRoom(n));
        System.out.println("ChatRoom Created ! ");
    }

    public void addUser() {
        System.out.println("Enter ChatRoom name: \n");
        String cn = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter user name: ");
        String un = sc.nextLine();
        if (cl.isEmpty()) {
            System.out.println("No Chat Rooms present");
        } else
            for (ChatRoom e : cl) {
                if (e.getChatroomName().equalsIgnoreCase(cn)) {
                    System.out.println("ChatRoom Available");
                    e.users.add(un);
                    System.out.println("User Added !");
                }
            }
    }
//remove for main ***********


    public void userLogin(){
        System.out.println("Enter ChatRoom name: \n");
        String cn = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter user name: ");
        String un = sc.nextLine();
        for (ChatRoom e: cl) {
            if ((e.getChatroomName().equalsIgnoreCase(cn))) {
                System.out.println("Welcome to: "+e.getChatroomName());
                int index = e.users.indexOf(un);
                if(e.users.isEmpty()){
                    System.out.println("No users present !");
                } else if(un.equalsIgnoreCase(e.users.get(index))){
                    e.login(un);
                    System.out.println("Logged in !");
                    e.setUserLoginStatus(true);
                    e.setChatRoomStatus(true);
                }
            }
        }
    }

    public void sendMessage(){
        userLogin();
        System.out.println("Enter Message: ");
        String msg = sc.nextLine();
        for(ChatRoom c: cl){
            if(c.isChatRoomStatus() && c.isUserLoginStatus()){
                System.out.println(c.getChatroomName()+" is active !");
                c.messages.add(msg);
                System.out.println("Message added.");
            }
        }
   }

   public void displayMessagesOfChatroom(){
       userLogin();
       System.out.println("Enter ChatRoom name for MESSAGES: \n");
       String cn = sc.nextLine();
       for (ChatRoom c: cl) {
           if(c.getChatroomName().equalsIgnoreCase(cn) && c.isChatRoomStatus()){
               System.out.println(c.getMessages());
           }
       }
   }

   public void logout(){
       for (ChatRoom c:cl) {
           if(c.isUserLoginStatus()){
               System.out.println("Logged out !");
               c.setUserLoginStatus(false);
           }
       }
   }

   public void listChatrooms(){
       for (ChatRoom c: cl) {
           System.out.println(c.getChatroomName());
       }
   }

   public void deleteChatRoom(){
       System.out.println("Enter Chatroom Name to DELETE: ");
       String cn = sc.nextLine();
       for (ChatRoom c: cl) {
           if(c.getChatroomName().equalsIgnoreCase(cn)){
               cl.remove(c);
               System.out.println(c.getChatroomName() + "Deleted !!");
           } else
                System.out.println(c.getChatroomName() + "Not Available");
       }
   }

   public void deleteUser(){
       System.out.println("Enter ChatRoom name: \n");
       String cn = sc.nextLine();
       sc.nextLine();
       System.out.println("Enter user name: ");
       String un = sc.nextLine();
       for (ChatRoom c: cl) {
           int index = c.users.indexOf(un);
           if(c.users.get(index).equalsIgnoreCase(un)){
               c.users.remove(index);
           }
       }
   }
}

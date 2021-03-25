import java.util.Scanner;

public class MainOptions {

    public static void main(String[] args) {

        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        ChatRoomMethods cm = new ChatRoomMethods();

        while(!quit){
            System.out.println("1. Create a ChatRoom \n 2. Add the User \n3. User login\n 4.Send a message \n 5. Display the messages from a specific chatroom\n 6. List down all users belonging to the specified chatroom.\n 7. Logout\n 8. Delete an user.\n 9. Delete the chatRoom\n 10. QUIT APPLICATION");
            System.out.println("Select an option: ");
            int option = sc.nextInt();
            sc.hasNextLine();

            switch (option){
                case 1:
                    cm.createChatRoom();
                    break;

                case 2:
                    cm.addUser();
                    break;

                case 3:
                    cm.userLogin();
                    break;

               case 4:
                    cm.sendMessage();
                    break;

               case 5:
                    cm.displayMessagesOfChatroom();
                   break;

                case 6:
                    cm.listChatrooms();
                    break;

                case 7:
                    cm.logout();
                    break;

                case 8:
                    cm.deleteUser();
                    break;

                case 9:
                    cm.deleteChatRoom();
                    break;

               case 10:
                   quit = true;
           }
       }
    }
}

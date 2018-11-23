import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.impl.JidCreate;

public class Main {
    public static void main(String [] args)
    {
        System.out.println("SMACK version "+ SmackConfiguration.getVersion());
        try{
            XMPPTCPConnectionConfiguration connectionConfiguration=XMPPTCPConnectionConfiguration.builder()
                    .setUsernameAndPassword("smacktutorialuser","mypassword")
                    .setXmppDomain("smacktutorial.com")
                    .setKeystoreType(null)
                    .build();
            XMPPTCPConnection connection= new XMPPTCPConnection(connectionConfiguration);
            connection.connect().login();
            connection.addConnectionListener(new ConnectionListener() {
                @Override
                public void connected(XMPPConnection connection) {

                }

                @Override
                public void authenticated(XMPPConnection connection, boolean resumed) {
                    //sending and receiving
                    try {
                        ChatManager chatManager=ChatManager.getInstanceFor(connection);
                        //chat
                        EntityBareJid girlsJid= JidCreate.entityBareFrom("prettylady@smacktutorial.com");
                        Message lovemessage=new Message(girlsJid,Message.Type.chat);
                        lovemessage.setBody("I love you");
                        Chat chat=chatManager.chatWith(girlsJid);
                        chat.send(lovemessage);
                        chatManager.addIncomingListener(new IncomingChatMessageListener() {
                            @Override
                            public void newIncomingMessage(EntityBareJid from, Message message, Chat chat) {
                                System.out.println("Incomming Message from "+from.asEntityBareJidString()+": "+message.getBody());
                            }
                        });
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }

                @Override
                public void connectionClosed() {

                }

                @Override
                public void connectionClosedOnError(Exception e) {

                }

                @Override
                public void reconnectionSuccessful() {

                }

                @Override
                public void reconnectingIn(int seconds) {

                }

                @Override
                public void reconnectionFailed(Exception e) {

                }
            });

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

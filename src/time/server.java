
package time;
import java.net.*;
import java.io.*;
import java.util.*;
class server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5217);


        while(true)
        {

            Socket soc=s.accept();
            DataInputStream input = new DataInputStream(soc.getInputStream());
            DataOutputStream output=new DataOutputStream(soc.getOutputStream());
            System.out.println("connected");
            output.writeBytes("Server Date: " + (new Date()).toString() + "\n");
            output.close();
            soc.close();
        }
    }
}

/**
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket server = new ServerSocket(4999);
            Socket client = server.accept();
            clientwritesoource.writeUTF("connected");

                LocalTime myObj = LocalTime.now();
                clientwritesoource.writeUTF(String.valueOf(myObj));
            }else {clientwritesoource.writeUTF("bye");}


        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}**/
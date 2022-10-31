package time;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class client
{
    public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket(InetAddress.getLocalHost(),5217);
        DataInputStream input = new DataInputStream(soc.getInputStream());
        DataOutputStream output=new DataOutputStream(soc.getOutputStream());
        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()  ));
        System.out.println(in.readLine());
    }
}
/**
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalTime;
public class client {
    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 4999);
            DataInputStream serverreadsoource = new DataInputStream(server.getInputStream());
            DataOutputStream serverwritesoource = new DataOutputStream(server.getOutputStream());
            String str = "";
            LocalTime myObj = LocalTime.now();
            System.out.println(myObj);

            str = serverreadsoource.readUTF();
            System.out.println(str);
            str = serverreadsoource.readUTF();
            System.out.println(str);

            str=serverreadsoource.readUTF();
            if(str.equalsIgnoreCase("yes")){
            System.out.println(str);}
            else {System.out.println(str);}

        }catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
**/
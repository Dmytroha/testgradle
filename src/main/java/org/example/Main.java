package org.example;
import org.example.dto.FullName;
import com.google.gson.Gson;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {


        String jsonFullName = (new Gson()).toJson(new FullName("Dmytro", "Milovanov"));

        out.println(jsonFullName);


    }
}
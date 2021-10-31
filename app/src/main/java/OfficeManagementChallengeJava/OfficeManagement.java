package OfficeManagementChallengeJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class OfficeManagement {

    static ArrayList<String> meetingRooms = new ArrayList<String>();

    static void addRoom(String name) {
        meetingRooms.add(name);
    }

    static void listOfRooms() {
        Enumeration<String> enumeration = Collections.enumeration(meetingRooms);
        System.out.println("Available Meeting rooms: ");
        while (enumeration.hasMoreElements()) {
            String meetingRooms = enumeration.nextElement();
            String line = String.format(" * %s", meetingRooms);
            System.out.println(line);
        }

    }

    public static void main(String[] args) {

        addRoom("Test1");
        addRoom("Test2");
        listOfRooms();
    }
}
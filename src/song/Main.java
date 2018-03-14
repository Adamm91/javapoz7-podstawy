package song;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song[] playlist = new Song[10];
        int index = 0;
        int answer;
        do {
            menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    showPlaylist(playlist);
                    break;
                case 2:
                    index = addTrack(playlist, index);
                    break;
                case 3:
                    deleteTrack(playlist, scanner);
                    scanner.nextLine();
                    break;
            }
        } while (answer != 0);


    }

    private static void deleteTrack(Song [] playlist, Scanner scanner) {
        System.out.println("Podaj numer indexu ktory chcesz usunac");
        int index = scanner.nextInt();
        playlist[index - 1] = null;
        for (int i = index - 1; i < playlist.length - 1; i++) {
           playlist[i] = playlist [i + 1];
        }
    }

    public static void menuView() {
        System.out.println("1. Show playlist");
        System.out.println("2. Add track");
        System.out.println("3. Delete track");
        System.out.println("0. Exit");
    }

    public static void showPlaylist (Song[] playlist) {
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                System.out.print((i + 1) + ". ");
                System.out.println(playlist[i]);
            }
         }
    }

    public static int addTrack (Song [] playlist, int nextIndex) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert title");
        String title = scanner.nextLine();
        System.out.println("Insert artist");
        String artist = scanner.nextLine();
        Song song = new Song(title, artist);
        playlist[nextIndex] = song;
        return nextIndex + 1;
    }




}

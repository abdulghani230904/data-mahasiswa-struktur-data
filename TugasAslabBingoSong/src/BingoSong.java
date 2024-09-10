public class BingoSong {
    private String name;
    private String[] letters;
    
    // Konstruktor untuk inisialisasi nama dan huruf
    public BingoSong(String name, String[] letters) {
        this.name = name;
        this.letters = letters;
    }
    
    // Method untuk menampilkan lirik lagu
    public void printSong() {
        printVerse(letters.length);
        
        for (int i = 0; i < letters.length; i++) {
            printVerse(i + 1);
        }
    }

    private void printVerse(int clapIndex) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + name + " was his name-o.");
        
        for (int i = 0; i < letters.length; i++) {
            if (i < clapIndex) {
                System.out.print("(clap)-");
            } else {
                System.out.print(letters[i] + "-");
            }
        }
        System.out.println();
        
        for (int i = 0; i < letters.length; i++) {
            if (i < clapIndex) {
                System.out.print("(clap)-");
            } else {
                System.out.print(letters[i] + "-");
            }
        }
        System.out.println();
        
        for (int i = 0; i < letters.length; i++) {
            if (i < clapIndex) {
                System.out.print("(clap)-");
            } else {
                System.out.print(letters[i] + "-");
            }
        }
        System.out.println();
        
        System.out.println("And " + name + " was his name-o.");
    }
    
    public static void main(String[] args) {
        String name = "Bingo";
        String[] letters = {"B", "I", "N", "G", "O"};
        
        BingoSong song = new BingoSong(name, letters);
        song.printSong();
    }
}

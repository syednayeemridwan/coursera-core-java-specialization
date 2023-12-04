import java.util.Date;

public class InventoryDriver {
    public static void main(String[] args) {
        Item myInventory[] = new Item[50];
        myInventory[0] = new Book("Godzilla on Holiday", 24.95, 5, "Wesley Wynham-Price", "Ransom House", "FICTION");
        myInventory[1] = new Book("Loch Ness Memories", 49.95, 1, "Fred MacMurray", "Penquin Press", "FICTION");
        myInventory[2] = new Book("MVS JCL", 89.95, 3, "Steve Balmer", "Microsoft Press", "NON-FICTION");
        myInventory[3] = new Book("Lingo in a Nutshell", 19.95, 8, "Bill Gates", "O'Really", "NON-FICTION");
        myInventory[4] = new Book("Grid Computing", 79.95, 2, "Bobby Beowold", "Trouser Press", "NON-FICTION");
        Artist artist1 = new Artist("YES");
        myInventory[5] = new CD("Going For The One", 12.95, 4, artist1, new Date("07/07/1977"));
        Artist artist2 = new Artist("Bozos");
        myInventory[6] = new CD("Going Down The Country", 12.95, 10, artist2, new Date("09/07/1987"));
        Artist artist3 = new Artist("Jimmy and the Yuppers");
        myInventory[7] = new CD("Polka Favorites", 2.95, 4, artist3, new Date("07/07/1955"));

        String[] performers1 = { "Henry", "Elizabeth", "Franz", "Arthur" };
        myInventory[8] = new ClassicalCD("Romeo and Juliet", 22.95, 1, "Joe Green", "New York", new Date("01/01/2001"), performers1)
        String[] performers2 = { "Vivaldi", "Johnson", "Arturo", "Wenselous" };
        myInventory[9] = new ClassicalCD("A Ramp in the Park", 22.95, 3, "Bethoven", "Hamburg", new Date("01/01/2001"), performers2)
        Inventory.produceReport(myInventory);
    }
}

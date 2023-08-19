package Homework13;

public class Main {
    public static void main(String[] args) {
        Author writer = new Author("Лев", "Толстой");
        System.out.println("Имя - " + writer.getName());
        System.out.println("Фамилия - " + writer.getSurname());
        System.out.println(writer.equals(0));
        System.out.println(writer);

        Author writer2 = new Author("Федор", "Достоевский");
        System.out.println("Имя - " + writer2.getName());
        System.out.println("Фамилия - " + writer2.getSurname());
        System.out.println(writer2.equals(0));
        System.out.println(writer2);

        System.out.println("**************************************");

        Book warAndPeace = new Book("Война и мир", writer,1867);
        System.out.println("Название - " + warAndPeace.getBookName());
        System.out.println("Автор - " + writer.getName() + " " + writer.getSurname());
        System.out.println("Год - " + warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(1900);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        System.out.println(warAndPeace.equals(0));
        System.out.println(warAndPeace);

        Book crimeAndPunishment = new Book("Преступление и наказание",
                writer2, 1866);
        System.out.println("Название - " + crimeAndPunishment.getBookName());
        System.out.println("Автор - " + writer2.getName() + " " + writer2.getSurname());
        System.out.println("Год - " + crimeAndPunishment.getPublicationYear());
        warAndPeace.setPublicationYear(1901);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        System.out.println(crimeAndPunishment.equals(0));
        System.out.println(crimeAndPunishment);

    }

}

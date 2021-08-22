package school.lesson1;

public class PhoneBookTest {
        public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.add("Smith","777-77-77");
        pb.add("Simpson","333-33-33");
        pb.add("Smith","999-99-99");

        pb.get("Simpson");
        pb.get("Smith");

}

}

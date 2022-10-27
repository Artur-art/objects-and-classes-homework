public class Main {
    public static void main(String[] args) {
        Book juOnTheGrudge = new Book("Ju on the grudge",2006);
        Author TakashiShimizu = new Author("Takashi","Shimizu");
        System.out.println(juOnTheGrudge);
        System.out.println("автор книги " + TakashiShimizu);
        juOnTheGrudge.setYearsOfRelease(2008);
        System.out.println(juOnTheGrudge);

    }


}
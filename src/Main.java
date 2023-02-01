public class Main {
    public static void main(String[] args) {
        /*
        Stwórz zmieną text z trzykrotnie powtórzonym łańcuchem
        znaków "Ola ma kota".
        Zamień wszystkie wystąpienia "Ola" na "Kasia"
        Dodatkowo zamień pierwsze wystąpnienie "Kasia" na "Monika".
        Końcowy tekst zaprezentuj w konsoli.
        Znajdź indeks pierwszego wystąpienia "Kasia" i podaj go w konsoli.
        Znajdź ostatni indeks "Kasia" i również wypisz go w konsoli.
        Wyświetl fragment tekstu od pierwszego wystąpienia "Kasia" do końca łańcucha.
         */
        String str = "Ola ma kota. ";
        System.out.println(str);
        String str1 = str.repeat(3); //Ola ma kota. Ola ma kota. Ola ma kota.
        System.out.println(str1);
        String str2 = str1.replace("Ola", "Kasia"); //Kasia ma kota. Kasia ma kota. Kasia ma kota.
        System.out.println(str2);
        String str3 = str2.replaceFirst("Kasia", "Monika"); //Monika ma kota. Kasia ma kota. Kasia ma kota.
        System.out.println(str3);
        int indexKasiaFirst = str3.indexOf("Kasia"); //16
        System.out.println(indexKasiaFirst);
        int indexKasiaLast = str3.lastIndexOf("Kasia");
        System.out.println(indexKasiaLast); //31
        String strFragment = str3.substring(str3.indexOf("Kasia"));
        System.out.println(strFragment); //Kasia ma kota. Kasia ma kota.

    }
}

package dojorefactoring;

public class Perimeter {
    public static Iterable<String> GetPerimeter()
    {
        //FIXME : ne prendre en compte que les sousjacents commenšant par un C
        return AllUnderlyings.getAll();
    }
}

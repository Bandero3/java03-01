package daytwo;

public class Vaisius {
    public void whatAmI(){
        System.out.println("As esu vaisius");
    }
}

class EgzotinisVaisius extends Vaisius{
    @Override
    public void whatAmI(){
        System.out.println("As esu EgzotinisVaisius");
    }
}

class LietuviskasVaisius extends Vaisius{
    @Override
    public void whatAmI(){
        System.out.println("As esu LietuviskasVaisius");
    }
}
class Ananasas extends EgzotinisVaisius{
    @Override
    public void whatAmI(){
        System.out.println("As esu Ananasas");
    }
}
class Mangas extends EgzotinisVaisius{
    @Override
    public void whatAmI(){
        System.out.println("As esu Mangas");
    }
}

class Kriause extends LietuviskasVaisius{
    @Override
    public void whatAmI(){
        System.out.println("As esu Kriause");
    }
}

class Obuolys extends LietuviskasVaisius{
//
}

class Alyvinis extends Obuolys{
    @Override
    public void whatAmI(){
        System.out.println("As esu Alyvinis");
    }
}
class Antaninis extends Obuolys {
    @Override
    public void whatAmI(){
        System.out.println("As esu Antaninis");
    }
}
package Chess;

public abstract class ChessPiece {
    //строковая переменная color — цвет;
    //логическая переменная check, по умолчанию true, она понадобится нам сильно позже;

    String color;
    boolean check = true;


    public ChessPiece ( String color) {
        this.color = color;
    }

    //абстрактный метод getColor(), возвращающий строку — должен вернуть цвет фигуры;
    public abstract String getColor();

    //абстрактный метод canMoveToPosition(), возвращающий логическое
    //(boolean) значение и паринимающий в себя параметры
    //ChessBoard chessBoard, int line, int column, int toLine, int toColumn;
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    //абстрактный метод getSymbol(), возвращающий строку — тип фигуры.
    public  abstract String getSymbol();


}
//        Задача 1
//        Для начала напишем абстрактный класс ChessPiece (шахматная фигура), у которой должны быть следующие перемененные:
//        //логическая переменная check, по умолчанию true, она понадобится нам сильно позже;
//        //конструктор, принимающий в себя строковую переменную color.
//        // следующие публичные (public) методы:
//        //абстрактный метод getColor(), возвращающий строку — должен вернуть цвет фигуры;
//        //абстрактный метод canMoveToPosition(), возвращающий логическое
//        //(boolean) значение и паринимающий в себя параметры
//        //ChessBoard chessBoard, int line, int column, int toLine, int toColumn;
//        //абстрактный метод getSymbol(), возвращающий строку — тип фигуры.
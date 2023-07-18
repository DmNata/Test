package Chess;

public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    //Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
    @Override
    public String getColor() {
        return  String.valueOf(getColor().equals("R"));
    }

    //Реализуйте метод canMoveToPosition() так, чтобы ладья не могла выйти за доску
    //(доска в нашем случае — это двумерный массив размером 8 на 8,
    //напоминаем, что индексы начинаются с 0) и мог ходить только по прямой,
    //также фигура не может сходить в точку, в которой она сейчас находится.
    //сли ладья может пройти от точки (line, column) до точки (toLine, toColumn)
    //по всем правилам (указанным выше), то функция вернет true, иначе — false.
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return false;
    }

    //Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае ладья — R.
    @Override
    public String getSymbol() {
        return  String.valueOf(getSymbol().equals("R"));
    }
}
//        Задача 5
//        Аналогично предыдущим фигурам создайте класс Rook (ладья).
//        В классе Rook:
//        //Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
//        //Реализуйте метод canMoveToPosition() так, чтобы ладья не могла выйти за доску
//        //(доска в нашем случае — это двумерный массив размером 8 на 8,
//        //напоминаем, что индексы начинаются с 0) и мог ходить только по прямой,
//        //также фигура не может сходить в точку, в которой она сейчас находится.
//        //сли ладья может пройти от точки (line, column) до точки (toLine, toColumn)
//        //по всем правилам (указанным выше), то функция вернет true, иначе — false.
//        Также вы можете добавить и свои методы для удобства.
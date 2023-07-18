package Chess;

public class ChessBoard {
    public ChessPiece[][] board = new ChessPiece[8][8]; // creating a field for game
    String nowPlayer;

    public ChessBoard(String nowPlayer) {
        this.nowPlayer = nowPlayer;
    }

    public String nowPlayerColor() {
        return this.nowPlayer;
    }

    //Теперь модернизируйте метод moveToPosition(класс ChessBoard) так,
    //чтобы после первого хода ладей и королей их переменные check становились false, так мы сможем отслеживать возможность рокировки.
    public boolean moveToPosition(int startLine, int startColumn, int endLine, int endColumn) {
        if (checkPos(startLine) && checkPos(startColumn)) {

            if (!nowPlayer.equals(board[startLine][startColumn].getColor())) return false;

            if (board[startLine][startColumn].canMoveToPosition(this, startLine, startColumn, endLine, endColumn)) {
                board[endLine][endColumn] = board[startLine][startColumn]; // if piece can move, we moved a piece
                // если фигура может двигаться, мы передвинули фигуру
                board[startLine][startColumn] = null; // set null to previous cell установить null в предыдущую ячейку
                this.nowPlayer = this.nowPlayerColor().equals("White") ? "Black" : "White";

                return true;
            } else return false;
        } else return false;
    }

    public void printBoard() {  //print board in console
        System.out.println("Turn " + nowPlayer);
        System.out.println();
        System.out.println("Player 2(Black)");
        System.out.println();
        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");

        for (int i = 7; i > -1; i--) {
            System.out.print(i + "\t");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".." + "\t");
                } else {
                    System.out.print(board[i][j].getSymbol() + board[i][j].getColor().substring(0, 1).toLowerCase() + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("Player 1(White)");
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public boolean castling0() {
        if (nowPlayer.equals("White")) {
            if (board[0][0] == null || board[0][4] == null) return false;
            if (board[0][0].getSymbol().equals("R") && board[0][4].getSymbol().equals("K") && // check that King and Rook король и ладья проверить
                    board[0][1] == null && board[0][2] == null && board[0][3] == null) {              // never moved никогда не двигался
                if (board[0][0].getColor().equals("White") && board[0][4].getColor().equals("White") &&
                        board[0][0].check && board[0][4].check &&
                        !new King("White").isUnderAttack(this, 0, 2)) { // check that position not in under attack
                    //проверить, что позиция не находится под атакой
                    board[0][4] = null;
                    board[0][2] = new King("White");   // move King двигаться король
                    board[0][2].check = false;
                    board[0][0] = null;
                    board[0][3] = new Rook("White");   // move Rook
                    board[0][3].check = false;
                    nowPlayer = "Black";  // next turn следующий ход
                    return true;
                } else return false;
            } else return false;
        } else {
            if (board[7][0] == null || board[7][4] == null)
                return false; // check that King and Rook проверить, что король и ладья
            if (board[7][0].getSymbol().equals("R") && board[7][4].getSymbol().equals("K") && //
                    board[7][1] == null && board[7][2] == null && board[7][3] == null) {              // never moved
                if (board[7][0].getColor().equals("Black") && board[7][4].getColor().equals("Black") &&
                        board[7][0].check && board[7][4].check &&
                        !new King("Black").isUnderAttack(this, 7, 2)) { // check that position not in under attack
                    board[7][4] = null;
                    board[7][2] = new King("Black");   // move King
                    board[7][2].check = false;
                    board[7][0] = null;
                    board[7][3] = new Rook("Black");   // move Rook
                    board[7][3].check = false;
                    nowPlayer = "White";  // next turn
                    return true;
                } else return false;
            } else return false;
        }
        //В классе ChessBoard создайте метод boolean castling7() (аналогично castling0).
        //Если во время хода белого игрока вызывается метод castling7(), то надо проверить,
        //возможна ли рокировка белого короля с ладьей, стоящей в 7 столбце, и если возможна,
        //то совершить рокировку. Если рокировку пытается совершить игрок, играющий черными фигурами, то наши действия аналогичны.


        public boolean castling7() {
            if (nowPlayer.equals("White")) {
                if (board[0][0] == null || board[0][7] == null) return false;
                if (board[0][0].getSymbol().equals("R") && board[0][7].getSymbol().equals("K") && // check that King and Rook король и ладья проверить
                        board[0][1] == null && board[0][2] == null && board[0][3] == null) {              // never moved никогда не двигался
                    if (board[0][0].getColor().equals("White") && board[0][4].getColor().equals("White") &&
                            board[0][0].check && board[0][4].check &&
                            !new King("White").isUnderAttack(this, 0, 2)) { // check that position not in under attack
                        //проверить, что позиция не находится под атакой
                        board[0][4] = null;
                        board[0][2] = new King("White");   // move King двигаться король
                        board[0][2].check = false;
                        board[0][0] = null;
                        board[0][3] = new Rook("White");   // move Rook
                        board[0][3].check = false;
                        nowPlayer = "Black";  // next turn следующий ход
                        return true;
                    } else return false;
                } else return false;
            } else {
                if (board[7][0] == null || board[7][4] == null)
                    return false; // check that King and Rook проверить, что король и ладья
                if (board[7][0].getSymbol().equals("R") && board[7][4].getSymbol().equals("K") && //
                        board[7][1] == null && board[7][2] == null && board[7][3] == null) {              // never moved
                    if (board[7][0].getColor().equals("Black") && board[7][4].getColor().equals("Black") &&
                            board[7][0].check && board[7][4].check &&
                            !new King("Black").isUnderAttack(this, 7, 2)) { // check that position not in under attack
                        board[7][4] = null;
                        board[7][2] = new King("Black");   // move King
                        board[7][2].check = false;
                        board[7][0] = null;
                        board[7][3] = new Rook("Black");   // move Rook
                        board[7][3].check = false;
                        nowPlayer = "White";  // next turn
                        return true;
                    } else return false;
                } else return false;
            }
        }
    }

    public boolean castling7() {
        return  false;
    }
}


        //В классе ChessBoard создайте метод boolean castling7() (аналогично castling0).
        //Если во время хода белого игрока вызывается метод castling7(), то надо проверит
        // возможна ли рокировка белого короля с ладьей, стоящей в 7 столбце, и если возможна,
        //то совершить рокировку. Если рокировку пытается совершить игрок, играющий черными фигурами, то наши действия аналогичны.
        //В этот раз сдайте все написанные вами классы: все классы фигур, ChessPiece и ChessBoard с методом castling7 в Codeboard.


//        Задача 2
//        Вам предоставлен класс ChessBoard (этот класс сдавайте в каждую последующую задачу, как и ChessPiece).
//        В нём есть:
//        Поле board, которое представляет собой двумерный массив объектов шахматных фигур.
//        Переменная nowPlayer, которая показывает, чей сейчас ход.
//        Конструктор и метод nowPlayerColor (на самом деле хорошо бы сделать
//        переменную nowPlayer приватной, но для удобства пусть будет, как есть).
//        Метод moveToPosition, который передвигает фигуры, можете поподробнее посмотреть, что же там происходит.
//        Метод printBoard, который просто красиво печатает шахматное поле в консоль.
//        Этот класс понадобится вам позже, но осуществлять проверку написанного вами кода легче через него.

//        Задача 7
//        Теперь реализуем рокировку.
//        Рокировка возможна, если ни король, ни ладья ни разу не двигались, и между ними все поля свободны.
//        Помните, в самом начале мы создали поле check? Теперь оно поможет нам отследить, двигались ли фигуры или нет.
//        //Теперь модернизируйте метод moveToPosition(класс ChessBoard) так,
//        //чтобы после первого хода ладей и королей их переменные check становились false, так мы сможем отслеживать возможность рокировки.
//        Метод castling0(), находящийся в классе ChessBoard, отвечает за рокировку по 0 линии (в Codeboard этот метод уже добавлен):
//        В классе ChessBoard создайте метод boolean castling7() (аналогично castling0).
//        Если во время хода белого игрока вызывается метод castling7(), то надо проверить,
//        возможна ли рокировка белого короля с ладьей, стоящей в 7 столбце, и если возможна,
//        то совершить рокировку. Если рокировку пытается совершить игрок, играющий черными фигурами, то наши действия аналогичны.
//        В этот раз сдайте все написанные вами классы: все классы фигур, ChessPiece и ChessBoard с методом castling7 в Codeboard.

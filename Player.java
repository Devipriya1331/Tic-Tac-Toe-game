import java.util.Scanner;
import java.util.Random;

public abstract class Player
{
    String name;
    char mark;

    Player(String name, char mark)
    {
        this.name = name;
        this.mark = mark;
    }

    abstract void makeMove() throws Exception;

    boolean isValidMove(int row, int col)
    {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2)
        {
            if(TicTacToegame.board[row][col] == ' ')
            {
                return true;
            }
        }

        return false;
    }


    // Human class

    static class Human extends Player
    {
        static Scanner sc = new Scanner(System.in);

        Human(String name, char mark)
        {
            super(name, mark);
        }

        void makeMove()
        {
            int row, col;

            do
            {
                System.out.print("\t\t\tEnter row: ");
                row = sc.nextInt();

                System.out.print("\t\t\tEnter Column: ");
                col = sc.nextInt();

                if(!isValidMove(row, col))
                {
                    System.out.println("\t\t\tInvalid move. Try again.");
                }

            } while(!isValidMove(row, col));

            TicTacToegame.placeMark(row, col, mark);
        }
    }


    // AI class

    static class AI extends Player
    {
        AI(String name, char mark)
        {
            super(name, mark);
        }

        void makeMove() throws Exception
        {
            System.out.println("\t\t\tWait for AI's Move");

            Thread.sleep(3000);

            int row, col;
            
            Random random = new Random();

            do
            {
                row = random.nextInt(3);
                col = random.nextInt(3);

            } while(!isValidMove(row, col));

            TicTacToegame.placeMark(row, col, mark);
        }
    }
}

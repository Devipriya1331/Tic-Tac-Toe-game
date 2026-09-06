public class Launchgame
{
    public static void main(String[] args) throws Exception
    {
        TicTacToegame t = new TicTacToegame();

        t.displayBoard();

        Player.Human p1 = new Player.Human("Player1", 'X');

        Player.AI p2 = new Player.AI("AI", 'O');

        Player pc = p1;

        while(true)
        {
            System.out.println("\t\t\tIt's " + pc.name + "'s move");

            pc.makeMove();

            t.displayBoard();

            if(t.checkColWin() || t.checkDiagonalWin() || t.checkRowWin())
            {
                System.out.println("\t\t\t" + pc.name + " wins");
                break;
            }
            else if(t.checkForDraw())
            {
                System.out.println("\t\t\tMatch is draw");
                break;
            }
            else
            {
                if(pc == p1)
                {
                    pc = p2;
                }
                else
                {
                    pc = p1;
                }
            }
        }
    }
}

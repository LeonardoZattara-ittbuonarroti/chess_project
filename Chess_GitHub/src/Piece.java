public interface Piece {
    public void move(int x, int y);
    public String checkMoves(String[][] board);
    public String currentPosition();
}

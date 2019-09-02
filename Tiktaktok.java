package tiktaktok;

import java.util.Scanner;
import java.util.Arrays;

public class Tiktaktok {


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.printf("Player 1's sign is 1 %nPlayer 2's sign is 0 %n");
        int cl;
            int board[][] = new int[3][3];
            board[0][0] = 11;
            board[0][1] = 12;
            board[0][2] = 13;
            board[1][0] = 21;
            board[1][1] = 22;
            board[1][2] = 23;
            board[2][0] = 31;
            board[2][1] = 32;
            board[2][2] = 33;
        for(int i = 2; i<11;i++){
            System.out.println(Arrays.deepToString(board));
            Scanner sc = new Scanner(System.in);
            if (i%2 == 0){
                System.out.println("Player 1 please enter the box");
                cl = sc.nextInt();
                switch(cl){
                    case 11:
                        if(board[0][0] == 0 || board[0][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][0] = 1;
                        }break;
                    case 12:
                        if(board[0][1] == 0 || board[0][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][1] = 1;
                        }break;
                    case 13:
                        if(board[0][2] == 0 || board[0][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][2] = 1;
                        }break;
                    case 21:
                        if(board[1][0] == 0 || board[1][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][0] = 1;
                        }break;
                    case 22:
                        if(board[1][1] == 0 || board[1][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][1] = 1;
                        }break;
                    case 23:
                        if(board[1][2] == 0 || board[1][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][2] = 1;
                        }break;
                    case 31:
                        if(board[2][0] == 0 || board[2][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][0] = 1;
                        }break;
                    case 32:
                        if(board[2][1] == 0 || board[2][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][1] = 1;
                        }break;
                    case 33:
                        if(board[2][2] == 0 || board[2][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][2] = 1;
                        }
                }
            }else{
                System.out.println("Player 2 please enter the box");
                cl = sc.nextInt();
                switch(cl){
                    case 11:
                        if(board[0][0] == 0 || board[0][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][0] = 0;
                        }break;
                    case 12:
                        if(board[0][1] == 0 || board[0][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][1] = 0;
                        }break;
                    case 13:
                        if(board[0][2] == 0 || board[0][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[0][2] = 0;
                        }break;
                    case 21:
                        if(board[1][0] == 0 || board[1][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][0] = 0;
                        }break;
                    case 22:
                        if(board[1][1] == 0 || board[1][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][1] = 0;
                        }break;
                    case 23:
                        if(board[1][2] == 0 || board[1][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[1][2] = 0;
                        }break;
                    case 31:
                        if(board[2][0] == 0 || board[2][0] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][0] = 0;
                        }break;
                    case 32:
                        if(board[2][1] == 0 || board[2][1] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][1] = 0;
                        }break;
                    case 33:
                        if(board[2][2] == 0 || board[2][2] == 1){
                            System.out.println("Cell no." +cl+ " is taken");
                            i--;
                        }else{
                        board[2][2] = 0;
                        }
                }
            }
            if (board[0][0] ==board[0][1] && board[0][1]==board[0][2]){
                if(board[0][0] == 1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }else if (board[1][0]==board[1][1] && board[1][1]== board[1][2]){
                if(board[1][0]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }else if (board[2][0]== board[2][1] && board[2][1]==board[2][2]){
                if(board[2][0]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }
            else if (board[0][0]==board[1][0] && board[1][1]==board[2][0]){
                if(board[0][0]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }else if (board[0][1]==board[1][1] && board[1][1]==board[2][1]){
                if(board[0][1]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }else if (board[0][2]==board[1][2] && board[1][2]==board[2][2]){
                if(board[0][2]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
            }else if (board[0][0]==board[1][1] && board[1][1]==board[2][2]){
                if(board[0][0]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                }System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;
        }else if (board[0][2]==board[1][1] && board[1][1]==board[2][0]){
                if(board[0][2]==1){
                    System.out.println("Player 1 wins");
                    System.out.println(Arrays.deepToString(board));
                    break;
                }else{
                System.out.println("Player 2 wins");
                System.out.println(Arrays.deepToString(board));
                break;}
            }
}
        System.out.println("no one wins");
        System.out.println(Arrays.deepToString(board));
}
}

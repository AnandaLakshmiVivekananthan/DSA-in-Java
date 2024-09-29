package interviewquestions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class NQueenProblem {
	public static void main(String[] args) {
		int nxn = 5;
		int king_x = 0, king_y = 4;
//		int numberOfQueen = 2;
		int[][] queenPos = {{3, 3}, {1, 3}};
		boolean isSafe = isCellSafe(nxn, king_x, king_y, queenPos);
		if (isSafe)
			System.out.println("YES +++ cell:(" + king_x + " , " + king_y + ")");
		else {
			int[][] possibleMoves = {{king_x - 1, king_y - 1},
					{king_x - 1, king_y},
					{king_x - 1, king_y + 1},
					{king_x, king_y - 1},
					{king_x, king_y},
					{king_x, king_y + 1},
					{king_x + 1, king_y - 1},
					{king_x + 1, king_y},
					{king_x + 1, king_y + 1}};
			for (int i = 0; i < possibleMoves.length; i++) {
				isSafe = isCellSafe(nxn, possibleMoves[i][0], possibleMoves[i][1], queenPos);
				if (isSafe) {
					System.out.println("YES cell:(" + possibleMoves[i][0] + " , " + possibleMoves[i][1] + ")");
					return;
				}
			}
			System.out.println("NO");

		}
	}

	private static boolean isCellSafe(int n, int kingX, int kingY, int[][] queenPos) {
		if (n < 3) return false;
		boolean rowFlag = isRowSafe(kingX, queenPos);
		boolean columnFlag = isColumnSafe(kingY, queenPos);
		boolean leftDiagonalFlag = isLeftDiagonalSafe(n, kingX, kingY, queenPos);
		boolean rightDiagonalFlag = isRightDiagonalSafe(n, kingX, kingY, queenPos);
		return rowFlag && columnFlag && leftDiagonalFlag && rightDiagonalFlag;
	}

	private static boolean isRightDiagonalSafe(int n, int kingX, int kingY, int[][] queenPos) {
		int lowerX = kingX + 1, lowerY = kingY - 1, upperX = kingX + 1, upperY = kingY + 1;
		for (int i = 0; i < queenPos.length; i++) {
			while (lowerX >= 0 && lowerY < n) {
				if (lowerX == queenPos[i][0] && lowerY == queenPos[i][1])
					return false;
				lowerX--;
				lowerY++;
			}
			while (upperX < n && upperY >= 0) {
				if (upperX == queenPos[i][0] && upperY == queenPos[i][1])
					return false;
				upperX++;
				upperY--;
			}
		}
		return true;
	}

	private static boolean isLeftDiagonalSafe(int n, int kingX, int kingY, int[][] queenPos) {
		int lowerX = kingX - 1, lowerY = kingY - 1, upperX = kingX + 1, upperY = kingY + 1;
		for (int i = 0; i < queenPos.length; i++) {
			while (lowerX >= 0 && lowerY >= 0) {
				if (lowerX == queenPos[i][0] && lowerY == queenPos[i][1])
					return false;
				lowerX--;
				lowerY--;
			}
			while (upperX < n && upperY < n) {
				if (upperX == queenPos[i][0] && upperY == queenPos[i][1])
					return false;
				upperX++;
				upperY++;
			}
		}
		return true;
	}

	private static boolean isColumnSafe(int kingY, int[][] queenPos) {
		for (int i = 0; i < queenPos.length; i++) {
			if (queenPos[i][1] == kingY)
				return false;
		}
		return true;
	}

	private static boolean isRowSafe(int kingX, int[][] queenPos) {
		for (int i = 0; i < queenPos.length; i++) {
			if (queenPos[i][0] == kingX)
				return false;
		}
		return true;
	}

}
